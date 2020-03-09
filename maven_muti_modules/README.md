# maven_muti_modules
> Here goes your awesome project description!
## Table of contents
* [General info](#general-info)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Project architecture](#project-architecture)
* [Directory Structure](#directory-structure)
* [Setup](#setup)
* [Features](#features)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
主要演示以下内容：
* 工程和模块的区别
 <!--
    工程和模块的区别：
    工程不等于完整的项目，模块也不等于完整的项目，一个完整的项目看的是代码，代码完整，就可以说这是一个完整的项目
    和此项目是工程和模块没有关系。

    工程天生只能使用自己内部资源，工程天生是独立的。后天可以和其他工程或模块建立关联关系。
    模块天生不是独立的，模块天生是属于父工程的，模块一旦创建，所有父工程的资源都可以使用。

    父子工程直接，子模块天生集成父工程，可以使用父工程所有资源。
    子模块之间天生是没有任何关系的。

    父子工程直接不用建立关系，继承关系是先天的，不需要手动建立。

    平级直接的引用叫依赖，依赖不是先天的，依赖是需要后天建立的。
    -->
* SSM框架分模块开发，Dao、Service与Controller组成依赖，编辑pom文件与applicationContext.xml
* 三种运行SSM多模块项目方式
* Maven私服jar上传与下载
* 
## Screenshots
![image](image.png)
## Technologies
* Maven
* Spring
* Spring MVC
* Tomcat
* Mybatis
## Project architecture
## Directory Structure
## Setup
1. 首先建立构思ssm项目模块，用maven建立多模块项目，模块之间的依赖关系，将公用依赖包放在parent项目pom文件中；
2. 由Dao层-->Service层-->Controller层项目逐步开发项目，分别配置spring的配置文件applicationContext.xml；
3. 运行SSM多模块项目：

- 方法一 运行parent项目：插件-tomcat7:run
- 方法二 运行maven_web项目，首先要在父项目执行mvn install
- 方法三 运行自己的Tomcat，新建编辑Edit Configuration,
4. 远程仓库安装与配置，配置releases-发行版、snapshot-测试版、thirdpart-第三方仓库以及maven2-central仓库组成的java-group,在maven
配置文件setting.xml中配置远程仓库server和开发环境profiles，parent-pom中添加profiles+distributionManagement属性；

## Code Examples
Show examples of usage:
`put-your-code-here`
## Features
List of features ready and TODOs for future development
* Awesome feature 1
To-do list:
* Wow improvement to be done 1
## Status
Project is: _in progress_, _finished_, _no longer continue_ and why?
## Inspiration
Add here credits. Project inspired by..., based on...
## Contact
Created by [@JClearLove](https://www.flynerd.pl/) - feel free to contact me!
    