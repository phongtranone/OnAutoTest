package basetest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTestCase {
    protected static WebDriver driver;
    protected static Logger logger = LogManager.getLogger();
    protected final String CHROME_VALUE = "chrome";
    protected final String EDGE_VALUE = "edge";
    protected final String DEFAULT_URL = "https://www.airasia.com/en/gb";

    protected static Scenario scenarioName;

    @BeforeMethod
    @Parameters({"browser", "url"})
    public void startTest(@Optional(CHROME_VALUE) String browser, @Optional(DEFAULT_URL) String url){
        openBrowser(browser);
        driver.get(url);
    }
    public void setUp(){
        openBrowser(CHROME_VALUE);
        driver.get(DEFAULT_URL);
    }

    public WebDriver openBrowser(String browser){
        switch (browser.toLowerCase()){
            case CHROME_VALUE:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case EDGE_VALUE:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException(browser + " is unsupported");
        }
        driver.manage().window().maximize();
        return driver;
    }

    @AfterMethod
    public void closeBrowser(){
        //driver.quit();
    }

    public void tearDown(){
        driver.quit();
    }

}
