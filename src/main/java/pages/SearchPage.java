package pages;

import core.bases.CustomKeywords;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends CustomKeywords {
    protected SearchPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    @FindBy(xpath = "//input[@id='skw']")
    protected WebElement searchBoxLocator;

    @FindBy(xpath = "//div[@id='filter-aj']//p[@class='sort-total']")
    protected WebElement foundOneResultTxtLocator;

    @FindBy(xpath = "//h3[preceding-sibling::p[contains(@class,'result-label')]]")
    protected WebElement productNameTxtLocator;

    @FindBy(xpath = "//strong[preceding-sibling::p[contains(@class,'result-label')]]")
    protected WebElement productPriceTxtLocator;

    @FindBy(xpath = "//input[@placeholder='To']")
    protected WebElement toTxtLocator;

    @FindBy(xpath = "//a[@id='closebutton']")
    protected WebElement confirmBtnLocator;

    @FindBy(xpath = "//span[@id='ssw-search-button-container']/a")
    protected WebElement searchBtnLocator;
}
