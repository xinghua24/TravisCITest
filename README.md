[![Build Status](https://travis-ci.com/xinghua24/TravisCITest.svg?branch=master)](https://travis-ci.com/xinghua24/TravisCITest)

.travis.yml
```yul
language: java
sudo: false
jdk:
  - openjdk8
os:
  - linux
script: mvn clean package
```


Reference
* [Travis CI - Building a Java project](https://docs.travis-ci.com/user/languages/java/)
* [Baeldung - Create a Build Pipeline with Travis CI](https://www.baeldung.com/travis-ci-build-pipeline)