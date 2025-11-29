# GentKit Logger

[简体中文](README.md) | 繁體中文 | [English](README_en.md)

## 介紹

GentKit Logger 是 GentKit 框架的核心子模組，致力於提供標準化、可擴展、易整合的日誌處理解決方案 。

## 功能列表

### 1. 使用 `SLF4j` 作為門面，`Logback` 作為提供者，實現日誌管理 。

| 序號 | 功能             | 說明                                                              |
|----|----------------|-----------------------------------------------------------------|
| 1  | JCL            | Java Commons Logging                                            |
| 2  | JUL            | Java Util Logging                                               |
| 3  | Log4j 1        |                                                                 |
| 4  | Log4j 2        |                                                                 |
| 5  | GentKit Logger | 使用 Logback 作為預設提供者，JCL、JUL、Log4j 1、Log4j 2... 統一由 Logback 設定檔管理 |

> 安裝方法

**Maven 專案** → 新增依賴至 `pom.xml` ：

```xml
<dependency>
    <groupId>com.gentkit.logger</groupId>
    <artifactId>gentkit-logger-slf4j-logback</artifactId>
    <version>1.x.x-jdk8</version>
</dependency>
```

**Gradle 專案** → 在專案的 `build.gradle` 中新增依賴：

```groovy
implementation 'com.gentkit.logger:gentkit-logger-slf4j-logback:1.x.x-jdk8'
```

> 使用方式

```
Logger logger = LoggerFactory.getLogger(getClass());

// 1. 列印門面與提供者使用情況
System.out.println("門面: " + LOGGER.getFacadeName() + "，提供者: " + LOGGER.getProviderName());
// 2. 日誌輸出
logger.error("Hello World !");

---------------------------------------------------------------------
輸出 > "門面: slf4j，提供者: logback"
輸出 > "23:01:15.030 [main] ERROR com.gentkit.logger.LogSample - Hello World !"
```

### 2. 使用 `SLF4j` 作為門面，`log4j 2` 作為提供者，實現日誌管理 。

| 序號 | 功能             | 說明                                                              |
|----|----------------|-----------------------------------------------------------------|
| 1  | JCL            | Java Commons Logging                                            |
| 2  | JUL            | Java Util Logging                                               |
| 3  | Log4j 1        |                                                                 |
| 4  | Logback        |                                                                 |
| 5  | GentKit Logger | 使用 Log4j 2 作為預設提供者，JCL、JUL、Log4j 1、Logback... 統一由 Log4j 2 設定檔管理 |

> 安裝方法

**Maven 專案** → 新增依賴至 `pom.xml` ：

```xml
<dependency>
    <groupId>com.gentkit.logger</groupId>
    <artifactId>gentkit-logger-slf4j-log4j2</artifactId>
    <version>1.x.x-jdk8</version>
</dependency>
```

**Gradle 專案** → 在專案的 `build.gradle` 中新增依賴 ：

```groovy
implementation 'com.gentkit.logger:gentkit-logger-slf4j-log4j2:1.x.x-jdk8'
```

> 使用方式

```
Logger logger = LoggerFactory.getLogger(getClass());

// 1. 列印門面與提供者使用情況
System.out.println("門面: " + LOGGER.getFacadeName() + "，提供者: " + LOGGER.getProviderName());
// 2. 日誌輸出
logger.error("Hello World !");

---------------------------------------------------------------------
輸出 > "門面: slf4j，提供者: log4j2"
輸出 > "23:01:15.030 [main] ERROR com.gentkit.logger.LogSample - Hello World !"
```

## 疑難解答

* 問：slf4j+log4j2 和 slf4j+logback 有什麼差別？可以同時引用嗎？
    * 答：slf4j 是門面，log4j2 和 logback 都是提供者。slf4j+log4j2 和 slf4j+logback 不可共存，會產生衝突。

* 問：該如何選擇哪一種組合？
    * 答：建議優先使用 slf4j+logback，因為兩者是由同一作者開發，相容性最佳。

## 附錄

* Slf4j 手冊：https://www.slf4j.org/manual.html
* Logback 手冊：https://logback.qos.ch/manual/configuration.html
* Log4j2 手冊：https://logging.apache.org/log4j/2.x/manual/configuration.html

## 捐助

若內容對你有幫助，可掃下方二維碼打賞一杯咖啡支持一下！你的認可，是創作的動力，非常感謝～ (●'◡'●)

<div style="display:flex;">
  <img src="../../README/Donate/alipay.jpg" alt="支付寶贊助" width="30%" style="width:40%;">
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="../../README/Donate/wechat.jpg" alt="微信贊助" width="30%" style="width:40%;">
</div>

## 許可證

GentKit 採用 [MIT License](../LICENSE) 協議進行授權 。

## 聯絡方式

電子信箱：gentkit@126.com
