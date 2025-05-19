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
#### Run a specific tag
mvn clean test -D"cucumber.filter.tags=@Reg_Cart_001"
OR
#### Run multiple specific tags
mvn clean test -D"cucumber.filter.tags=@Reg_Cart_002 or @Reg_Cart_003"
