package pages;

import core.bases.CustomKeywords;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelListingPage extends CustomKeywords {

    protected HotelListingPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    @FindBy(xpath = "//div[@id='return-flight']//button")
    protected WebElement changeFlightBtn;

    @FindBy(xpath = "(//div[contains(@class,'depart-time')])[1]")
    protected WebElement departTimeOfDepartingFlightLocator;

    @FindBy(xpath = "(//div[contains(@class,'arrival-time')])[1]")
    protected WebElement arrivalTimeOfDepartingFlightLocator;


    @FindBy(xpath = "(//div[contains(@class,'depart-time')])[2]")
    protected WebElement departTimeOfReturningTimeLocator;

    @FindBy(xpath = "(//div[contains(@class,'arrival-time')])[2]")
    protected WebElement arrivalTimeOfReturningTimeLocator;

    @FindBy(xpath = "//div[@id='hotel-name-search-widget']//input")
    protected WebElement hotelSearchBoxLocator;

    @FindBy(xpath = "//span[contains(text(),'Dayang Bay Resort')]")
    protected WebElement dropdownSearch;

    protected WebElement hotelDropdownSearchResultLocator(String hotelSearchText){
        pause(4000);
        WebElement element = driver.findElement(By.xpath(String.format("//span[contains(text(),'%s')]",hotelSearchText)));
        fluentWaitForVisibilityOfElement(element);
        return element;
    }

    @FindBy(xpath = "(//div[@id='hotels'])[1]")
    protected WebElement yourSearchedHotelLocator;
}
