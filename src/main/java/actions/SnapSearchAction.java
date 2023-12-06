package actions;

import core.utils.Log;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.SnapSearchPage;

public class SnapSearchAction extends SnapSearchPage {
    public SnapSearchAction(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void enterDepartureValue(String fromValue){
        Log.info("ENTER DEPARTURE: " + fromValue);
        enterSearches(fromTxtLocator, fromValue);
    }

    public void enterDestinationValue(String toValue){
        Log.info("ENTER DESTINATION: " + toValue);
        enterSearches(toTxtLocator, toValue);
    }

    public void enterSearches(WebElement element, String searchText){
        clickOnElement(element);
        enterDataBySendKey(element, searchText);
        pause(1000);
        clickOnElement(sectionLocator(searchText));

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
