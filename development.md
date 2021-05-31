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

* https://github.com/Cosium/git-code-format-maven-plugin?

## Progress ##

* 5/25/2021 - Started project, added json dependency. Will probably be the only dependency.
* 5/27(or 28)/2021 - Added AM2418 and got their json dependency and removed the other json dependency.
* 5/29/2021 - Completed GraphQL interface system

## Code Format ##

* My (@EpicGamer007) preferred code format is tabs with 4 spaces in each tab. If possible, please use that format when coding and contributing to this project. (This is only until we get a maven plugin to auto format code for us).