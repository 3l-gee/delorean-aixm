package org.jvnet.hyperjaxb.xml.bind.annotation.adapters;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.xml.namespace.QName;
import org.jvnet.hyperjaxb.item.Converter;

import com.github.javaparser.resolution.types.ResolvedWildcard.BoundType;

/*
 * This code is adapted from the HYPERJAXB project.
 * Original source: https://github.com/highsource/jaxb-tools
 * 
	Copyright (c) 2021-2023, Matt Pavlovich.
	Copyright (c) 2005-2021, Alexey Valikov.

	All rights reserved.

	Redistribution and use in source and binary forms, with or without
	modification, are permitted provided that the following conditions are met:

	* Redistributions of source code must retain the above copyright notice, this
	list of conditions and the following disclaimer.

	* Redistributions in binary form must reproduce the above copyright notice,
	this list of conditions and the following disclaimer in the documentation
	and/or other materials provided with the distribution.

	THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
	AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
	IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
	DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
	FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
	DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
	SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
	CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
	OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
	OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

	The views and conclusions contained in the software and documentation are those
	of the authors and should not be interpreted as representing official policies,
	either expressed or implied, of the FreeBSD Project.

	Modifications License
	==========================================
	Modifications Copyright (c) 2025, Raphaël Gerth / Delorean-AIXM
	Licensed under the GNU General Public License, version 3 (GPLv3).
	See: https://www.gnu.org/licenses/gpl-3.0.html
	
	This code has been modified from the original hyperjaxb code to accommodate spcific 
	AIXM nilreason usecases. The modifications are distributed under the GPLv3. 
	You must retain both this GPLv3 notice and the original BSD license notice.
 * 
 * 
 */

public class XmlAdapterUtils
{
	public static <I, O> Converter<I, O> getConverter(Class<? extends XmlAdapter<O, I>> xmlAdapterClass)
	{
		return asConverter(getXmlAdapter(xmlAdapterClass));
	}

	public static <I, O> Converter<I, O> asConverter(XmlAdapter<O, I> adapter)
	{
		return new XmlAdapterConverter<I, O>(adapter);
	}

	public static <ValueType, BoundType> ValueType marshall(
		Class<? extends XmlAdapter<ValueType, BoundType>> xmlAdapterClass, BoundType v)
	{
		try
		{
			final XmlAdapter<ValueType, BoundType> xmlAdapter = getXmlAdapter(xmlAdapterClass);
			return xmlAdapter.marshal(v);
		}
		catch (Exception ex)
		{
			throw new RuntimeException(ex);
		}
	}

	public static <ValueType, BoundType> BoundType unmarshall(
		Class<? extends XmlAdapter<ValueType, BoundType>> xmlAdapterClass, ValueType v)
	{
		try
		{
			final XmlAdapter<ValueType, BoundType> xmlAdapter = getXmlAdapter(xmlAdapterClass);
			return xmlAdapter.unmarshal(v);
		}
		catch (Exception ex)
		{
			throw new RuntimeException(ex);
		}
	}

	public static <ValueType, BoundType> XmlAdapter<ValueType, BoundType> getXmlAdapter(
		Class<? extends XmlAdapter<ValueType, BoundType>> xmlAdapterClass)
	{
		try
		{
			final XmlAdapter<ValueType, BoundType> xmlAdapter = xmlAdapterClass.getDeclaredConstructor().newInstance();
			return xmlAdapter;
		}
		catch (IllegalAccessException | InstantiationException | IllegalArgumentException | InvocationTargetException
			| NoSuchMethodException | SecurityException iaex)
		{
			throw new RuntimeException(iaex);
		}
	}

	public static <ValueType, BoundType> ValueType unmarshallJAXBElement(
		Class<? extends XmlAdapter<BoundType, ValueType>> xmlAdapterClass, JAXBElement<? extends BoundType> v)
	{
		try
		{
			if (v == null)
				return null;
			else
			{
				final XmlAdapter<BoundType, ValueType> xmlAdapter = getXmlAdapter(xmlAdapterClass);
				return xmlAdapter.unmarshal(v.getValue());
			}
		}
		catch (Exception ex)
		{
			throw new RuntimeException(ex);
		}
	}

	public static <BoundType> BoundType unmarshallJAXBElement(JAXBElement<? extends BoundType> v)
	{
		if (v == null)
			return null;
		else
			return v.getValue();
	}

	public static <ValueType, BoundType> ValueType unmarshallSource(Class<? extends XmlAdapter<BoundType, ValueType>> xmlAdapterClass, Class<BoundType> declaredType, Object source){
		ValueType declaredInstance = null;
		try
		{
			if ( (declaredType != null) && (source != null) )
			{
				XmlAdapter<BoundType, ValueType> xmlAdapter = getXmlAdapter(xmlAdapterClass);
	    		if ( JAXBElement.class.isInstance(source) )
	    		{
	    			@SuppressWarnings("unchecked")
					JAXBElement<BoundType> element = (JAXBElement<BoundType>) source;
	    			if ( declaredType.isInstance(element.getValue()) )
	    			{
						declaredInstance = xmlAdapter.unmarshal(element.getValue());
	    			}
	    		}
	    		else if ( declaredType.isInstance(source) )
	    			declaredInstance = xmlAdapter.unmarshal(declaredType.cast(source));
			}
		}
		catch (Exception ex)
		{
			throw new RuntimeException(ex);
		}
    	return declaredInstance;
	}

	public static <BoundType> BoundType unmarshallSource(Class<BoundType> declaredType, Object source){
		BoundType declaredInstance = null;
    	if ( (declaredType != null) && (source != null) )
    	{
    		if ( JAXBElement.class.isInstance(source) )
    		{
    			@SuppressWarnings("unchecked")
				JAXBElement<BoundType> element = (JAXBElement<BoundType>) source;
        		if ( declaredType.isInstance(element.getValue()) )
        			declaredInstance = declaredType.cast(element.getValue());
    		}
    		else if ( declaredType.isInstance(source) )
    			declaredInstance = declaredType.cast(source);
    	}
    	return declaredInstance;
	}
	
	public static <BoundType> boolean isJAXBElement(Class<BoundType> declaredType, QName name, Class<?> scope,
		Object value)
	{
		if (value == null)
			return false;
		else if (value instanceof JAXBElement)
		{
			final JAXBElement<?> element = (JAXBElement<?>) value;
			return element.getName().equals(name) && declaredType.isAssignableFrom(element.getDeclaredType());
		}
		else
			return false;
	}

	public static <ValueType, BoundType> JAXBElement<BoundType> marshallJAXBElement(
		Class<? extends XmlAdapter<BoundType, ValueType>> xmlAdapterClass, Class<BoundType> declaredType, QName name,
		Class<?> scope, ValueType v)
	{
		try
		{	
			// Case 1 — object itself is null → null
			if (v == null) {
				return null;
			}

			// Case 2 — value wrapper exists; inspect its internal value + nilReason
			Object value;
			String nilReason;

			try {
				value = v.getClass().getMethod("getValue").invoke(v);
				nilReason = (String) v.getClass().getMethod("getNilReason").invoke(v);
			} catch (NoSuchMethodException e) {
				// it wasn't a AXIM field wrapper after all; just return the value as-is
				final XmlAdapter<BoundType, ValueType> xmlAdapter = getXmlAdapter(xmlAdapterClass);
				return new JAXBElement<BoundType>(name, declaredType, scope, xmlAdapter.marshal(v));
			} catch (Exception e) {
				throw new RuntimeException("Failed to access value/nilReason", e);
			}

			// Normalize value for String type
			if (value == null) {
				// do nothing
			} else if (value.getClass() == java.lang.String.class) {
				value = (value == null || ((String) value).isEmpty() || value == "") ? null : value;
			}	

			// Case 2A — normal value
			if (value != null && nilReason == null) {
				final XmlAdapter<BoundType, ValueType> xmlAdapter = getXmlAdapter(xmlAdapterClass);
				return new JAXBElement<BoundType>(name, declaredType, scope, xmlAdapter.marshal(v));
			}

			// Case 2B — nilReason present → xsi:nil="true"
			if (value == null && nilReason != null) {
				final XmlAdapter<BoundType, ValueType> xmlAdapter = getXmlAdapter(xmlAdapterClass);
				JAXBElement<BoundType> jaxb = new JAXBElement<>(name, declaredType, scope, xmlAdapter.marshal(v));
				jaxb.setNil(true);
				return jaxb;
			}

			// Case 2C — illegal state
			System.out.println("Warning: Illegal combination: value=" + value + ", nilReason=" + nilReason + "for : " + v.getClass().getName());
			final XmlAdapter<BoundType, ValueType> xmlAdapter = getXmlAdapter(xmlAdapterClass);
			return new JAXBElement<BoundType>(name, declaredType, scope, xmlAdapter.marshal(v));
			//
			// throw new IllegalStateException(
			// 	"Illegal combination: value=" + value + ", nilReason=" + nilReason);

		}
		catch (Exception ex)
		{
			throw new RuntimeException(ex);
		}
	}

	public static <BoundType> JAXBElement<BoundType> marshallJAXBElement(Class<BoundType> declaredType, QName name, Class<?> scope, BoundType v){
		// Case 1 — object itself is null → null
		if (v == null) {
			return null;
		}

		// Case 2 — value wrapper exists; inspect its internal value + nilReason
		Object value;
		String nilReason;

		try {
			value = v.getClass().getMethod("getValue").invoke(v);
			nilReason = (String) v.getClass().getMethod("getNilReason").invoke(v);
		} catch (NoSuchMethodException e) {
			// it wasn't a AXIM field wrapper after all; just return the value as-is
			return new JAXBElement<>(name, declaredType, scope, v);
		} catch (Exception e) {
			throw new RuntimeException("Failed to access value/nilReason", e);
		}

		// Normalize value for String type
		if (value == null) {
			// do nothing
		} else if (value.getClass() == java.lang.String.class) {
			value = (value == null || ((String) value).isEmpty() || value == "") ? null : value;
		}

		// Case 2A — normal value
		if (value != null && nilReason == null) {
			return new JAXBElement<>(name, declaredType, scope, v);
		}

		// Case 2B — nilReason present → xsi:nil="true"
		if (value == null && nilReason != null) {
			JAXBElement<BoundType> jaxb = new JAXBElement<>(name, declaredType, scope, v);
			jaxb.setNil(true);
			return jaxb;
		}

		// Case 2C — illegal state
		System.out.println("Warning: Illegal combination: value=" + value + ", nilReason=" + nilReason + "for : " + v.getClass().getName());
		return new JAXBElement<>(name, declaredType, scope, v);
		//
		// throw new IllegalStateException(
		// 	"Illegal combination: value=" + value + ", nilReason=" + nilReason);
	}
}
