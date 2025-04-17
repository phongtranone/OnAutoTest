package actions;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.ProductListPage;

public class ProductListAction extends ProductListPage {
    public static final String SAMSUNG_CATEGORY = "samsung";
    public static final String IPHONE_CATEGORY = "iphone";
    public static final String OPPO_CATEGORY = "oppo";
    public static final String XIAOMI_CATEGORY = "xiaomi";
    public static final String ASUS_LAPTOP_CATEGORY = "asus";
    public static final String DELL_LAPTOP_CATEGORY = "dell";
    public static final String ACER_LAPTOP_CATEGORY = "acer";

    public static final String XIAOMI_SMART_WATCH_CATEGORY = "xiaomi";
    public static final String APPLE_SMART_WATCH_CATEGORY = "apple";
    public static final String HUAWEI_SMART_WATCH_CATEGORY = "huawei";

    public static final String SAMSUNG_TABLET_CATEGORY = "samsung";
    public static final String APPLE_TABLET_CATEGORY = "apple";
    public static final String OPPO_TABLET_CATEGORY = "oppo";
    public static final String HEAD_PHONE_ACCESSORY_CATEGORY = "headPhone";
    public static final String SPEAKER_ACCESSORY_CATEGORY = "speaker";
    public static final String CAMERA_ACCESSORY_CATEGORY = "camera";

    public static final String SONY_HEAD_PHONE_BRAND_NAME = "sony";
    public static final String SAMSUNG_HEAD_PHONE_BRAND_NAME = "samsung";
    public static final String APPLE_HEAD_PHONE_BRAND_NAME = "apple";

    public static final String JPL_SPEAKER_BRAND_NAME = "jpl";
    public static final String SONY_SPEAKER_BRAND_NAME = "sony";
    public static final String XIAOMI_SPEAKER_BRAND_NAME = "xiaomi";
    public static final String IMOU_CAMERA_BRAND_NAME = "imou";
    public static final String EZVIZ_CAMERA_BRAND_NAME = "ezviz";
    public static final String TPLINK_CAMERA_BRAND_NAME = "tplink";

    public static final String CITIZEN_WATCH_BRAND_NAME = "citizen";
    public static final String ORIENT_WATCH_BRAND_NAME = "orient";
    public static final String CASIO_WATCH_BRAND_NAME = "casio";

    public static final String SAMSUNG_MONITOR_BRAND_NAME = "samsung";
    public static final String MSI_MONITOR_BRAND_NAME = "msi";
    public static final String ASUS_MONITOR_BRAND_NAME = "asus";
    public static final String CANON_PRINTER_BRAND_NAME = "canon";
    public static final String BROTHER_PRINTER_BRAND_NAME = "brother";
    public static final String HP_PRINTER_BRAND_NAME = "hp";

    public ProductListAction(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void selectCategory(String categoryText){
        pause(2000);
        switch (categoryText){
            case SAMSUNG_CATEGORY:
                clickOnElement(samsungCategoryLocator);
                break;
            case IPHONE_CATEGORY:
                clickOnElement(iphoneCategoryLocator);
                break;
            case OPPO_CATEGORY:
                clickOnElement(oppoCategoryLocator);
                break;
            case XIAOMI_CATEGORY:
                clickOnElement(xiaomiCategoryLocator);
                break;
        }
        pause(2000);
    }

    public void selectLaptopBrandName(String laptopBrandName){
        pause(2000);
        switch (laptopBrandName){
            case ASUS_LAPTOP_CATEGORY -> {
                clickOnElement(asusLaptopBrandLocator);
            }
            case DELL_LAPTOP_CATEGORY -> {
                clickOnElement(dellLaptopBrandLocator);
            }
            case ACER_LAPTOP_CATEGORY -> {
                clickOnElement(acerLaptopBrandLocator);
            }
        }
        pause(2000);
    }

    public void selectSmartWatchBrandName(String laptopBrandName){
        pause(2000);
        switch (laptopBrandName){
            case XIAOMI_SMART_WATCH_CATEGORY -> {
                clickOnElement(xiaomiSmartWatchBrandLocator);
            }
            case APPLE_SMART_WATCH_CATEGORY -> {
                clickOnElement(appleSmartWatchBrandLocator);
            }
            case HUAWEI_SMART_WATCH_CATEGORY -> {
                clickOnElement(huaweiSmartWatchBrandLocator);
            }
        }
        pause(2000);
    }

    public void selectTabletBrandName(String tabletBrandName){
        pause(2000);
        switch (tabletBrandName){
            case SAMSUNG_TABLET_CATEGORY -> {
                clickOnElement(samsungTabletBrandLocator);
            }
            case APPLE_TABLET_CATEGORY -> {
                clickOnElement(appleTabletBrandLocator);
            }
            case OPPO_TABLET_CATEGORY -> {
                clickOnElement(oppoTabletBrandLocator);
            }
        }
        pause(2000);
    }

    public void selectAccessoryCategory(String accessoryCategory){
        pause(2000);
        switch (accessoryCategory){
            case HEAD_PHONE_ACCESSORY_CATEGORY -> {
                clickOnElement(headPhoneAccessoryLocator);
            }
            case SPEAKER_ACCESSORY_CATEGORY -> {
                clickOnElement(speakerAccessoryLocator);
            }
            case CAMERA_ACCESSORY_CATEGORY -> {
                clickOnElement(cameraAccessoryLocator);
            }
        }
        pause(2000);
    }

    public void selectAccessoryHeadPhoneBrandName(String headPhoneBrandName){
        pause(2000);
        switch (headPhoneBrandName){
            case SONY_HEAD_PHONE_BRAND_NAME -> {
                clickOnElement(sonyHeadPhoneBrandLocator);
            }
            case APPLE_HEAD_PHONE_BRAND_NAME -> {
                clickOnElement(applyHeadPhoneBrandLocator);
            }
            case SAMSUNG_HEAD_PHONE_BRAND_NAME -> {
                clickOnElement(samsungHeadPhoneBrandLocator);
            }
        }
        pause(2000);
    }

    public void selectAccessorySpeakerBrandName(String speakerBrandName){
        pause(2000);
        switch (speakerBrandName){
            case JPL_SPEAKER_BRAND_NAME -> {
                clickOnElement(jplSpeakerBrandLocator);
            }
            case SONY_SPEAKER_BRAND_NAME -> {
                clickOnElement(sonySpeakerBrandLocator);
            }
            case XIAOMI_SPEAKER_BRAND_NAME -> {
                clickOnElement(xiaomiSpeakerBrandLocator);
            }
        }
        pause(2000);
    }

    public void selectAccessoryCameraBrandName(String cameraBrandName){
        pause(2000);
        switch (cameraBrandName){
            case IMOU_CAMERA_BRAND_NAME -> {
                clickOnElement(imouCameraBrandLocator);
            }
            case EZVIZ_CAMERA_BRAND_NAME -> {
                clickOnElement(ezvizCameraBrandLocator);
            }
            case TPLINK_CAMERA_BRAND_NAME -> {
                clickOnElement(tplinkCameraBrandLocator);
            }
        }
        pause(2000);
    }

    public void selectWatchBrandName(String watchBrandName){
        pause(2000);
        switch (watchBrandName){
            case CITIZEN_WATCH_BRAND_NAME -> {
                clickOnElement(citizenWatchBrandLocator);
            }
            case ORIENT_WATCH_BRAND_NAME -> {
                clickOnElement(orientWatchBrandLocator);
            }
            case CASIO_WATCH_BRAND_NAME -> {
                clickOnElement(casioWatchBrandLocator);
            }
        }
        pause(2000);
    }

    public void selectMonitorCategory(){
        pause(2000);
        clickOnElement(monitorCategoryLocator);
        pause(2000);
    }

    public void selectMonitorBrandName(String monitorBrandName){
        pause(2000);
        switch (monitorBrandName){
            case SAMSUNG_MONITOR_BRAND_NAME -> {
                clickOnElement(samsungMonitorBrandLocator);
            }
            case MSI_MONITOR_BRAND_NAME -> {
                clickOnElement(msiMonitorBrandLocator);
            }
            case ASUS_MONITOR_BRAND_NAME -> {
                clickOnElement(asusMonitorBrandLocator);
            }
        }
        pause(2000);
    }

    public void selectPrinterCategory(){
        pause(2000);
        clickOnElement(printerCategoryLocator);
        pause(2000);
    }

    public void selectPrinterBrandName(String printerBrandName){
        pause(2000);
        switch (printerBrandName){
            case CANON_PRINTER_BRAND_NAME -> {
                clickOnElement(canonPrinterBrandLocator);
            }
            case BROTHER_PRINTER_BRAND_NAME -> {
                clickOnElement(brotherPrinterBrandLocator);
            }
            case HP_PRINTER_BRAND_NAME -> {
                clickOnElement(hpPrinterBrandLocator);
            }
        }
        pause(2000);
    }

    public void viewProductDetails(String productNameTxt){
        pause(3000);
        productNameXpath = String.format(productNameXpath, productNameTxt);
        scrollUntilElementAndClick(driver.findElement(By.xpath(productNameXpath)));
        pause(3000);
    }
}
