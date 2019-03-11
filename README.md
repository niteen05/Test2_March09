# Test2_March09

## A simple application which has a single "/healthcheck" endpoint, written in Java using Maven for the build, Dockerised applicatio to run in Jenkin Pipeline.

Application returns JSon object containing below information
*  Applications Version.
*  Description. ("static variable") 
*  Last Commit SHA.

### This example demonstrates:
*  Jenkins Pipeline
*  Dockerised run
*  Test case reports
*  Sonarqube quality reports

#### Application can be accessed through URL Host-URL:8093/healthcheck
#### Sonarqub reports through sonarqube server URL configured in Jenkins
