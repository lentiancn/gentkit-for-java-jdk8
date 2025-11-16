# GentKit Exception

[简体中文](../README.md) | 繁體中文 | [English](README_en.md)

## 介紹

GentKit Exception 是 GentKit 框架的覈心子模塊，專注於提供標準化、可擴展、易集成的異常處理解決方案。

## 功能清單

* <code>**ExceptionUtils.throwableToString(Throwable cause)**</code>

```java
// [ 輸入 ]
new Exception("測試");

// [ 執行 ]
String s = ExceptionUtils.throwableToString(new Exception("測試"));
System.out.println(s);

// [ 輸出 ]
"java.lang.Exception: 測試"
```

## 安裝

JDK: 8 及以上

**Maven項目** -> 在你項目的 <code>pom.xml</code> 中添加依賴 ：

```xml
<dependency>
    <groupId>com.gentkit.exception</groupId>
    <artifactId>gentkit-exception</artifactId>
    <version>1.x.x-jdk8</version>
</dependency>
```

**Gradle項目** -> 在你項目的 <code>build.gradle</code> 中添加依賴 ：

```groovy
implementation 'com.gentkit.exception:gentkit-exception:1.x.x-jdk8'
```

## 捐助

如果您覺得我們的開源軟體對您有所幫助，請掃描下方 QR Code 支持我們一杯咖啡！(●'◡'●)

<div style="display:flex;">
  <img src="../../README/Donate/alipay.jpg" alt="支付寶贊助" width="40%" style="width:40%;">
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="../../README/Donate/wechat.jpg" alt="微信贊助" width="40%" style="width:40%;">
</div>

## 授權協議

GentKit 採用 [MIT License](../../LICENSE) 協議進行授權 。

## 聯絡我們

電子信箱：gentkit@126.com
