package pages;

import core.bases.CustomKeywords;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SnapSearchPage extends CustomKeywords {
    protected SnapSearchPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    @FindBy(xpath = "//input[@placeholder='From']")
    protected WebElement fromTxtLocator;

    @FindBy(xpath = "//input[@placeholder='To']")
    protected WebElement toTxtLocator;

    protected WebElement sectionLocator(String destinationValue){
        return driver.findElement(By.xpath(String.format("//span[text()='%s']",destinationValue)));
    }

    @FindBy(xpath = "//a[@id='closebutton']")
    protected WebElement confirmBtnLocator;

    @FindBy(xpath = "//span[@id='ssw-search-button-container']/a")
    protected WebElement searchBtnLocator;
}
