# GentKit Logger

[简体中文](../README.md) | [繁體中文](README_zh_CN_Hant.md) | English

## Introduction

GentKit Logger is a core submodule of the GentKit framework, dedicated to providing a standardized, extensible, and
easily integrable logging solution.

## Feature List

### 1. Using `SLF4j` as the facade and `Logback` as the provider to implement log management.

| No. | Feature        | Description                                                                                                        |
|-----|----------------|--------------------------------------------------------------------------------------------------------------------|
| 1   | JCL            | Java Commons Logging                                                                                               |
| 2   | JUL            | Java Util Logging                                                                                                  |
| 3   | Log4j 1        |                                                                                                                    |
| 4   | Log4j 2        |                                                                                                                    |
| 5   | GentKit Logger | Uses Logback as the default provider. JCL, JUL, Log4j 1, Log4j 2... are all managed by Logback configuration files |

> Installation

**Maven Project** → Add dependency to `pom.xml` :

```xml
<dependency>
    <groupId>com.gentkit.logger</groupId>
    <artifactId>gentkit-logger-slf4j-logback</artifactId>
    <version>Latest Version</version>
</dependency>
```

**Gradle Project** → Add dependency to your project's `build.gradle`:

```groovy
implementation 'com.gentkit.logger:gentkit-logger-slf4j-logback:Latest Version'
```

> Usage

```
Logger logger = LoggerFactory.getLogger(getClass());

// 1. Print facade and provider usage
System.out.println("Facade: " + LOGGER.getFacadeName() + ", Provider: " + LOGGER.getProviderName());
// 2. Log output
logger.error("Hello World !");

---------------------------------------------------------------------
Output > "Facade: slf4j, Provider: logback"
Output > "23:01:15.030 [main] ERROR com.gentkit.logger.LogSample - Hello World !"
```

### 2. Using `SLF4j` as the facade and `log4j 2` as the provider to implement log management.

| No. | Feature        | Description                                                                                                        |
|-----|----------------|--------------------------------------------------------------------------------------------------------------------|
| 1   | JCL            | Java Commons Logging                                                                                               |
| 2   | JUL            | Java Util Logging                                                                                                  |
| 3   | Log4j 1        |                                                                                                                    |
| 4   | Logback        |                                                                                                                    |
| 5   | GentKit Logger | Uses Log4j 2 as the default provider. JCL, JUL, Log4j 1, Logback... are all managed by Log4j 2 configuration files |

> Installation Method

**Maven Project** → Add dependency to `pom.xml` :

```xml
<dependency>
    <groupId>com.gentkit.logger</groupId>
    <artifactId>gentkit-logger-slf4j-log4j2</artifactId>
    <version>Latest Version</version>
</dependency>
```

**Gradle Project** → Add dependency to `build.gradle` :

```groovy
implementation 'com.gentkit.logger:gentkit-logger-slf4j-log4j2:Latest Version'
```

> Usage

```
Logger logger = LoggerFactory.getLogger(getClass());

// 1. Print facade and provider usage
System.out.println("Facade: " + LOGGER.getFacadeName() + ", Provider: " + LOGGER.getProviderName());
// 2. Log output
logger.error("Hello World !");

---------------------------------------------------------------------
Output > "Facade: slf4j, Provider: log4j2"
Output > "23:01:15.030 [main] ERROR com.gentkit.logger.LogSample - Hello World !"
```

## FAQ

* Q: What's the difference between slf4j+log4j2 and slf4j+logback? Can they be used together?
    * A: slf4j is the facade, while log4j2 and logback are both providers. slf4j+log4j2 and slf4j+logback cannot coexist
      as they will conflict.

* Q: How to choose which combination to use?
    * A: It is recommended to prioritize slf4j+logback, as they were developed by the same author and have the best
      compatibility.

## Appendix

* Slf4j Manual: https://www.slf4j.org/manual.html
* Logback Manual: https://logback.qos.ch/manual/configuration.html
* Log4j2 Manual: https://logging.apache.org/log4j/2.x/manual/configuration.html

## Donate

If the content was helpful to you, feel free to scan the QR code below to buy me a coffee as support! Your recognition
is the motivation for my creation, thanks so much~ (●'◡'●)

<div style="display:flex;">
  <img src="../../README/Donate/alipay.jpg" alt="Alipay Donation" width="40%" style="width:40%;">
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="../../README/Donate/wechat.jpg" alt="WeChat Donation" width="40%" style="width:40%;">
</div>

## License

GentKit is licensed under the [MIT License](../../LICENSE).

## Contact Methods

E-mail: gentkit@126.com
