package samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {


    //public static WebDriver driver;
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();


    @BeforeClass
    public void setDriver()
    {
        //driver = new ChromeDriver();
//        System.out.println(
//                "Browser setup by Thread : " + Thread.currentThread().getId() + " and Driver reference is : " + driver);


        driver.set(new ChromeDriver());
        System.out.println("Browser setup by Thread : " + Thread.currentThread().getId() + " and Driver reference is : "
                + getDriver());
    }

    public WebDriver getDriver() {
        return driver.get();
    }


    @AfterClass
    public void closeBrowser() {
        System.out.println("Browser closed by Thread : " + Thread.currentThread().getId()
                + " and Closing driver reference is :" + getDriver());
        driver.get().close();
        driver.remove();
        //        System.out.println("Browser closed by Thread : " + Thread.currentThread().getId()
//                + " and Closing driver reference is :" + driver);
//        driver.quit();
    }
}
