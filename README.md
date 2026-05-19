<img src="website/src/assets/logo/delorean-aixm-logo-big-transparent.png" width="900">
                    
Delorean-AIXM offers an open-source solution for managing AIXM aeronautical information. Delorean-AIXM transforms your PostgreSQL database into a comprehensive aeronautical mapping database capable of handling validation, visualisation, creation, modification, merging, filtering and digital NOTAM handling. Delorean-AIXM can be integrated with GIS tools, web servers, feature servers, and much more.

Delorean support all features types found in aixm for the following aixm versions : 
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
	* [ ] Filter
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

## License

Delorean is licensed under the GPLV3

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

TODO

## Community support

TODO

## Contributing

TODO

