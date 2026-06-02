<img src="website/src/assets/logo/delorean-aixm-logo-big-transparent.png" width="900">
                    
Delorean-AIXM offers an open-source solution for managing AIXM aeronautical information. Delorean-AIXM transforms your PostgreSQL database into a comprehensive aeronautical mapping database capable of handling validation, visualisation, creation, modification, merging, filtering and digital NOTAM handling. Delorean-AIXM can be integrated with GIS tools, web servers, feature servers, and much more. Where tools relying on an in-memory representation of the AIXM dataset start to struggle at 1 GB, Delorean can easily ingest 10 to hundreads of GB and leverage the power of the normalised AIXM schema, PostGIS GIS tools and PostgreSQL.

Delorean support all feature types found in aixm for the following aixm versions : 
* [x] Schema
	* [x] AIXM 5.1
	* [x] AIXM 5.1.1
	* [x] AIXM 5.2
	* [ ] Extension
		* [ ] Event
		* [ ] ADR
		* [ ] ASRN
* [x] ETL Function
	* [x] Marshal
		* [x] Zip
		* [x] Plain
	* [x] Unmarshal
		* [x] Zip
		* [ ] Plain
	* [x] Persist
	* [x] Extract
	* [x] Predicate
	* [x] Merge
	* [ ] Combine
	* [x] Integrate
	* [ ] Delta
	* [X] Filter
	* [X] Prune
	* [X] Clone
	* [x] Validate
		* [x] XSD
		* [ ] EAD Business Rules
	* [x] GML Geometries
	* [x] GML Id
		* [x] Context
		* [x] OID
	* [x] Temporal Concept
		* [x] BASELINE
		* [x] PERMDELTA
		* [ ] TEMPDELTA
		* [ ] SNAPSHOT
* [x] DB Function
	* [x] View
	* [x] Schema
	* [x] Temporal Concept
		* [x] BASELINE
		* [x] PERMDELTA
		* [ ] TEMPDELTA
		* [ ] SNAPSHOT
* [x] UI/UX
	* [ ] Yaml Workflow
	* [x] Logging
	* [x] Statistics
	* [ ] Strict / Loose Mode

I created this tool because I believe the aviation industry needs a simple, accessible solution for handling AIXM data. Delorean-AIXM is heavily inspired by [INTERLIS](https://www.interlis.ch/en) and its robust open-source ecosystem like [ili2db](https://github.com/claeis/ili2db). I believe open-source software is the key to expanding AIXM adoption; right now, there is massive untapped potential as existing tools are too expensive, overly complicated, or poorly suited to user needs. This could be directly implemented for eIAP, Digital NOTAM, national and international data exchange and much more.

```bash
flowchart LR
    
    A[local org] 
    B[National org]
    C[European org]
    D[Inter. org]
    E[Air travel]
        
    A e1@-.-> B
    B e2@==> C
    C e3@-.-> D
    D e4@-.-> E
    
    
    AA((local ltd))
    AB((inter. ltd))
   
    AA e4@<-.-> A
    AA e5@<-.-> B
    AA e6@<-.-> E
      
    AA <-.-> AB
    AB <-.-> A
    AB <-.-> B
    AB <-.-> C
    AB <-.-> D
    AB <-.-> E
    
    
    e1@{ curve: linear }
    e2@{ curve: linear }
    e3@{ curve: linear }
    e4@{ curve: linear }
```

## License

Delorean-AIXM is open-source software licensed under the GPLv3 License.

## Using

Consult the Wiki : [Usage](https://github.com/3l-gee/delorean/wiki) / [Exemple](https://github.com/3l-gee/delorean/wiki/Use-case-Exemple)

## Building

Prerequisites
- Java 21 or higher
- Docker

Standard Build
To compile the project and install all modules into your local repository, run:
```bash
mvn clean install
```

Build with regeneration of HiSrc HyperJAXB classes
```bash
mvn clean install -Pjaxb-core -Pjaxb-51 -Pjaxb-511 -Pjaxb-52
```
> The HiSrc HyperJAXB classes are generated directly from the AIXM XSD schemas. If you need to modify the content of an AIXM class, you should change the underlying XSD schema first. This ensures that the data remains valid and can be marshalled/unmarshalled properly across different systems.

Testing 
```bash
mvn clean verify
```

## Documentation
Please refer to the [wiki](https://github.com/3l-gee/delorean/wiki) for the full documentation.

## Bugs

Bugs & Features: Please open an issue on our GitHub Issues page.

## Community support

TODO

## Contributing

TODO

