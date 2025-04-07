package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "rerun:target/cucumber-reports/rerun.txt"
        }
        )

public class suiteRunner{}
