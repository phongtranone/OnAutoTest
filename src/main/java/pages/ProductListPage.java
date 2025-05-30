package pages;

import core.bases.CustomKeywords;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListPage extends CustomKeywords {
    protected ProductListPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[1]")
    protected WebElement samsungCategoryLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[2]")
    protected WebElement iphoneCategoryLocator;
    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[3]")
    protected WebElement oppoCategoryLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[3]")
    protected WebElement xiaomiCategoryLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[1]")
    protected WebElement asusLaptopBrandLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[3]")
    protected WebElement dellLaptopBrandLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[4]")
    protected WebElement acerLaptopBrandLocator;

    @FindBy(xpath = "//div[@class='quick-link v2']/a[1]")
    protected WebElement xiaomiSmartWatchBrandLocator;

    @FindBy(xpath = "//div[@class='quick-link v2']/a[2]")
    protected WebElement appleSmartWatchBrandLocator;

    @FindBy(xpath = "//div[@class='quick-link v2']/a[3]")
    protected WebElement huaweiSmartWatchBrandLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[1]")
    protected WebElement samsungTabletBrandLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[2]")
    protected WebElement appleTabletBrandLocator;
    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[3]")
    protected WebElement oppoTabletBrandLocator;

    @FindBy(xpath = "//div[contains(@class,'list-category')]//div[3]/a")
    protected WebElement headPhoneAccessoryLocator;
    @FindBy(xpath = "//div[contains(@class,'list-category')]//div[4]/a")
    protected WebElement speakerAccessoryLocator;
    @FindBy(xpath = "//div[contains(@class,'list-category')]//div[5]/a")
    protected WebElement cameraAccessoryLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[1]")
    protected WebElement sonyHeadPhoneBrandLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[3]")
    protected WebElement samsungHeadPhoneBrandLocator;
    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[4]")
    protected WebElement applyHeadPhoneBrandLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[1]")
    protected WebElement jplSpeakerBrandLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[4]")
    protected WebElement sonySpeakerBrandLocator;
    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[8]")
    protected WebElement xiaomiSpeakerBrandLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[2]")
    protected WebElement imouCameraBrandLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[3]")
    protected WebElement ezvizCameraBrandLocator;
    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[4]")
    protected WebElement tplinkCameraBrandLocator;

    @FindBy(xpath = "//div[@class='quick-link v2  ']/a[1]")
    protected WebElement citizenWatchBrandLocator;

    @FindBy(xpath = "//div[@class='quick-link v2  ']/a[2]")
    protected WebElement orientWatchBrandLocator;
    @FindBy(xpath = "//div[@class='quick-link v2  ']/a[3]")
    protected WebElement casioWatchBrandLocator;
    @FindBy(xpath = "//div[@class='quickfilter']/a[2]")
    protected WebElement monitorCategoryLocator;
    @FindBy(xpath = "//div[@class='quickfilter']/a[4]")
    protected WebElement printerCategoryLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[2]")
    protected WebElement samsungMonitorBrandLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[3]")
    protected WebElement msiMonitorBrandLocator;
    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[4]")
    protected WebElement asusMonitorBrandLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[1]")
    protected WebElement canonPrinterBrandLocator;

    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[2]")
    protected WebElement brotherPrinterBrandLocator;
    @FindBy(xpath = "//div[@class='lst-quicklink ']/a[3]")
    protected WebElement hpPrinterBrandLocator;

    @FindBy(xpath = "//p[@class='click-sort']/span[@class='sort-show']")
    protected WebElement sortPriceBtnLocator;
    @FindBy(xpath = "//div[@class='sort-select-main sort ']/p[1]/a")
    protected WebElement ascendingPriceBtnLocator;
    @FindBy(xpath = "//div[@class='sort-select-main sort ']/p[2]/a")
    protected WebElement descendingPriceBtnLocator;
    @FindBy(xpath = "//strong[@class='price']")
    protected List<WebElement> productListPricesLocator;
    @FindBy(xpath = "//ul[@class='listproduct']//li//h3")
    protected List<WebElement> productNameListLocator;
    @FindBy(xpath = "//ul[@class='listproduct']//li//div[@class='item-compare gray-bg']/span[1]")
    protected List<WebElement> productRamMemoryListLocator;
    @FindBy(xpath = "//ul[@class='listproduct']//li//div[@class='item-compare gray-bg']/span[2]")
    protected List<WebElement> productHardDiskListLocator;
    @FindBy(xpath = "//div[@class='filter-total ']//i[@class='un-filter-v2']")
    protected WebElement filterBtnLocator;
    @FindBy(xpath = "//div[@class='utility']/p[3]")
    protected List<WebElement> productStorageListLocator;

    protected String productNameXpath = "//li/a/h3[contains(text(),'%s')]";
}
