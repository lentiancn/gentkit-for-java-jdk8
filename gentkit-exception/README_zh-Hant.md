# GentKit Exception

繁體中文 | [English](README.md) | [简体中文](README_zh-Hans.md)

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

JDK: 1.8 及以上

**Maven項目** -> 在你項目的 <code>pom.xml</code> 中添加依賴 ：

```xml
<dependency>
    <groupId>com.gentkit.exception</groupId>
    <artifactId>gentkit-exception</artifactId>
    <version>1.0.0-RELEASE</version>
</dependency>
```

**Gradle項目** -> 在你項目的 <code>build.gradle</code> 中添加依賴 ：

```groovy
implementation 'com.gentkit.exception:gentkit-exception:1.0.0-RELEASE'
```

## 捐助

若內容對你有幫助，可掃下方二維碼打賞一杯咖啡支持一下！你的認可，是創作的動力，非常感謝～ (●'◡'●)

<div style="display:flex;">
  <img src="https://gitee.com/lentiancn/lentiancn/raw/master/donate/alipay.jpg" alt="支付寶贊助" width="30%" style="width:40%;">
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://gitee.com/lentiancn/lentiancn/raw/master/donate/wechat.jpg" alt="微信贊助" width="30%" style="width:40%;">
</div>

## 許可證

GentKit 採用 [MIT License](../LICENSE) 協議進行授權 。

## 聯絡方式

電子信箱：gentkit@126.com
