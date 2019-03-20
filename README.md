# Spring Boot Hello World Example

Spring Boot , Hello World Example

# Introduction
Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need very little Spring configuration.

# Features
Create stand-alone Spring applications
Embed Tomcat, Jetty or Undertow directly (no need to deploy WAR files)
Provide opinionated 'starter' dependencies to simplify your build configuration
Automatically configure Spring and 3rd party libraries whenever possible
Provide production-ready features such as metrics, health checks and externalized configuration
Absolutely no code generation and no requirement for XML configuration

# Technologies stack:

Spring Boot 2.1.3.RELEASE
Maven
JDK 1.8
Create Project:

# To Create Project with spirng boot use https://start.spring.io/ which allow you to download .zip files. After download extract and import with IDE.

# Project Dependencies:

		<!-- Need this to compile JSP -->
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
			<scope>provided</scope>
		</dependency>

# Run Application: 

Now Run Main Class (where public static void main method define) from base package, In our case we have "SpringHelloWorldApplication", It will run tomcat with port 8080

# http://localhost:8080/
                                                                                                     

