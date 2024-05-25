#!/bin/bash

cd server

echo "Cleaning the project..."
mvn clean

echo "Running tests..."
mvn test

echo "Generating coverage report..."
mvn jacoco:report

echo "Looking up JaCoCO Results on csv..."
cat target/site/jacoco/jacoco.csv

 mvn pmd:pmd pmd:cpd
 mvn com.github.spotbugs:spotbugs-maven-plugin:spotbugs

echo "Mutation Testing..."
mvn org.pitest:pitest-maven:mutationCoverage
# assuming the report is in target/pit-reports/YYYYMMDDHHMI
ReportDir=$(ls -td -- ./target/pit-reports/ | head -n 1)
open "$ReportDir/index.html"


