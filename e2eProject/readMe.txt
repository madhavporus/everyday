
// Project location in my local: /Users/madhavareddy/eclipse-workspace/everyday/e2eProject
// To try running this test, go to "/e2eProject/src/test/java/com/y18/e2eProject/tests"
// run the UITests.java


/*
 * Best practice followed in this test is: Separated all navigational steps to corresponding pages and used 
 * PageFactory to initiate elements and methods of the pages classes.
 * Used 2 different techniques one is using Gson library(For homepage) and another one is SimpleJson(StatesPage and other)
 * Used explicit wait mechanism and came up with a reusable method where I can just pass driver, element and time I wish webdriver to wait
 * this method is in Browser class with name "explictWaitTillElmAvailable"
 */
 
 GoTo class: ( We can also use the name as 'Pages' )
 Used an intermediate Class called 'GoTo' in order to initiate each page using PageFactory and returning the object of that page
 so that the calling tests can simple use the page object and call it methods (Like GetPageTitle, NavigateToOrderPage etc..)
 so that Tests can only have the calls to get the end result on each page and perform assertions on them.
 
 In GoTo Class, each initiation methods of each page receives the 'Browser Type' and passes it to Browser class to initiate the drive with desired browser. 
 then we pass that driver to the PageFactory's initElements along with the PageObject we wish to initiate.
 Then this method returns the corresponding Page's object.
 
 Browser Class:
 This class contains a method called browser, which takes the browser kind and initiates the browser on the corresponding driver and returns it.
  
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 ---Maven pop file used:
 <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.y18</groupId>
  <artifactId>e2eProject</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>jar</packaging>

  <name>e2eProject</name>
  <url>http://maven.apache.org</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>

  <dependencies>
	
  <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.11.0</version>
</dependency>
  
  
  <dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>6.8</version>
    <scope>test</scope>
  </dependency>
  
  <!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
<dependency>
    <groupId>com.googlecode.json-simple</groupId>
    <artifactId>json-simple</artifactId>
    <version>1.1.1</version>
</dependency>
  
  
  <!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
  <dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.2</version>
  </dependency>  
</dependencies>


   <build>
    <pluginManagement>
      <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.7.0</version>
          <configuration>
            <source>1.8</source>
            <target>1.8</target>
          </configuration>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
</project>
 