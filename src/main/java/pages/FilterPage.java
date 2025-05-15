package pages;

import core.bases.CustomKeywords;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterPage extends CustomKeywords {
    protected FilterPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    //@FindBy(xpath = "//div[@class='show-total-main']//a[@data-name='%s']")
    @FindBy(xpath = "//div[@class='show-total-main']//a[@data-name='Samsung']")
    protected WebElement brandNameMenuLocator;
    @FindBy(xpath = "//div[@class='show-total-item count-item arranged']//a[@data-href='duoi-2-trieu']")
    protected WebElement priceRangeLower2MillionsLocator;
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
    @FindBy(xpath = "//p[@class='show-total-txt' and text()='RAM']")
    protected WebElement ramTitleLocator;
    @FindBy(xpath = "//div[@class='show-total-main']/div[20]/p")
    protected WebElement hardDiskTitleLocator;
    @FindBy(xpath = "//div[@class='show-total-main']/div[10]/p")
    protected WebElement storageTitleLocator;
    @FindBy(xpath = "//div[@class='show-total-item count-item arranged']//a[@data-href='duoi-3-trieu']")
    protected WebElement priceRangeLower3MillionsLocator;
    @FindBy(xpath = "//div[@class='show-total-item count-item arranged']//a[@data-href='tu-3-8-trieu']")
    protected WebElement priceRangeFrom3To8MillionsLocator;
    @FindBy(xpath = "//div[@class='show-total-item count-item arranged']//a[@data-href='tu-8-15-trieu']")
    protected WebElement priceRangeFrom8To15MillionsLocator;
    @FindBy(xpath = "//div[@class='show-total-item count-item arranged']//a[@data-href='tren-15-trieu']")
    protected WebElement priceRangeOver15MillionsLocator;
    protected String brandNameMenuLocatorXpath = "//div[@class='show-total-main']//a[@data-name='%s']";
    protected String ramOptionLocatorXpath = "//div[@class='filter-list filter-list--ram  props']/a[@data-href='%s']";
    protected String hardDiskOptionLocatorXpath = "//div[@class='filter-list filter-list--o-cung  props']/a[@data-href='%s']";
    protected String storageOptionLocatorXpath = "//div[@class='filter-list filter-list--dung-luong-luu-tru  props']/a[@data-href='%s']";
}
