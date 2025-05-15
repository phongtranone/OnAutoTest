package actions;

import core.utils.Common;
import core.utils.Log;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CartDetailsPage;
import pages.SearchPage;

public class CartDetailsAction extends CartDetailsPage {
    public CartDetailsAction(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public String getProductName(){
        pause(2000);
        return getTextValue(productNameLocator);
    }
    public String getOriginalPriceOfProduct(){
        pause(2000);
        return getTextValue(originalPriceOfProductLocator);
    }

    public void deleteProductInTheCart(){
        pause(2000);
        clickOnElement(removeProductBtnLocator);
        fluentWaitForVisibilityOfElement(confirmDeleteBtnLocator);
        clickOnElement(confirmDeleteBtnLocator);
    }
    public boolean verifyCartIsEmpty(){
        pause(2000);
        return emptyCartIconLocator.isDisplayed();
    }

    public void removeAllProductInTheCart(){
        int count = listOfRemoveProductBtnLocator.size();
        while (count != 0){
            deleteProductInTheCart();
            count = count - 1;
        }
    }

    public void increaseQuantity(String quantity ){
        pause(2000);
        int expectedQuantity = Common.convertStringToInteger(quantity);
        int currentQuantity = Common.convertStringToInteger(quantityTextLocator.getText());
        while (expectedQuantity != currentQuantity){
            clickOnElement(plusBtnLocator);
            pause(1000);
            currentQuantity = currentQuantity + 1;
        }
    }

    public String getCurrentQuantity(){
        pause(1000);
        return quantityTextLocator.getText();
    }
}
