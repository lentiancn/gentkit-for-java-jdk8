# GentKit Logger

简体中文 | [繁體中文](README_zh-Hant.md) | [English](README.md)

## 介绍

GentKit Logger 是 GentKit 框架的核心子模块，专注于提供标准化、可扩展、易集成的日志处理解决方案。

## 功能列表

### 1. 使用 <code>SLF4j</code> 作为门面，<code>Logback</code> 作为提供器，实现日志管理 。

| 序号 | 功能             | 说明                                                                |
|----|:---------------|:------------------------------------------------------------------|
| 1  | JCL            | Java Commons Logging                                              |
| 2  | JUL            | Java Util Logging                                                 |
| 3  | Log4j 1        |                                                                   |
| 4  | Log4j 2        |                                                                   |
| 5  | GentKit Logger | 使用 Logback 作为默认提供器，JCL，JUL，Log4j 1，Log4j 2 ... 统一由 Logback 配置文件管理 |

> 安装方法

**Maven 项目** -> 添加依赖至 <code>pom.xml</code> ：

```xml
<dependency>
    <groupId>com.gentkit.logger</groupId>
    <artifactId>gentkit-logger-slf4j-logback</artifactId>
    <version>1.x.x-jdk8</version>
</dependency>
```

**Gradle 项目** -> 在你项目的 <code>build.gradle</code> 中添加依赖 ：

```groovy
implementation 'com.gentkit.logger:gentkit-logger-slf4j-logback:1.x.x-jdk8'
```

> 使用方法

```
Logger logger = LoggerFactory.getLogger(getClass());

// 1. 打印门面和提供器使用情况
System.out.println("门面: " + LOGGER.getFacadeName() + "，提供器: " + LOGGER.getProviderName());
// 2. 日志输出
logger.error("Hello World !");

---------------------------------------------------------------------
输出 > "门面: slf4j，提供器: logback"
输出 > "23:01:15.030 [main] ERROR com.gentkit.logger.LogSample - Hello World !"
```

### 2. 使用 <code>SLF4j</code> 作为门面，<code>log4j 2</code> 作为提供器，实现日志管理 。

| 序号 | 功能             | 说明                                                                |
|----|:---------------|:------------------------------------------------------------------|
| 1  | JCL            | Java Commons Logging                                              |
| 2  | JUL            | Java Util Logging                                                 |
| 3  | Log4j 1        |                                                                   |
| 4  | Logback        |                                                                   |
| 5  | GentKit Logger | 使用 Log4j 2 作为默认提供器，JCL，JUL，Log4j 1，Logback ... 统一由 Log4j 2 配置文件管理 |

> 安装方法

**Maven 项目** -> 添加依赖至 <code>pom.xml</code> ：

```xml
<dependency>
    <groupId>com.gentkit.logger</groupId>
    <artifactId>gentkit-logger-slf4j-log4j2</artifactId>
    <version>1.x.x-jdk8</version>
</dependency>
```

**Gradle 项目** -> 添加依赖至 <code>build.gradle</code> ：

```groovy
implementation 'com.gentkit.logger:gentkit-logger-slf4j-log4j2:1.x.x-jdk8'
```

> 使用方法

```
Logger logger = LoggerFactory.getLogger(getClass());

// 1. 打印门面和提供器使用情况
System.out.println("门面: " + LOGGER.getFacadeName() + "，提供器: " + LOGGER.getProviderName());
// 2. 日志输出
logger.error("Hello World !");

---------------------------------------------------------------------
输出 > "门面: slf4j，提供器: log4j2"
输出 > "23:01:15.030 [main] ERROR com.gentkit.logger.LogSample - Hello World !"
```

## 答疑

* 问：slf4j+log4j2 和 slf4j+logback 有什么区别？能同时引用吗？
    * 答：slf4j 是门面，log4j2 和 logback 都是提供器。slf4j+log4j2 和 slf4j+logback 不能共存，会冲突。

* 问：该如何选择哪一种组合？
    * 答：优先推荐 slf4j+logback，因为 slf4j 和 logback 是同一个作者开发的，兼容性最好。

## 附录

* Slf4j 手册：https://www.slf4j.org/manual.html
* Logback 手册：https://logback.qos.ch/manual/configuration.html
* Log4j2 手册：https://logging.apache.org/log4j/2.x/manual/configuration.html

## 捐助

如果内容对你有帮助，可扫下方二维码打赏一杯咖啡支持一下！你的认可，是创作的动力，非常感谢~ (●'◡'●)

<div style="display:flex;">
  <img src="https://gitee.com/lentiancn/lentiancn/raw/master/donate/alipay.jpg" alt="支付宝打赏" width="30%" style="width:40%;">
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://gitee.com/lentiancn/lentiancn/raw/master/donate/wechat.jpg" alt="微信打赏" width="30%" style="width:40%;">
</div>

## 许可证

GentKit 的授权遵循许可证 [MIT License](../LICENSE) 。

## 联系方式

电子邮箱： gentkit@126.com
