# Development #

## Maven Commands ##

* `mvn compile` - compile
* `mvn test` - test (runs code in src/test)
  * `mvn test-compile` - compiles test code, but does not run
* `mvn package` - Create jar package
* `mvn install` - Builds? (not sure exactly what this does)
* `mvn clean` - cleans target directory

## Running and testing ##

For general running purposes, do `mvn test` as it will compile the main src as well as compile and run the test. 

## Dependencies ##

* https://github.com/stleary/JSON-java

## Progress ##

* 5/25/2021 - Started project, added json dependency. Will probably be the only dependency.