package pages;

import core.bases.CustomKeywords;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartDetailsPage extends CustomKeywords {
    protected CartDetailsPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    @FindBy(xpath = "//a[@class='product-item__name']")
    protected WebElement productNameLocator;
    @FindBy(xpath = "//div[@class='price-original']")
    protected WebElement originalPriceOfProductLocator;
    @FindBy(xpath = "(//div[@class='product-quantity']/button[@class='product-quantity__remove'])[1]")
    protected WebElement removeProductBtnLocator;
    @FindBy(xpath = "//div[contains(@class,'confirm-delete-product')]/div/div/button[2]")
    protected WebElement confirmDeleteBtnLocator;
    @FindBy(xpath = "//i[@class='iconcart-empty']")
    protected WebElement emptyCartIconLocator;
    @FindBy(xpath = "//div[@class='product-quantity']/button[@class='product-quantity__remove']")
    protected List<WebElement> listOfRemoveProductBtnLocator;

    @FindBy(xpath = "//button[@class='disableQuantity']")
    protected WebElement plusBtnLocator;
    @FindBy(xpath = "//input[@class='no-spinners']")
    protected WebElement quantityTextLocator;

}
