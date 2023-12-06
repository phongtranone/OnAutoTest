package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@SmokeTesting", features = {"src/test/java/features"},
        glue = {"stepdefinitions"},
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports/Cucumber.html"},
        monochrome = true)

public class MYWebTestRunner extends AbstractTestNGCucumberTests{}
