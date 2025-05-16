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
- Parallel execution via TestNG XML
- Page Object Model (POM) design pattern
- Data-driven testing using Excel/CSV/JSON
- CI/CD integration with Jenkins
- Cucumber HTML and extent reports

---

## 🛠️ Technology Stack

- Java
- Selenium WebDriver
- Cucumber
- TestNG
- Maven
- Jenkins
- Git
- Extent Reports or Cucumber Reports

---

## 📁 Project Structure

```text
HybridFramework/
├── src/test/java/
│   ├── stepdefinitions/
│   ├── runners/
│   ├── pageobjects/
│   ├── utilities/
│   └── testng/
├── src/test/resources/
│   ├── features/
│   └── config.properties
├── test-output/                # TestNG reports
├── target/                     # Compiled output
├── pom.xml
├── Jenkinsfile (if using pipeline)
└── README.md

