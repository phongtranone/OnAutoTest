package actions;

import core.utils.Common;
import core.utils.Log;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ProductListPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public static final String  ASCENDING_ORDER_TYPE = "ascending";
    public static final String  DESCENDING_ORDER_TYPE = "descending";

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

    public void sortByPrice(String orderTypeStr){
        clickOnElement(sortPriceBtnLocator);
        pause(2000);
        switch (orderTypeStr) {
            case ASCENDING_ORDER_TYPE -> clickOnElement(ascendingPriceBtnLocator);
            case DESCENDING_ORDER_TYPE -> clickOnElement(descendingPriceBtnLocator);
        }
        pause(2000);
    }

    public boolean verifySortOrder(String orderTypeStr){
        pause(3000);
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        switch (orderTypeStr){
            case ASCENDING_ORDER_TYPE -> {
                for (WebElement element : productListPricesLocator) {
                    scrollToElement(element);
                    String priceTxt = element.getText();
                    priceTxt = priceTxt.replaceAll("[^0-9]", "");
                    firstList.add(Common.convertStringToInteger(priceTxt));
                    secondList.add(Common.convertStringToInteger(priceTxt));
                }

                /* After get the price list and store 2 array list, to verify the list is sorted by ascending:
                 Sort by ascending for first list and compare to second list, they should be same*/
                Collections.sort(firstList);
                if (firstList.equals(secondList)){
                    pause(3000);
                    return true;
                }
            }
            case DESCENDING_ORDER_TYPE -> {
                for (WebElement element : productListPricesLocator) {
                    scrollToElement(element);
                    String priceTxt = element.getText();
                    priceTxt = priceTxt.replaceAll("[^0-9]", "");
                    firstList.add(Common.convertStringToInteger(priceTxt));
                    secondList.add(Common.convertStringToInteger(priceTxt));
                }

                /* After get the price list and store 2 array list, to verify the list is sorted by descending:
                 Sort by descending for first list and compare to second list, they should be same*/
                firstList.sort(Collections.reverseOrder());
                if (firstList.equals(secondList)){
                    pause(3000);
                    return true;
                }
            }
        }
        pause(3000);
        return false;
    }

    public void goToFilterFunction(){
        clickOnElement(filterBtnLocator);
        pause(2000);
    }

    public List<Integer> getProductPriceList(){
        Log.info("GET THE LIST OF PRODUCT PRICE");
        pause(2000);
        List<Integer> productPriceList = new ArrayList<>();
        for(WebElement element : productListPricesLocator){
            scrollUntilElementToBeVisible(element);
            String productPrice = getTextValue(element);
            productPrice = productPrice.replaceAll("[^0-9]", "");
            productPriceList.add(Common.convertStringToInteger(productPrice));
        }
        return productPriceList;
    }
    public List<String> getProductNameList(){
        Log.info("GET THE LIST OF PRODUCT NAME");
        pause(4000);
        List<String> productNameList = new ArrayList<>();
        for(WebElement element : productNameListLocator){
            productNameList.add(getTextValue(element));
        }
        return productNameList;
    }
    public List<String> getProductRamMemoryList(){
        Log.info("GET THE LIST OF PRODUCT RAM MEMORY");
        pause(2000);
        List<String> productRamMemoryList = new ArrayList<>();
        for(WebElement element : productRamMemoryListLocator){
            productRamMemoryList.add(getTextValue(element));
        }
        return productRamMemoryList;
    }

    public List<String> getProductHardDiskList(){
        Log.info("GET THE LIST OF PRODUCT HARD DISK");
        pause(2000);
        List<String> productHardDiskList = new ArrayList<>();
        for(WebElement element : productHardDiskListLocator){
            productHardDiskList.add(getTextValue(element));
        }
        return productHardDiskList;
    }
    public List<String> getProductStorageList(){
        Log.info("GET THE LIST OF PRODUCT STORAGE");
        pause(2000);
        List<String> productStorageList = new ArrayList<>();
        for(WebElement element : productStorageListLocator){
            productStorageList.add(getTextValue(element));
        }
        return productStorageList;
    }
}
