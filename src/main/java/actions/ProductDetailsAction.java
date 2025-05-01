package actions;

import core.utils.Common;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.ProductDetailsPage;

public class ProductDetailsAction extends ProductDetailsPage {
    public ProductDetailsAction(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void goToTheProductSpecification(){
        scrollToElement(productSpecificationLocator);
    }

    public boolean verifySpecificationItem(String specificationItemTxt){
        pause(2000);
        goToTheProductSpecification();
        specificationItemXpath = String.format(specificationItemXpath, specificationItemTxt);
        pause(2000);
        return checkVisibilityOfElement(driver.findElement(By.xpath(specificationItemXpath)));
    }

    public void addProductToCart(){
        pause(2000);
        scrollToElement(addToCartBtnLocator);
        javaScriptClickOnElement(addToCartBtnLocator);
    }

    public String getNumberOfProductInTheCart(){
        return getTextValue(numberOfProductOfCartLocator);
    }

    public void viewCartDetails(){
        pause(2000);
        clickOnElement(cartBtnLocator);
        pause(2000);
    }
}
