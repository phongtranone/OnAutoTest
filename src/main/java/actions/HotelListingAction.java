package actions;

import core.utils.Log;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.HotelListingPage;

public class HotelListingAction extends HotelListingPage {
    public HotelListingAction(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void clickOnTheChangeBtn(){
        clickOnElement(changeFlightBtn);
    }

    public String getDepartTimeOfDepartingFlight(){
        String timeValue = getTextValue(departTimeOfDepartingFlightLocator);
        Log.info("HOTEL LISTING PAGE -  DEPART TIME OF DEPARTING FLIGHT: " + timeValue);
        return timeValue;
    }

    public String getArrivalTimeOfDepartingFlight(){
        String timeValue = getTextValue(arrivalTimeOfDepartingFlightLocator);
        Log.info("HOTEL LISTING PAGE - ARRIVAL TIME OF DEPARTING FLIGHT: " + timeValue);
        return timeValue;
    }

    public String getDepartTimeOfReturningFlight(){
        String timeValue = getTextValue(departTimeOfReturningTimeLocator);
        Log.info("HOTEL LISTING PAGE - ARRIVAL TIME OF RETURNING FLIGHT: " + timeValue);
        return timeValue;
    }

    public String getArrivalTimeOfReturningFlight(){
        String timeValue = getTextValue(arrivalTimeOfReturningTimeLocator);
        Log.info("HOTEL LISTING PAGE - ARRIVAL TIME OF RETURNING FLIGHT: " + timeValue);
        return timeValue;
    }

    public void searchHotel(String searchText){
        //enterDataBySendKey(hotelSearchBoxLocator, searchText);
        pause(4000);
        enterDataByKeyboard(hotelSearchBoxLocator, searchText);
        clickOnElement(hotelDropdownSearchResultLocator(searchText));
    }

    public boolean verifyYourSearchedHotel(){
        boolean flag = false;
        scrollToElement(yourSearchedHotelLocator);
        if(checkElementDisplayed(yourSearchedHotelLocator)){
            if(checkVisibilityOfElement(yourSearchedHotelLocator)){
                flag = true;
            }
        }
        return flag;
    }
}
