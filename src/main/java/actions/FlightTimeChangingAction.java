package actions;

import core.utils.Log;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.FlightTimeChangingPage;

public class FlightTimeChangingAction extends FlightTimeChangingPage {
    protected static String departTimeOfDepartingFlight;
    protected static String arrivalTimeOfDepartingFlight;
    protected static String departTimeOfReturningFlight;
    protected static String arrivalTimeOfReturningFlight;
    public FlightTimeChangingAction(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void selectAnotherDepartingFlight(){
        Log.info("CHANGE FLIGHT TIME");
        pause(2000);
        int index = randomInt(selectBtn.size());
        setDepartTimeOfDepartingFlight(index);
        setArrivalTimeOfDepartingFlight(index);

        Log.info("NEW DEPARTING FLIGHT TIME CHANGED: " + getDepartTimeOfDepartingFlight() +
                " - " + getArrivalTimeOfDepartingFlight());
        scrollUntilElementAndClick(selectBtn.get(index));

        pause(2000);

        /**
         * Index 0 for current selected flight
         **/
        setDepartTimeOfReturningFlight(0);
        setArrivalTimeOfReturningFlight(0);
        Log.info("CURRENT RETURNING FLIGHT TIME: " + getDepartTimeOfReturningFlight()
        + " - " + getArrivalTimeOfReturningFlight());

        clickOnElement(confirmBtn);
    }

    public void setDepartTimeOfDepartingFlight(int index){
        departTimeOfDepartingFlight = departTimeOfDepartingFlightTextLocator.get(index).getText();
    }

    public void setArrivalTimeOfDepartingFlight(int index){
        arrivalTimeOfDepartingFlight = arrivalTimeOfDepartingFlightTextLocator.get(index).getText();
    }

    public void setDepartTimeOfReturningFlight(int index){
        departTimeOfReturningFlight = departTimeOfReturningFlightTextLocator.get(index).getText();
    }

    public void setArrivalTimeOfReturningFlight(int index){
        arrivalTimeOfReturningFlight = arrivalTimeOfReturningFlightTextLocator.get(index).getText();
    }

    public String getDepartTimeOfDepartingFlight(){
        return departTimeOfDepartingFlight.trim();
    }

    public String getArrivalTimeOfDepartingFlight(){
        return arrivalTimeOfDepartingFlight.trim();
    }

    public String getDepartTimeOfReturningFlight(){
        return departTimeOfReturningFlight.trim();
    }

    public String getArrivalTimeOfReturningFlight(){
        return arrivalTimeOfReturningFlight.trim();
    }
}
