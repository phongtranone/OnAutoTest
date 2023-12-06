package actions;

import core.utils.Log;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomePageAction extends HomePage {
    public HomePageAction(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void goToSnap(){
        Log.info("CLICK ON THE SNAP MENU");
        fluentWaitForVisibilityOfElement(snapMenu);
        clickOnElement(snapMenu);
    }
}
