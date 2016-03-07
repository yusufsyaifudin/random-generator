[![Build Status](https://travis-ci.org/yusufsyaifudin/random-generator.svg?branch=master)](https://travis-ci.org/yusufsyaifudin/random-generator)

# Random Generator

Generator of random string in JAVA.


## Instalasi

### Maven

Pada `pom.xml`, tambahkan alamat repositori berikut:

```
<repositories>
    <repository>
      <id>yusufs.generator</id>
      <name>randstring</name>
      <url>https://github.com/yusufsyaifudin/random-generator/raw/master/</url>
    </repository>
</repositories> 
```

dan dependensi berikut:

```
<dependencies>
    <dependency>
      <groupId>yusuf.generator</groupId>
      <artifactId>randstring</artifactId>
      <version>1.0.0</version>
      <scope>compile</scope>
    </dependency>
</dependencies>
```


## Penggunaan

Random string generator ini ada 3 mode, yaitu menghasilkan ALPHANUMERIC (alfabet dan angka), ALPHA (alfabet saja) atau NUMERIC (angka saja).

Contoh penggunaannya ialah sebagai berikut:

```
String randomAlphaNumeric = RandomStringGenerator.generateRandomString(10, RandomStringGenerator.Mode.ALPHANUMERIC);
String randomAlpha = RandomStringGenerator.generateRandomString(10, RandomStringGenerator.Mode.ALPHA);
String randomNumeric = RandomStringGenerator.generateRandomString(10, RandomStringGenerator.Mode.NUMERIC);
```


