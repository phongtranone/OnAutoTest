package regression;

import actions.HomePageAction;
import actions.SnapSearchAction;
import basetest.BaseTestCase;
import core.bases.CustomKeywords;
import core.model.ProDataInputObj;
import core.utils.Common;
import dataproviders.ProDataProvider;
import org.testng.annotations.Test;

public class TC001CompleteABooking extends BaseTestCase {
    @Test(dataProvider = "pro_data_provider", dataProviderClass = ProDataProvider.class)
    public void CompleteABooking(ProDataInputObj proDataInputObj){
        String DEPARTURE_VALUE = proDataInputObj.getDeparture().trim();
        String DESTINATION_VALUE = proDataInputObj.getDestination().trim();
        String DEPARTURE_DATE = proDataInputObj.getDepartDate().trim();
        String RETURN_DATE = proDataInputObj.getReturntDate().trim();

        HomePageAction homePageAction = new HomePageAction(driver, logger);
        SnapSearchAction snapSearchAction = new SnapSearchAction(driver, logger);

        homePageAction.goToSnap();
        snapSearchAction.enterDepartureValue(DEPARTURE_VALUE);
        snapSearchAction.enterDestinationValue(DESTINATION_VALUE);
        snapSearchAction.confirmFlightDate();
        snapSearchAction.clickOnTheSearchButton();
    }
}
