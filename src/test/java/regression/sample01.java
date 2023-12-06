package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class sample01 {
    WebDriver driver;
    Logger log = LogManager.getLogger(this.getClass());
    @Test
    public void testcase() throws InterruptedException {
        String snapMenu = "//p[text()='SNAP (Flight+Hotel)']";
        String fromTxt = "//input[@placeholder='From']";
        String fromOption = "//span[text()='KUL']";

        String toText = "//input[@placeholder='To']";
        String toOption = "//span[text()='LGK']";

        String confirmDateBtn = "//a[@id='closebutton']";
        String searchBtn = "//span[@id='ssw-search-button-container']/a";
        String denyBtn = "//button[contains(@id,'cancel')]";

        String searchBox = "//div[@id='hotel-name-search-widget']//input";
        String dropdownSearch = "//span[contains(text(),'Dayang Bay Resort')]";
        String filterText = "//div[@id='filter-title111']";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.airasia.com/en/gb");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(snapMenu))));

        driver.findElement(By.xpath(snapMenu)).click();
        Thread.sleep(2000);

//        if(driver.findElement(By.xpath(denyBtn)).isDisplayed()){
//            driver.findElement(By.xpath(denyBtn)).click();
//        }

        driver.findElement(By.xpath(fromTxt)).click();
        //Thread.sleep(1000);
        driver.findElement(By.xpath(fromTxt)).sendKeys("KUL");
        Thread.sleep(2000);
        driver.findElement(By.xpath(fromOption)).click();

        driver.findElement(By.xpath(toText)).click();
        driver.findElement(By.xpath(toText)).sendKeys("LGK");
        Thread.sleep(2000);
        driver.findElement(By.xpath(toOption)).click();

        driver.findElement(By.xpath(confirmDateBtn)).click();

        driver.findElement(By.xpath(searchBtn)).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath(searchBox)).sendKeys("Dayang Bay Resort");
        fluentWaitForVisibilityOfElement();
        //driver.findElement(By.xpath(dropdownSearch)).click();
        //driver.findElement(By.xpath(filterText)).click();

    }

    public void fluentWaitForVisibilityOfElement(){
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        try{
            wait.withTimeout(Duration.ofSeconds(20));
            wait.pollingEvery(Duration.ofSeconds(2));
            wait.ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='filter-title111']")));
            //wait.until(ExpectedConditions.)
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @AfterTest
    public void closeBrowser(){
        //driver.quit();
    }

}
