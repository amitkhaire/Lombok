Project Lombok
Project Lombok is a Java library that automatically plugs into your editor and build tools and helps reduce the boilerplate code. Let’s see how Lombok project works first.
How does Java Project Lombok work?
Imagine that you are coding a Java application and creating a plain old Java object (POJO), a Java class with several private fields that will require getter and setter methods to provide access. How many lines of code will be needed to generate getters and setters for each of the fields? Moreover, adding a constructor and a toString() method will cause even more lines of code and clutter. That is a lot of boilerplate code. How about when you are utilizing Java objects that need to be closed after use, so you need to code a finally block or use try-with-resources to ensure that the object closing occurs? Adding finally block boilerplate to close objects can add a significant amount of clutter to your code.
Lombok has various annotations which can be used within our code that is being processed during the compile-time and appropriate code expansion would take place based on the annotation used.

Lombok only does the code reduction in view time, after compiling the byte code is injected with all the boilerplate. This helps to keep our codebase small, clean and easy to read and maintain.
Project Lombok Maven
Follow below steps to setup Lombok in your Java projects:
Create a simple maven project using - How to Create a Simple Maven Project in Eclipse article.
Add the below dependency in your maven project pom.xml file:

<!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.4</version>
    <scope>provided</scope>
</dependency>

Adding the Lombok Plugin in IDE (Eclipse)
Here are the installation steps to setup eclipse for Windows:
Downloaded jar from https://projectlombok.org/download or use the jar which is downloaded from your maven build.
Execute command in terminal: java -jar lombok.jar
This command will open window as shown in the picture below, install and quit the installer and restart eclipse.




