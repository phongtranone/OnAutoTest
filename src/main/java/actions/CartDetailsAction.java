package actions;

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

}
