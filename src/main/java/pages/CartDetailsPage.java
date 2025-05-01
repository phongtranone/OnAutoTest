package pages;

import core.bases.CustomKeywords;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartDetailsPage extends CustomKeywords {
    protected CartDetailsPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    @FindBy(xpath = "//a[@class='product-item__name']")
    protected WebElement productNameLocator;
    @FindBy(xpath = "//div[@class='price-original']")
    protected WebElement originalPriceOfProductLocator;

}
