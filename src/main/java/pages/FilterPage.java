package pages;

import core.bases.CustomKeywords;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilterPage extends CustomKeywords {
    protected FilterPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    //@FindBy(xpath = "//div[@class='show-total-main']//a[@data-name='%s']")
    @FindBy(xpath = "//div[@class='show-total-main']//a[@data-name='Samsung']")
    protected WebElement brandNameMenuLocator;
    @FindBy(xpath = "//div[@class='show-total-item count-item arranged']//a[@data-href='tu-2-4-trieu']")
    protected WebElement priceRangeFrom2To4MillionsLocator;
    @FindBy(xpath = "//div[@class='show-total-item count-item arranged']//a[@data-href='tu-4-7-trieu']")
    protected WebElement priceRangeFrom4To7MillionsLocator;
    @FindBy(xpath = "//div[@class='show-total-item count-item arranged']//a[@data-href='tu-7-13-trieu']")
    protected WebElement priceRangeFrom7To13MillionsLocator;
    @FindBy(xpath = "//div[@class='show-total-item count-item arranged']//a[@data-href='tu-13-20-trieu']")
    protected WebElement priceRangeFrom13To20MillionsLocator;
    @FindBy(xpath = "//div[@class='show-total-item count-item arranged']//a[@data-href='tren-20-trieu']")
    protected WebElement priceRangeOver20MillionsLocator;
    @FindBy(xpath = "//div[@class='filter-button filter-button--total']//a[@class='btn-filter-readmore']")
    protected WebElement viewFilterResultBtnLocator;
}
