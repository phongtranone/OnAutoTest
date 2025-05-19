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
- [Best Practices](#best-practices)
- [Contributing](#contributing)
- [License](#license)


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
- Enable the option "This project is parameterized" and create some parameters:
![image](https://github.com/user-attachments/assets/e91a9644-9e94-4b21-9927-1b3d3b9923b5)
![image](https://github.com/user-attachments/assets/1212a646-f461-4745-8809-e00fb03cc2ac)
![image](https://github.com/user-attachments/assets/2d3d7b14-c277-447f-b1f8-12f85121a163)
![image](https://github.com/user-attachments/assets/6bcc7475-22d8-413d-b106-7f28609553c5)


- Configure GitHub repository:
![image](https://github.com/user-attachments/assets/d517e0ba-e92b-4454-bca4-0976625734c2)

- Configure Maven build step:
![image](https://github.com/user-attachments/assets/a0112b50-b41b-4bfb-b680-ae43f44468aa)
- 


Use the following command in "Build" step:
