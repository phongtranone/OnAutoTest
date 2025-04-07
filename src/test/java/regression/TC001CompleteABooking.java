package regression;

import actions.HomePageAction;
import actions.SearchAction;
import basetest.BaseTestCase;
import core.model.ProDataInputObj;
import dataproviders.ProDataProvider;
import org.testng.annotations.Test;

public class TC001CompleteABooking extends BaseTestCase {
    @Test(dataProvider = "pro_data_provider", dataProviderClass = ProDataProvider.class)
    public void CompleteABooking(ProDataInputObj proDataInputObj){
//        String DEPARTURE_VALUE = proDataInputObj.getDeparture().trim();
//        String DESTINATION_VALUE = proDataInputObj.getDestination().trim();
//        String DEPARTURE_DATE = proDataInputObj.getDepartDate().trim();
//        String RETURN_DATE = proDataInputObj.getReturntDate().trim();
//
//        HomePageAction homePageAction = new HomePageAction(getDriver(), logger);
//        SearchAction snapSearchAction = new SearchAction(getDriver(), logger);
//
//        homePageAction.goToHomePage();
//        snapSearchAction.searchTheProductName(DEPARTURE_VALUE);
//        snapSearchAction.enterDestinationValue(DESTINATION_VALUE);
//        snapSearchAction.confirmFlightDate();
//        snapSearchAction.clickOnTheSearchButton();
    }
}
