package actions;

import core.utils.Log;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomePageAction extends HomePage {
    public static final String PHONE_MENU = "phoneMenu";
    public static final String LAPTOP_MENU = "laptopMenu";
    public static final String ACCESSORIES_MENU = "accessoriesMenu";
    public static final String SMART_WATCH_MENU = "smartWatchMenu";
    public static final String TABLET_MENU = "tabletMenu";
    public static final String WATCH_MENU = "watchMenu";
    public static final String SECOND_HAND_DEVICES_MENU = "secondHandDevicesMenu";
    public static final String MONITOR_AND_PRINTER_MENU = "monitorAndPrinterMenu";

    public HomePageAction(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void goToHomePage(){
        Log.info("CLICK ON THE HOME PAGE");
        if(checkVisibilityOfElementLocated(By.xpath(iconCloseOfPromotionPopUpLocator))) {
            clickOnElement(driver.findElement(By.xpath(iconCloseOfPromotionPopUpLocator)));
        }
        clickOnElement(theLogo);
    }

    public void goToTheMenu(String menuNameText){
        switch (menuNameText) {
            case PHONE_MENU -> clickOnElement(phoneMenuLocator);
            case LAPTOP_MENU -> clickOnElement(laptopMenuLocator);
            case ACCESSORIES_MENU -> clickOnElement(accessoriesMenuLocator);
            case SMART_WATCH_MENU -> clickOnElement(smartWatchMenuLocator);
            case WATCH_MENU -> clickOnElement(watchMenuLocator);
            case TABLET_MENU -> clickOnElement(tabletMenuLocator);
            case SECOND_HAND_DEVICES_MENU -> clickOnElement(secondHandDevicesMenuLocator);
            case MONITOR_AND_PRINTER_MENU -> clickOnElement(monitorAndPrinterMenuLocator);
            default -> System.out.println("Can not find the menu");
        }
    }
}
