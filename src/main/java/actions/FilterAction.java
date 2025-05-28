package actions;

import core.utils.Log;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.FilterPage;

public class FilterAction extends FilterPage {
    public static final String  LOWER_2_MILLIONS = "lower 2 millions";
    public static final String  FROM_2_TO_4_MILLIONS = "from 2 to 4 millions";
    public static final String  FROM_4_TO_7_MILLIONS = "from 4 to 7 millions";
    public static final String  FROM_7_TO_13_MILLIONS = "from 7 to 13 millions";
    public static final String  FROM_13_TO_20_MILLIONS = "from 13 to 20 millions";
    public static final String  OVER_20_MILLIONS = "over 20 millions";
    public static final String  SAMSUNG_BRAND = "Samsung";
    public static final String  IPHONE_BRAND = "iPhone (Apple)";
    public static final String  OPPO_BRAND = "OPPO";
    public static final String  XIAOMI_BRAND = "Xiaomi";
    public static final String  VIVO_BRAND = "vivo";
    public static final String  REALME_BRAND = "realme";
    public static final String  NOKIA_BRAND = "Nokia";
    public static final String  MOBELL_BRAND = "Mobell";
    public static final String  HP_BRAND = "HP";
    public static final String  ASUS_BRAND = "Asus";
    public static final String  ACER_BRAND = "Acer";
    public static final String  LENOVO_BRAND = "Lenovo";
    public static final String  DELL_BRAND = "Dell";
    public static final String  MSI_BRAND = "MSI";
    public static final String  MACBOOK_BRAND = "MacBook";
    public static final String  GIGABYTE_BRAND = "GIGABYTE";
    public static final String  LG_BRAND = "LG";
    public static final String  RAM_8GB = "8-gb";
    public static final String  RAM_12GB = "12-gb";
    public static final String  RAM_16GB = "16-gb";
    public static final String  RAM_24GB = "24-gb";
    public static final String  RAM_32GB = "32-gb";
    public static final String  RAM_36GB = "36-gb";
    public static final String  SSD_256GB = "ssd-256-gb";
    public static final String  SSD_512GB = "ssd-512-gb";
    public static final String  SSD_1TB = "ssd-1-tb";
    public static final String  IPAD_BRAND = "iPad (Apple)";
    public static final String  TCL_BRAND = "TCL";
    public static final String  HONOR_BRAND = "HONOR";
    public static final String  EXPECTED_PRICE_LOWER_3_MILLIONS = "lower 3 millions";
    public static final String  EXPECTED_PRICE_FROM_3_TO_8_MILLIONS = "from 3 to 8 millions";
    public static final String  EXPECTED_PRICE_FROM_8_TO_15_MILLIONS = "from 8 to 15 millions";
    public static final String  EXPECTED_PRICE_OVER_15_MILLIONS = "over 15 millions";
    public static final String  ROM_32GB = "rom-32gb";
    public static final String  ROM_64GB = "rom-64gb";
    public static final String  ROM_128GB = "rom-128gb";
    public static final String  ROM_256GB = "rom-256gb";
    public static final String  ROM_512GB = "512-gb";
    public static final String  ROM_1TB = "1-tb";

    public FilterAction(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void selectPhoneBrandName(String brandName){
        pause(2000);
        if(brandName.equalsIgnoreCase(SAMSUNG_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, SAMSUNG_BRAND);
        }
        if(brandName.equalsIgnoreCase(IPHONE_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, IPHONE_BRAND);
        }
        if(brandName.equalsIgnoreCase(OPPO_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, OPPO_BRAND);
        }
        if(brandName.equalsIgnoreCase(XIAOMI_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, XIAOMI_BRAND);
        }
        if(brandName.equalsIgnoreCase(VIVO_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, VIVO_BRAND);
        }
        if(brandName.equalsIgnoreCase(REALME_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, REALME_BRAND);
        }
        if(brandName.equalsIgnoreCase(NOKIA_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, NOKIA_BRAND);
        }
        if(brandName.equalsIgnoreCase(MOBELL_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, MOBELL_BRAND);
        }
        pause(2000);
    }
    public void selectPriceRange(String priceRange){
        Log.info("IN THE FILTER FUNCTION, SELECT THE RANGE OF PRICE: " + priceRange);
        pause(2000);
        switch (priceRange.trim()){
            case LOWER_2_MILLIONS -> clickOnElement(priceRangeLower2MillionsLocator);
            case FROM_2_TO_4_MILLIONS -> clickOnElement(priceRangeFrom2To4MillionsLocator);
            case FROM_4_TO_7_MILLIONS -> clickOnElement(priceRangeFrom4To7MillionsLocator);
            case FROM_7_TO_13_MILLIONS -> clickOnElement(priceRangeFrom7To13MillionsLocator);
            case FROM_13_TO_20_MILLIONS -> clickOnElement(priceRangeFrom13To20MillionsLocator);
            case OVER_20_MILLIONS -> clickOnElement(priceRangeOver20MillionsLocator);
            case EXPECTED_PRICE_LOWER_3_MILLIONS -> clickOnElement(priceRangeLower3MillionsLocator);
            case EXPECTED_PRICE_FROM_3_TO_8_MILLIONS -> clickOnElement(priceRangeFrom3To8MillionsLocator);
            case EXPECTED_PRICE_FROM_8_TO_15_MILLIONS -> clickOnElement(priceRangeFrom8To15MillionsLocator);
            case EXPECTED_PRICE_OVER_15_MILLIONS -> clickOnElement(priceRangeOver15MillionsLocator);
        }
    }

    public void viewFilterResults(){
        Log.info("VIEW THE FILTER RESULT");
        pause(2000);
        javaScriptClickOnElement(viewFilterResultBtnLocator);
    }

    public boolean verifyProductPriceIsInPriceRange(String priceRange, int productPrice){
        switch (priceRange.trim()){
            case LOWER_2_MILLIONS -> {
                if(productPrice < 2000000){
                    return true;
                }
            }
            case FROM_2_TO_4_MILLIONS -> {
                if(productPrice >= 2000000 && productPrice <= 4000000){
                    return true;
                }
            }
            case FROM_4_TO_7_MILLIONS -> {
                if(productPrice >= 4000000 && productPrice <= 7000000){
                    return true;
                }
            }
            case FROM_7_TO_13_MILLIONS -> {
                if(productPrice >= 7000000 && productPrice <= 13000000){
                    return true;
                }
            }
            case FROM_13_TO_20_MILLIONS -> {
                if(productPrice >= 13000000 && productPrice <= 20000000){
                    return true;
                }
            }
            case OVER_20_MILLIONS -> {
                if(productPrice > 20000000){
                    return true;
                }
            }
            case EXPECTED_PRICE_LOWER_3_MILLIONS -> {
                if(productPrice < 30000000){
                    return true;
                }
            }
            case EXPECTED_PRICE_FROM_3_TO_8_MILLIONS -> {
                if(productPrice >= 3000000 && productPrice <= 8000000){
                    return true;
                }
            }
            case EXPECTED_PRICE_FROM_8_TO_15_MILLIONS -> {
                if(productPrice >= 8000000 && productPrice <= 15000000){
                    return true;
                }
            }
            case EXPECTED_PRICE_OVER_15_MILLIONS -> {
                if(productPrice > 15000000){
                    return true;
                }
            }
        }
        return false;
    }

    public void selectLaptopBrandName(String brandName){
        pause(2000);
        if(brandName.equalsIgnoreCase(HP_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, HP_BRAND);
        }
        if(brandName.equalsIgnoreCase(ASUS_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, ASUS_BRAND);
        }
        if(brandName.equalsIgnoreCase(ACER_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, ACER_BRAND);
        }
        if(brandName.equalsIgnoreCase(LENOVO_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, LENOVO_BRAND);
        }
        if(brandName.equalsIgnoreCase(DELL_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, DELL_BRAND);
        }
        if(brandName.equalsIgnoreCase(MSI_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, MSI_BRAND);
        }
        if(brandName.equalsIgnoreCase(MACBOOK_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, MACBOOK_BRAND);
        }
        if(brandName.equalsIgnoreCase(GIGABYTE_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, GIGABYTE_BRAND);
        }
        if(brandName.equalsIgnoreCase(SAMSUNG_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, SAMSUNG_BRAND);
        }
        if(brandName.equalsIgnoreCase(LG_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, LG_BRAND);
        }
        pause(2000);
    }

    public void selectRamOption(String ramOption){
        pause(2000);
        if(ramOption.trim().equalsIgnoreCase("ram 8 gb")){
            ramOptionLocatorXpath = String.format(ramOptionLocatorXpath, RAM_8GB);
        }
        if(ramOption.trim().equalsIgnoreCase("ram 12 gb")){
            ramOptionLocatorXpath = String.format(ramOptionLocatorXpath, RAM_12GB);
        }
        if(ramOption.trim().equalsIgnoreCase("ram 16 gb")){
            ramOptionLocatorXpath = String.format(ramOptionLocatorXpath, RAM_16GB);
        }
        if(ramOption.trim().equalsIgnoreCase("ram 24 gb")){
            ramOptionLocatorXpath = String.format(ramOptionLocatorXpath, RAM_24GB);
        }
        if(ramOption.trim().equalsIgnoreCase("ram 32 gb")){
            ramOptionLocatorXpath = String.format(ramOptionLocatorXpath, RAM_32GB);
        }
        if(ramOption.trim().equalsIgnoreCase("ram 36 gb")){
            ramOptionLocatorXpath = String.format(ramOptionLocatorXpath, RAM_36GB);
        }

        scrollToElement(ramTitleLocator);
        clickOnElement(driver.findElement(By.xpath(ramOptionLocatorXpath)));
        pause(2000);
    }
    public void selectHardDiskOption(String hardDiskOption){
        pause(2000);
        if(hardDiskOption.trim().equalsIgnoreCase("ssd 256 gb")){
            hardDiskOptionLocatorXpath = String.format(hardDiskOptionLocatorXpath, SSD_256GB);
        }
        if(hardDiskOption.trim().equalsIgnoreCase("ssd 512 gb")){
            hardDiskOptionLocatorXpath = String.format(hardDiskOptionLocatorXpath, SSD_512GB);
        }
        if(hardDiskOption.trim().equalsIgnoreCase("ssd 1 tb")){
            hardDiskOptionLocatorXpath = String.format(hardDiskOptionLocatorXpath, SSD_1TB);
        }

        scrollToElement(hardDiskTitleLocator);
        clickOnElement(driver.findElement(By.xpath(hardDiskOptionLocatorXpath)));
        pause(2000);
    }
    public void selectTabletBrandName(String brandName){
        Log.info("IN THE FILTER FUNCTION, SELECT THE BRAND NAME: " + brandName);
        pause(2000);
        if(brandName.equalsIgnoreCase(IPAD_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, IPAD_BRAND);
        }
        if(brandName.equalsIgnoreCase(SAMSUNG_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, SAMSUNG_BRAND);
        }
        if(brandName.equalsIgnoreCase(XIAOMI_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, XIAOMI_BRAND);
        }
        if(brandName.equalsIgnoreCase(OPPO_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, OPPO_BRAND);
        }
        if(brandName.equalsIgnoreCase(TCL_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, TCL_BRAND);
        }
        if(brandName.equalsIgnoreCase(HONOR_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, HONOR_BRAND);
        }
        if(brandName.equalsIgnoreCase(LENOVO_BRAND)){
            clickElementBasedOnValue(brandNameMenuLocatorXpath, LENOVO_BRAND);
        }
        pause(2000);
    }

    public void selectStorageOption(String storageOption){
        Log.info("IN THE FILTER FUNCTION, SELECT THE STORAGE OPTION: " + storageOption);
        pause(2000);
        if(storageOption.trim().equalsIgnoreCase("32 gb")){
            storageOptionLocatorXpath = String.format(storageOptionLocatorXpath, ROM_32GB);
        }
        if(storageOption.trim().equalsIgnoreCase("64 gb")){
            storageOptionLocatorXpath = String.format(storageOptionLocatorXpath, ROM_64GB);
        }
        if(storageOption.trim().equalsIgnoreCase("128 gb")){
            storageOptionLocatorXpath = String.format(storageOptionLocatorXpath, ROM_128GB);
        }
        if(storageOption.trim().equalsIgnoreCase("256 gb")){
            storageOptionLocatorXpath = String.format(storageOptionLocatorXpath, ROM_256GB);
        }
        if(storageOption.trim().equalsIgnoreCase("512 gb")){
            storageOptionLocatorXpath = String.format(storageOptionLocatorXpath, ROM_512GB);
        }
        if(storageOption.trim().equalsIgnoreCase("1 tb")){
            storageOptionLocatorXpath = String.format(storageOptionLocatorXpath, ROM_1TB);
        }
        scrollToElement(storageTitleLocator);
        clickOnElement(driver.findElement(By.xpath(storageOptionLocatorXpath)));
        pause(3000);
    }
}
