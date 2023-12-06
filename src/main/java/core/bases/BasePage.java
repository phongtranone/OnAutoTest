package core.bases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    protected Logger log;
    protected BasePage(WebDriver driver, Logger log){
        this.driver = driver;
        this.log = log;
        PageFactory.initElements(driver, this);
    }

    protected void goToURL(String url){
        driver.get(url);
    }
}
