package basetest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.audits.model.GenericIssueErrorType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTestCase {
    //protected static WebDriver driver;
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    protected static Logger logger = LogManager.getLogger();
    protected final String CHROME_VALUE = "chrome";
    protected final String EDGE_VALUE = "edge";
    //protected final String DEFAULT_URL = "https://www.lazada.vn/";
    protected final String DEFAULT_URL = "https://www.thegioididong.com/";

    protected static Scenario scenarioName;

    @BeforeMethod
    @Parameters({"browser", "url"})
    public void startTest(@Optional(CHROME_VALUE) String browser, @Optional(DEFAULT_URL) String url){
        openBrowser(browser);
        //driver.get(url);
//        getDriver().get(url);
    }
    public void setUp(){
        System.out.println("Browser setup by Thread : " + Thread.currentThread().getId() + " and Driver reference is : "
                + getDriver());
        openBrowser(CHROME_VALUE);
        getDriver().get(DEFAULT_URL);
        //driver.get(DEFAULT_URL);
    }

    public WebDriver openBrowser(String browser){
        switch (browser.toLowerCase()){
            case CHROME_VALUE:
                WebDriverManager.chromedriver().setup();
                //driver = new ChromeDriver();
                driver.set(new ChromeDriver());
                break;
            case EDGE_VALUE:
                WebDriverManager.edgedriver().setup();
                //driver = new EdgeDriver();
                driver.set(new EdgeDriver());
                break;
            default:
                throw new IllegalArgumentException(browser + " is unsupported");
        }
        getDriver().manage().window().maximize();
        //driver.manage().window().maximize();

        return getDriver();
        //return driver;
    }

    @AfterMethod
    public void closeBrowser(){
        //driver.quit();
//        driver.get().close();
//        driver.remove();
    }

    public void tearDown(){
        System.out.println("Browser closed by Thread : " + Thread.currentThread().getId()
                + " and Closing driver reference is :" + getDriver());
        driver.get().quit();
        driver.remove();
        //driver.quit();
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public void compareEqualText(String actualTxt, String expectedTxt){
        Assert.assertEquals(actualTxt, expectedTxt);
    }
    public void containText(String parentTxt, String text){
        boolean flag = false;
        if (parentTxt.contains(text)) {
            flag = true;
        }
        Assert.assertTrue(flag);
    }

}
