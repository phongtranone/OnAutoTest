package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/java"},
        glue = {"stepdefinitions"},
        tags = "@FunctionalTesting",
        plugin = {"pretty", "html:target/cucumber-reports/Cucumber.html",
                "pretty", "json:target/cucumber-reports/Cucumber.json",
                "pretty", "json:target/cucumber-reports/Cucumber.xml",
                "timeline:target/cucumber-reports"
                },
        monochrome = true)

public class FunctionalTestRunner extends AbstractTestNGCucumberTests{
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
