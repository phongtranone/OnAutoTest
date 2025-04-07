package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@RegressionTestingGroup3", features = {"src/test/java"},
        glue = {"stepdefinitions"},
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports/Cucumber.html"},
        monochrome = true)

public class RegressionTestGroup3Runner extends AbstractTestNGCucumberTests{}
