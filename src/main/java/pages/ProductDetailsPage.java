package pages;

import core.bases.CustomKeywords;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends CustomKeywords {
    protected ProductDetailsPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    @FindBy(xpath = "//div[contains(@class,'specifications')]//div[@class='specification-item ']")
    protected WebElement productSpecificationLocator;
    @FindBy(xpath = "//a[@class='btn-buynow white']")
    protected WebElement addToCartBtnLocator;
    @FindBy(xpath = "//div[@class='box-cart']/span[@class='cart-number has-cart']")
    protected WebElement numberOfProductOfCartLocator;
    @FindBy(xpath = "//a[@id='cart-box']/span")
    protected WebElement cartBtnLocator;


    protected String specificationItemXpath = "//*[contains(text(),'%s')]";
}
