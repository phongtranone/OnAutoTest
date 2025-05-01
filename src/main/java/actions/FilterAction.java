package actions;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.CartDetailsPage;
import pages.FilterPage;

public class FilterAction extends FilterPage {
    public static final String  FROM_2_TO_4_MILLIONS = "from 2 to 4 millions";
    public static final String  FROM_4_TO_7_MILLIONS = "from 4 to 7 millions";
    public static final String  FROM_7_TO_13_MILLIONS = "from 7 to 13 millions";
    public static final String  FROM_13_TO_20_MILLIONS = "from 13 to 20 millions";
    public static final String  OVER_20_MILLIONS = "over 20 millions";
    public FilterAction(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void selectBrandName(String brandName){
        pause(2000);
        clickOnElement(brandNameMenuLocator);
    }
    public void selectPriceRange(String priceRange){
        pause(2000);
        switch (priceRange.trim()){
            case FROM_2_TO_4_MILLIONS -> clickOnElement(priceRangeFrom2To4MillionsLocator);
            case FROM_4_TO_7_MILLIONS -> clickOnElement(priceRangeFrom4To7MillionsLocator);
            case FROM_7_TO_13_MILLIONS -> clickOnElement(priceRangeFrom7To13MillionsLocator);
            case FROM_13_TO_20_MILLIONS -> clickOnElement(priceRangeFrom13To20MillionsLocator);
            case OVER_20_MILLIONS -> clickOnElement(priceRangeOver20MillionsLocator);
        }
    }

    public void viewFilterResults(){
        pause(2000);
        javaScriptClickOnElement(viewFilterResultBtnLocator);
    }

    public boolean verifyProductPriceIsInPriceRange(String priceRange, int productPrice){
        pause(2000);
        switch (priceRange.trim()){
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
        }
        return false;
    }
}
