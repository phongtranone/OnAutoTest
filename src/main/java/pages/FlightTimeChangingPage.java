package pages;

import core.bases.CustomKeywords;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class FlightTimeChangingPage extends CustomKeywords {

    protected FlightTimeChangingPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    @FindBys({
            @FindBy(xpath = "//button[contains(@class,'select-flight-button')]")
    })
    protected List<WebElement> selectBtn;

    @FindBy(xpath = "(//button[contains(@class,'select-flight-button')])[1]")
    protected WebElement confirmBtn;

    @FindBys({
            @FindBy(xpath = "//div[contains(@class,'depart-time')]")
    })
    protected List<WebElement> departTimeOfDepartingFlightTextLocator;

    @FindBys({
            @FindBy(xpath = "//div[contains(@class,'arrival-time')]")
    })
    protected List<WebElement> arrivalTimeOfDepartingFlightTextLocator;

    @FindBys({
            @FindBy(xpath = "//div[contains(@class,'depart-time')]")
    })
    protected List<WebElement> departTimeOfReturningFlightTextLocator;

    @FindBys({
            @FindBy(xpath = "//div[contains(@class,'arrival-time')]")
    })
    protected List<WebElement> arrivalTimeOfReturningFlightTextLocator;
}
