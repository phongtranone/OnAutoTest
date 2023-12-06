package pages;

import core.bases.CustomKeywords;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CustomKeywords {
    protected HomePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    @FindBy(xpath = "//p[text()='SNAP (Flight+Hotel)']")
    protected WebElement snapMenu;

}
