# GentKit Exception

[简体中文](../README.md) | [繁體中文](README_zh_CN_Hant.md) | English

## Introduction

GentKit Exception is a core submodule of the GentKit framework, dedicated to providing standardized, extensible, and
easily integrable exception handling solutions.

## List of Features

* <code>**ExceptionUtils.throwableToString(Throwable cause)**</code>

```java
// [ OUTPUT ]
new Exception("test");

// [ EXECUTE ]
String s = ExceptionUtils.throwableToString(new Exception("test"));
System.out.println(s);

// [ OUTPUT ]
"java.lang.Exception: test"
```

## Installation

JDK : 1.8 and higher

**Maven project** -> Add dependency to your project's <code>pom.xml</code> :

```xml
<dependency>
    <groupId>com.gentkit.exception</groupId>
    <artifactId>gentkit-exception</artifactId>
    <version>1.0.0-RELEASE</version>
</dependency>
```

**Gradle project** -> Add dependency to your project's <code>build.gradle</code> :

```groovy
implementation 'com.gentkit.exception:gentkit-exception:1.0.0-RELEASE'
```

## Donate

If the content was helpful to you, feel free to scan the QR code below to buy me a coffee as support! Your recognition
is the motivation for my creation, thanks so much~ (●'◡'●)

<div style="display:flex;">
  <img src="../../README/Donate/alipay.jpg" alt="Alipay Donation" width="30%" style="width:40%;">
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="../../README/Donate/wechat.jpg" alt="WeChat Donation" width="30%" style="width:40%;">
</div>

## License

GentKit is licensed under the [MIT License](../../LICENSE).

## Contact Methods

E-mail: gentkit@126.com
