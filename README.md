# OnAutoTest
This Hybrid Automation Test Framework was built using Cucumber (BDD), Selenium WebDriver, and TestNG. It is engineered for robust functional testing across web applications and is designed for seamless integration within CI/CD pipelines in a DevOps environment.

## 📌 Table of Contents

- [Features](#features)
- [Technology Stack](#technology-stack)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Execution Instructions](#execution-instructions)
- [Jenkins Integration](#jenkins-integration)
- [Reporting](#reporting)
- [Author](#author)


## 🚀 <a name="features"></a> Features

- Behavior-Driven Development with Cucumber
- Selenium WebDriver for browser automation
- TestNG for test execution and assertions
- Parallel execution via DataProvider in TestNG
- Page Object Model (POM) design pattern
- CI/CD integration with Jenkins
- Cucumber HTML report

## 🛠️ <a name="technology-stack"></a> Technology Stack

- Java
- Selenium WebDriver
- Cucumber
- TestNG
- Maven
- Jenkins
- Git
- Cucumber Reports

## 📁 <a name="project-structure"></a> Project Structure
### The directory structure for this project is outlined below:

![image](https://github.com/user-attachments/assets/178686b8-b2ee-48f6-ad33-ce973b0cfcc9)

## 🧰 <a name="getting-started"></a> Getting Started
### Prerequisite

- Java JDK 21+
- Maven 3.5.3+
- IDE: IntelliJ IDEA

### Installation
- git clone https://github.com/phongtranone/OnAutoTest.git
- Open the project directory in the IDE

## ▶️ <a name="execution-instructions"></a> Execution Instructions
### Run feature files
- Execute Cucumber Features by right-clicking on a feature file, such as TestForACommonFlow.feature

### Run test suites with Maven + TestNG
- Open the terminal from the IDE
- Execute a test suite like FunctionalTest
- mvn clean test -DxmlFile="FunctionalTest.xml"

### Run Cucumber Feature with Specific Tags
#### Example: run a specific tag
mvn clean test -D"cucumber.filter.tags=@Reg_Cart_001"
#### Example: execute multiple specific tags
mvn clean test -D"cucumber.filter.tags=@Reg_Cart_002 or @Reg_Cart_003"

### Execute a test suite in parallel with a specific thread count
Example: run Regression test suite with 6 threads,
mvn clean test -DxmlFile="RegressionTest.xml" -Dthreadcount=6 -D"cucumber.filter.tags=@RegressionTesting"

## ⚙️ <a name="jenkins-integration"></a> Execution Instructions Jenkins Integration
- Create a Jenkins job (Freestyle or Pipeline).
- Enable the option "This project is parameterized" and create 3 parameters (TAG_NAME, THREAD_COUNT, TEST_XML):
![image](https://github.com/user-attachments/assets/e91a9644-9e94-4b21-9927-1b3d3b9923b5)
![image](https://github.com/user-attachments/assets/1212a646-f461-4745-8809-e00fb03cc2ac)
![image](https://github.com/user-attachments/assets/6bcc7475-22d8-413d-b106-7f28609553c5)


- Configure GitHub repository with your repo and your credential:
![image](https://github.com/user-attachments/assets/840fa497-3d95-421f-8cc8-5a3faa46d7fe)


- Configure Maven build step with parameters created above:
![image](https://github.com/user-attachments/assets/a0112b50-b41b-4bfb-b680-ae43f44468aa)
- Enable the plugin for the Cucumber report and Slack notification (optional) with the guidelines below
![image](https://github.com/user-attachments/assets/7c4ed681-806d-4126-b398-5bc82169555b)

Follow the guideline to enable Jenkin plugin for the Cucumber HTML report and Slack notification:
- https://plugins.jenkins.io/cucumber-reports/
- https://plugins.jenkins.io/slack/
- https://www.youtube.com/watch?v=EDVZli8GdUM

## 📊 <a name="reporting"></a> Reporting
### Cucumber HTML report
![image](https://github.com/user-attachments/assets/b26a7699-5905-4e33-8aac-9c38d53e42d7)

### Slack notification
![image](https://github.com/user-attachments/assets/eb10a1bd-8748-4fd4-8d70-df9804898597)


##
## 📄 <a name="author"></a> Author
 <a href='https://www.linkedin.com/in/phong-tran-476576102/'>Phong Tran</a>
