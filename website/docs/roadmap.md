# Roadmap

This Git graph shows the milestones achieved and planned for the Delorean project. 

```mermaid
%%{init: { 'theme': 'dark'}}%%
gitGraph TB:
    commit id: "Delorean init"
    branch codegen
    commit id: "JAXB generation"
    commit id: "XJB generation"
    branch xml
    commit id: "adapters"
    commit id: "marshalling"
    commit id: "unmarshalling"
    branch db
    commit id: "schema generation"
    commit id: "persistence"
    commit id: "extraction"
    branch testing
    commit id: "test data set"
    checkout main
    merge db type: HIGHLIGHT tag: "v0.1.0"
    checkout db
    commit id: "geometry rendering"
    commit id: "view generation"
    branch qgis
    commit id: "visualisation project generation"
    commit id: "action"
    commit id: "html widget"
    checkout main
    merge qgis type: HIGHLIGHT tag: "v0.2.0"
    checkout codegen
    merge main id: "5.1.1 / 5.2" type:REVERSE
    checkout db
    merge main id: "geo, temporal, source filter & merger" type:REVERSE
    checkout testing
    merge main id: "automated testing" type:REVERSE
    checkout qgis 
    merge main id: "edition project generation" type:REVERSE
    checkout codegen
    commit id: "validation & buisiness rules (java)" type:REVERSE
    checkout db
    commit id: "validation & buisiness rules (db)" type:REVERSE
    checkout codegen
    commit id: "extended schema" type:REVERSE
    checkout db
    commit id: "create & edit" type:REVERSE
    checkout codegen
    commit id: "digital notam" type:REVERSE
    checkout db
    commit id: "temp delta & perm delta" type:REVERSE
    checkout main
    commit id:" " "release"  type:REVERSE tag: "v1.0.0"
```