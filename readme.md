[![Build Status](https://travis-ci.org/yusufsyaifudin/random-generator.svg?branch=master)](https://travis-ci.org/yusufsyaifudin/random-generator)

# Random Generator

Generator of random string in JAVA.

## Installation

### Maven

Inside `pom.xml`, add the repository url as below:

```
<repositories>
    <repository>
      <id>yusufs.generator</id>
      <name>randstring</name>
      <url>https://github.com/yusufsyaifudin/random-generator/raw/1.0.0/</url>
    </repository>
</repositories> 
```

and so does the dependency:

```
<dependencies>
    <dependency>
      <groupId>yusufs.generator</groupId>
      <artifactId>randstring</artifactId>
      <version>1.0.0</version>
      <scope>compile</scope>
    </dependency>
</dependencies>
```


## Penggunaan

This Random string generator has 3 mode, they are: Produce ALPHANUMERIC (alphabet and numeric), ALPHA (alphabet only) and NUMERIC (numeric only).

Below is the example how to use it:

```
String randomAlphaNumeric = RandomStringGenerator.generateRandomString(10, RandomStringGenerator.Mode.ALPHANUMERIC);
String randomAlpha = RandomStringGenerator.generateRandomString(10, RandomStringGenerator.Mode.ALPHA);
String randomNumeric = RandomStringGenerator.generateRandomString(10, RandomStringGenerator.Mode.NUMERIC);
```


