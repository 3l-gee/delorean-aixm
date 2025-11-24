
package com.aixm.delorean.core.org.gml.v_3_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.basicjaxb.lang.Equals;
import org.jvnet.basicjaxb.lang.EqualsStrategy;
import org.jvnet.basicjaxb.lang.HashCode;
import org.jvnet.basicjaxb.lang.HashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBEqualsStrategy;
import org.jvnet.basicjaxb.lang.JAXBHashCodeStrategy;
import org.jvnet.basicjaxb.lang.JAXBToStringStrategy;
import org.jvnet.basicjaxb.lang.ToString;
import org.jvnet.basicjaxb.lang.ToStringStrategy;
import org.jvnet.basicjaxb.locator.DefaultRootObjectLocator;
import org.jvnet.basicjaxb.locator.ObjectLocator;
import org.jvnet.basicjaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for AbstractGriddedSurfaceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractGriddedSurfaceType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractParametricCurveSurfaceType">
 *       <sequence>
 *         <group ref="{http://www.opengis.net/gml/3.2}PointGrid"/>
 *       </sequence>
 *       <attribute name="rows" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="columns" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGriddedSurfaceType", propOrder = {
    "pointGridRows"
})
@XmlSeeAlso({
    ConeType.class,
    CylinderType.class,
    SphereType.class
})
public abstract class AbstractGriddedSurfaceType
    extends AbstractParametricCurveSurfaceType
{

    @XmlElement(name = "rows", required = true)
    protected AbstractGriddedSurfaceType.Rows pointGridRows;
    @XmlAttribute(name = "rows")
    protected BigInteger rows;
    @XmlAttribute(name = "columns")
    protected BigInteger columns;

    /**
     * Gets the value of the pointGridRows property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractGriddedSurfaceType.Rows }
     *     
     */
    public AbstractGriddedSurfaceType.Rows getPointGridRows() {
        return pointGridRows;
    }

    /**
     * Sets the value of the pointGridRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractGriddedSurfaceType.Rows }
     *     
     */
    public void setPointGridRows(AbstractGriddedSurfaceType.Rows value) {
        this.pointGridRows = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRows(BigInteger value) {
        this.rows = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumns(BigInteger value) {
        this.columns = value;
    }

    @Override
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AbstractGriddedSurfaceType that = ((AbstractGriddedSurfaceType) object);
        {
            boolean lhsFieldIsSet = (this.rows!= null);
            boolean rhsFieldIsSet = (that.rows!= null);
            BigInteger lhsField;
            lhsField = this.getRows();
            BigInteger rhsField;
            rhsField = that.getRows();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "rows", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "rows", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.pointGridRows!= null);
            boolean rhsFieldIsSet = (that.pointGridRows!= null);
            AbstractGriddedSurfaceType.Rows lhsField;
            lhsField = this.getPointGridRows();
            AbstractGriddedSurfaceType.Rows rhsField;
            rhsField = that.getPointGridRows();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "pointGridRows", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "pointGridRows", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        {
            boolean lhsFieldIsSet = (this.columns!= null);
            boolean rhsFieldIsSet = (that.columns!= null);
            BigInteger lhsField;
            lhsField = this.getColumns();
            BigInteger rhsField;
            rhsField = that.getColumns();
            ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "columns", lhsField);
            ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "columns", rhsField);
            if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            boolean theFieldIsSet = (this.pointGridRows!= null);
            AbstractGriddedSurfaceType.Rows theField;
            theField = this.getPointGridRows();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "pointGridRows", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.rows!= null);
            BigInteger theField;
            theField = this.getRows();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "rows", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.columns!= null);
            BigInteger theField;
            theField = this.getColumns();
            ObjectLocator theFieldLocator = LocatorUtils.property(locator, "columns", theField);
            currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
        }
        return currentHashCode;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            boolean theFieldIsSet = (this.pointGridRows!= null);
            AbstractGriddedSurfaceType.Rows theField;
            theField = this.getPointGridRows();
            strategy.appendField(locator, this, "pointGridRows", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.rows!= null);
            BigInteger theField;
            theField = this.getRows();
            strategy.appendField(locator, this, "rows", buffer, theField, theFieldIsSet);
        }
        {
            boolean theFieldIsSet = (this.columns!= null);
            BigInteger theField;
            theField = this.getColumns();
            strategy.appendField(locator, this, "columns", buffer, theField, theFieldIsSet);
        }
        return buffer;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Row" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <group ref="{http://www.opengis.net/gml/3.2}geometricPositionListGroup"/>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "row"
    })
    @Entity(name = "AbstractGriddedSurfaceType$Rows")
    @Table(name = "ROWS_")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class Rows implements Equals, HashCode, ToString
    {

        @XmlElement(name = "Row", required = true)
        protected List<AbstractGriddedSurfaceType.Rows.Row> row;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;

        /**
         * Gets the value of the row property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the row property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AbstractGriddedSurfaceType.Rows.Row }
         * 
         * 
         */
        @OneToMany(targetEntity = com.aixm.delorean.core.org.gml.v_3_2.AbstractGriddedSurfaceType.Rows.Row.class, cascade = {
            CascadeType.ALL
        })
        @JoinColumn(name = "ROW__ROWS__HJID")
        public List<AbstractGriddedSurfaceType.Rows.Row> getRow() {
            if (row == null) {
                row = new ArrayList<>();
            }
            return this.row;
        }

        /**
         * 
         * 
         */
        public void setRow(List<AbstractGriddedSurfaceType.Rows.Row> row) {
            this.row = row;
        }

        /**
         * Gets the value of the hjid property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        @Id
        @Column(name = "HJID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long getHjid() {
            return hjid;
        }

        /**
         * Sets the value of the hjid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHjid(Long value) {
            this.hjid = value;
        }

        @Override
        public boolean equals(Object object) {
            ObjectLocator thisLocator = null;
            ObjectLocator thatLocator = null;
            final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
            if (strategy.isDebugEnabled()) {
                thisLocator = new DefaultRootObjectLocator(this);
                thatLocator = new DefaultRootObjectLocator(object);
            }
            return equals(thisLocator, thatLocator, object, strategy);
        }

        @Override
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final AbstractGriddedSurfaceType.Rows that = ((AbstractGriddedSurfaceType.Rows) object);
            {
                boolean lhsFieldIsSet = ((this.row!= null)&&(!this.row.isEmpty()));
                boolean rhsFieldIsSet = ((that.row!= null)&&(!that.row.isEmpty()));
                List<AbstractGriddedSurfaceType.Rows.Row> lhsField;
                lhsField = (((this.row!= null)&&(!this.row.isEmpty()))?this.getRow():null);
                List<AbstractGriddedSurfaceType.Rows.Row> rhsField;
                rhsField = (((that.row!= null)&&(!that.row.isEmpty()))?that.getRow():null);
                ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "row", lhsField);
                ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "row", rhsField);
                if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public int hashCode() {
            ObjectLocator theLocator = null;
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
            if (strategy.isDebugEnabled()) {
                theLocator = new DefaultRootObjectLocator(this);
            }
            return this.hashCode(theLocator, strategy);
        }

        @Override
        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                boolean theFieldIsSet = ((this.row!= null)&&(!this.row.isEmpty()));
                List<AbstractGriddedSurfaceType.Rows.Row> theField;
                theField = (((this.row!= null)&&(!this.row.isEmpty()))?this.getRow():null);
                ObjectLocator theFieldLocator = LocatorUtils.property(locator, "row", theField);
                currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
            }
            return currentHashCode;
        }

        @Override
        public String toString() {
            ObjectLocator theLocator = null;
            final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
            if (strategy.isTraceEnabled()) {
                theLocator = new DefaultRootObjectLocator(this);
            }
            final StringBuilder buffer = new StringBuilder();
            append(theLocator, buffer, strategy);
            return buffer.toString();
        }

        @Override
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Override
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                boolean theFieldIsSet = ((this.row!= null)&&(!this.row.isEmpty()));
                List<AbstractGriddedSurfaceType.Rows.Row> theField;
                theField = (((this.row!= null)&&(!this.row.isEmpty()))?this.getRow():null);
                strategy.appendField(locator, this, "row", buffer, theField, theFieldIsSet);
            }
            return buffer;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <group ref="{http://www.opengis.net/gml/3.2}geometricPositionListGroup"/>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "posList",
            "geometricPositionGroup"
        })
        @Entity(name = "AbstractGriddedSurfaceType$Rows$Row")
        @Table(name = "ROW_")
        @Inheritance(strategy = InheritanceType.JOINED)
        public static class Row implements Equals, HashCode, ToString
        {

            protected DirectPositionListType posList;
            @XmlElements({
                @XmlElement(name = "pos", type = DirectPositionType.class),
                @XmlElement(name = "pointProperty", type = PointPropertyType.class)
            })
            protected List<Object> geometricPositionGroup;
            @XmlAttribute(name = "Hjid")
            protected Long hjid;

            /**
             * Gets the value of the posList property.
             * 
             * @return
             *     possible object is
             *     {@link DirectPositionListType }
             *     
             */
            @Transient
            public DirectPositionListType getPosList() {
                return posList;
            }

            /**
             * Sets the value of the posList property.
             * 
             * @param value
             *     allowed object is
             *     {@link DirectPositionListType }
             *     
             */
            public void setPosList(DirectPositionListType value) {
                this.posList = value;
            }

            /**
             * GML supports two different ways to specify a geometric position: either by a direct position (a data type) or a point (a geometric object).
             * pos elements are positions that are "owned" by the geometric primitive encapsulating this geometric position.
             * pointProperty elements contain a point that may be referenced from other geometry elements or reference another point defined elsewhere (reuse of existing points).Gets the value of the geometricPositionGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the geometricPositionGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGeometricPositionGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DirectPositionType }
             * {@link PointPropertyType }
             * 
             * 
             */
            @Transient
            public List<Object> getGeometricPositionGroup() {
                if (geometricPositionGroup == null) {
                    geometricPositionGroup = new ArrayList<>();
                }
                return this.geometricPositionGroup;
            }

            /**
             * GML supports two different ways to specify a geometric position: either by a direct position (a data type) or a point (a geometric object).
             * pos elements are positions that are "owned" by the geometric primitive encapsulating this geometric position.
             * pointProperty elements contain a point that may be referenced from other geometry elements or reference another point defined elsewhere (reuse of existing points).
             * 
             */
            public void setGeometricPositionGroup(List<Object> geometricPositionGroup) {
                this.geometricPositionGroup = geometricPositionGroup;
            }

            /**
             * Gets the value of the hjid property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            @Id
            @Column(name = "HJID")
            @GeneratedValue(strategy = GenerationType.AUTO)
            public Long getHjid() {
                return hjid;
            }

            /**
             * Sets the value of the hjid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setHjid(Long value) {
                this.hjid = value;
            }

            @Override
            public boolean equals(Object object) {
                ObjectLocator thisLocator = null;
                ObjectLocator thatLocator = null;
                final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
                if (strategy.isDebugEnabled()) {
                    thisLocator = new DefaultRootObjectLocator(this);
                    thatLocator = new DefaultRootObjectLocator(object);
                }
                return equals(thisLocator, thatLocator, object, strategy);
            }

            @Override
            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final AbstractGriddedSurfaceType.Rows.Row that = ((AbstractGriddedSurfaceType.Rows.Row) object);
                {
                    boolean lhsFieldIsSet = (this.posList!= null);
                    boolean rhsFieldIsSet = (that.posList!= null);
                    DirectPositionListType lhsField;
                    lhsField = this.getPosList();
                    DirectPositionListType rhsField;
                    rhsField = that.getPosList();
                    ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "posList", lhsField);
                    ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "posList", rhsField);
                    if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                        return false;
                    }
                }
                {
                    boolean lhsFieldIsSet = ((this.geometricPositionGroup!= null)&&(!this.geometricPositionGroup.isEmpty()));
                    boolean rhsFieldIsSet = ((that.geometricPositionGroup!= null)&&(!that.geometricPositionGroup.isEmpty()));
                    List<Object> lhsField;
                    lhsField = (((this.geometricPositionGroup!= null)&&(!this.geometricPositionGroup.isEmpty()))?this.getGeometricPositionGroup():null);
                    List<Object> rhsField;
                    rhsField = (((that.geometricPositionGroup!= null)&&(!that.geometricPositionGroup.isEmpty()))?that.getGeometricPositionGroup():null);
                    ObjectLocator lhsFieldLocator = LocatorUtils.property(thisLocator, "geometricPositionGroup", lhsField);
                    ObjectLocator rhsFieldLocator = LocatorUtils.property(thatLocator, "geometricPositionGroup", rhsField);
                    if (!strategy.equals(lhsFieldLocator, rhsFieldLocator, lhsField, rhsField, lhsFieldIsSet, rhsFieldIsSet)) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public int hashCode() {
                ObjectLocator theLocator = null;
                final HashCodeStrategy strategy = JAXBHashCodeStrategy.getInstance();
                if (strategy.isDebugEnabled()) {
                    theLocator = new DefaultRootObjectLocator(this);
                }
                return this.hashCode(theLocator, strategy);
            }

            @Override
            public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
                int currentHashCode = 1;
                {
                    boolean theFieldIsSet = (this.posList!= null);
                    DirectPositionListType theField;
                    theField = this.getPosList();
                    ObjectLocator theFieldLocator = LocatorUtils.property(locator, "posList", theField);
                    currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
                }
                {
                    boolean theFieldIsSet = ((this.geometricPositionGroup!= null)&&(!this.geometricPositionGroup.isEmpty()));
                    List<Object> theField;
                    theField = (((this.geometricPositionGroup!= null)&&(!this.geometricPositionGroup.isEmpty()))?this.getGeometricPositionGroup():null);
                    ObjectLocator theFieldLocator = LocatorUtils.property(locator, "geometricPositionGroup", theField);
                    currentHashCode = strategy.hashCode(theFieldLocator, currentHashCode, theField, theFieldIsSet);
                }
                return currentHashCode;
            }

            @Override
            public String toString() {
                ObjectLocator theLocator = null;
                final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
                if (strategy.isTraceEnabled()) {
                    theLocator = new DefaultRootObjectLocator(this);
                }
                final StringBuilder buffer = new StringBuilder();
                append(theLocator, buffer, strategy);
                return buffer.toString();
            }

            @Override
            public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
                strategy.appendStart(locator, this, buffer);
                appendFields(locator, buffer, strategy);
                strategy.appendEnd(locator, this, buffer);
                return buffer;
            }

            @Override
            public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
                {
                    boolean theFieldIsSet = (this.posList!= null);
                    DirectPositionListType theField;
                    theField = this.getPosList();
                    strategy.appendField(locator, this, "posList", buffer, theField, theFieldIsSet);
                }
                {
                    boolean theFieldIsSet = ((this.geometricPositionGroup!= null)&&(!this.geometricPositionGroup.isEmpty()));
                    List<Object> theField;
                    theField = (((this.geometricPositionGroup!= null)&&(!this.geometricPositionGroup.isEmpty()))?this.getGeometricPositionGroup():null);
                    strategy.appendField(locator, this, "geometricPositionGroup", buffer, theField, theFieldIsSet);
                }
                return buffer;
            }

        }

    }

}
