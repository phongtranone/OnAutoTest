package pages;

import core.bases.CustomKeywords;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CustomKeywords {
    protected HomePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    @FindBy(xpath = "//a/i[@class='iconnewglobal-logo']")
    protected WebElement theLogo;

    @FindBy(xpath = "//ul[@class='main-menu']/li[1]/a/span")
    protected WebElement phoneMenuLocator;

    @FindBy(xpath = "//ul[@class='main-menu']/li[2]/a/span")
    protected WebElement laptopMenuLocator;

    @FindBy(xpath = "//ul[@class='main-menu']/li[3]/a/span")
    protected WebElement accessoriesMenuLocator;

    @FindBy(xpath = "//ul[@class='main-menu']/li[4]/a/span")
    protected WebElement smartWatchMenuLocator;
    @FindBy(xpath = "//ul[@class='main-menu']/li[5]/a/span")
    protected WebElement watchMenuLocator;

    @FindBy(xpath = "//ul[@class='main-menu']/li[6]/a/span")
    protected WebElement tabletMenuLocator;
    @FindBy(xpath = "//ul[@class='main-menu']/li[7]/a/span")
    protected WebElement secondHandDevicesMenuLocator;
    @FindBy(xpath = "//ul[@class='main-menu']/li[8]/a/span")
    protected WebElement monitorAndPrinterMenuLocator;

    protected String iconCloseOfPromotionPopUpLocator = "//div[@class='icon-close-popup']";

}
