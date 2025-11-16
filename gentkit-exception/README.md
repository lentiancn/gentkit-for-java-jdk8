# GentKit Exception

简体中文 | [繁體中文](README/README_zh_CN_Hant.md) | [English](README/README_en.md)

## 介绍

GentKit Exception 是 GentKit 框架的核心子模块，专注于提供标准化、可扩展、易集成的异常处理解决方案。

## 功能列表

* <code>**ExceptionUtils.throwableToString(Throwable cause)**</code>

```java
// [ 输入 ]
new Exception("测试");

// [ 执行 ]
String s = ExceptionUtils.throwableToString(new Exception("测试"));
System.out.println(s);

// [ 输出 ]
"java.lang.Exception: 测试"
```

## 安装

JDK: 8 及以上

**Maven 项目** -> 在你项目的 <code>pom.xml</code> 中添加依赖 ：

```xml
<dependency>
    <groupId>com.gentkit.exception</groupId>
    <artifactId>gentkit-exception</artifactId>
    <version>1.x.x-jdk8</version>
</dependency>
```

**Gradle 项目** -> 在你项目的 <code>build.gradle</code> 中添加依赖 ：

```groovy
implementation 'com.gentkit.exception:gentkit-exception:1.x.x-jdk8'
```

## 捐助

如果您觉得我们的开源软件对你有所帮助，请扫下方二维码打赏我们一杯咖啡。支持一下嘛！(●'◡'●)

<div style="display:flex;">
  <img src="../README/Donate/alipay.jpg" alt="支付宝打赏" width="40%" style="width:40%;">
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="../README/Donate/wechat.jpg" alt="微信打赏" width="40%" style="width:40%;">
</div>

## 许可证

GentKit 的授权遵循许可证 [MIT License](../LICENSE) 。

## 联系我们

电子邮箱：gentkit@126.com
