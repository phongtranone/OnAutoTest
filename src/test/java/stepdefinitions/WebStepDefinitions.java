package stepdefinitions;

import actions.FlightTimeChangingAction;
import actions.HomePageAction;
import actions.HotelListingAction;
import actions.SnapSearchAction;
import basetest.BaseTestCase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class WebStepDefinitions extends BaseTestCase {
    HomePageAction homePageAction;
    SnapSearchAction snapSearchAction;
    HotelListingAction hotelListingAction;
    FlightTimeChangingAction flightTimeChangingAction;

    @Before
    public void setUp(){
        super.setUp();
    }

    @BeforeStep
    public void initPageObjects(){
        homePageAction = new HomePageAction(driver, logger);
        snapSearchAction = new SnapSearchAction(driver, logger);
        hotelListingAction = new HotelListingAction(driver, logger);
        flightTimeChangingAction = new FlightTimeChangingAction(driver, logger);
    }

    @After
    public void tearDown(){
        //super.tearDown();
    }


    @Given("Go to the Snap search page")
    public void goToTheSnapSearchPage() {
        homePageAction.goToSnap();
    }

    @And("Enter the departure {string}")
    public void enterTheDeparture(String departureFrom) {
        snapSearchAction.enterDepartureValue(departureFrom);
    }

    @And("Enter the destination {string}")
    public void enterTheDestination(String destinationTo) {
        snapSearchAction.enterDestinationValue(destinationTo);
    }

    @And("Enter flight date")
    public void enterFlightDate(){
        snapSearchAction.confirmFlightDate();
    }

    @And("Click on the search button")
    public void clickOnTheSearchButton(){
        snapSearchAction.clickOnTheSearchButton();
    }

    @When("Change flight with random any departure time")
    public void changeFlightWithRandomAnyDepartureTime(){
        hotelListingAction.clickOnTheChangeBtn();
        flightTimeChangingAction.selectAnotherDepartingFlight();
    }

    @Then("New departure time should be updated on the hotel listing")
    public void newDepartureTimeShouldBeUpdatedOnTheHotelListing(){
        Assert.assertEquals(hotelListingAction.getDepartTimeOfDepartingFlight(), flightTimeChangingAction.getDepartTimeOfDepartingFlight());
        Assert.assertEquals(hotelListingAction.getArrivalTimeOfDepartingFlight(), flightTimeChangingAction.getArrivalTimeOfDepartingFlight());

        Assert.assertEquals(hotelListingAction.getDepartTimeOfReturningFlight(), flightTimeChangingAction.getDepartTimeOfReturningFlight());
        Assert.assertEquals(hotelListingAction.getArrivalTimeOfReturningFlight(), flightTimeChangingAction.getArrivalTimeOfReturningFlight());
    }

    @When("Enter a hotel in the search box {string}")
    public void enterHotelInTheSearchBox(String hotelSearchText){
        hotelListingAction.searchHotel(hotelSearchText);
    }

    @Then("The hotel should be displayed in your search result")
    public void theHotelShouldBeDisplayedInYourSearchResult(){
        Assert.assertTrue(hotelListingAction.verifyYourSearchedHotel());
    }
}
