Spring Data Solr Example
-------------------------

This project demonstrates how to store solr documents with child documents using spring data solr.

To run the project:
1. `./gradlew solrStart`
2. `./gradlew bootRun`
3. You can run the child doc query directly (`http://localhost:8983/solr/collection1/select?fl=*,[child parentFilter=type_s:book]&indent=on&q=repositories&wt=json`) or you can go to http://localhost:8983/solr to manually query solr.
