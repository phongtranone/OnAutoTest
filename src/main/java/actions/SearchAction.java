package actions;

import core.utils.Log;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.SearchPage;

public class SearchAction extends SearchPage {
    public SearchAction(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void searchTheProductName(String productNameTxt){
        Log.info("ENTER THE PRODUCT NAME: " + productNameTxt);
        enterSearches(searchBoxLocator, productNameTxt);
    }

    public String getTheFoundResultText(){
        pause(2000);
        return getTextValue(foundOneResultTxtLocator);
    }

    public String getProductNameText(){
        return getTextValue(productNameTxtLocator);
    }

    public String getProductPriceText(){
        String actualProductPriceTxt = getTextValue(productPriceTxtLocator);
        actualProductPriceTxt = actualProductPriceTxt.replaceAll("[^0-9.]+","");
        return actualProductPriceTxt;
    }

    public void enterDestinationValue(String toValue){
        Log.info("ENTER DESTINATION: " + toValue);
        enterSearches(toTxtLocator, toValue);
    }

    public void enterSearches(WebElement element, String searchText){
        clickOnElement(element);
        enterDataBySendKey(element, searchText);
        pause(3000);
        pressEnterKeyBoard(element);
    }

    public void confirmFlightDate(){
        //log.info("CONFIRM FLIGHT DATE");
        Log.info("CONFIRM FLIGHT DATE");
        clickOnElement(confirmBtnLocator);
    }
    public void clickOnTheSearchButton(){
        //log.info("CLICK ON THE SEARCH BUTTON");
        Log.info("CLICK ON THE SEARCH BUTTON");
        clickOnElement(searchBtnLocator);
    }
}
