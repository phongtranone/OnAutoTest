package core.bases;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.Random;

public class CustomKeywords extends BasePage {
    int MAX_TIME_OUT = 20;
    int TIME_OUT_TO_CHECK_ELEMENT_VISIBLE = 3;
    int POLLING_PERIOD = 3;
    protected CustomKeywords(WebDriver driver, Logger log) {
        super(driver, log);
    }

    protected void clickOnElement(WebElement element){
        fluentWaitForVisibilityOfElement(element);
        element.click();
    }

    protected void javaScriptClickOnElement(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    protected void pressEnterKeyBoard(WebElement element){
        fluentWaitForVisibilityOfElement(element);
        element.sendKeys(Keys.ENTER);
    }

    protected void enterDataBySendKey(WebElement element, String data){
        fluentWaitForVisibilityOfElement(element);
        element.sendKeys(data);
    }
    public static void pause(long milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void fluentWaitForVisibilityOfElement(WebElement element){
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        try{
            wait.withTimeout(Duration.ofSeconds(MAX_TIME_OUT));
            wait.pollingEvery(Duration.ofSeconds(POLLING_PERIOD));
            wait.ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void explicitWaitForVisibilityOfElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(MAX_TIME_OUT));
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public boolean checkVisibilityOfElementLocated(By elementLocator){
        boolean flag;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT_TO_CHECK_ELEMENT_VISIBLE));
            wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public boolean checkVisibilityOfElement(WebElement element){
        boolean flag;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT_TO_CHECK_ELEMENT_VISIBLE));
            wait.until(ExpectedConditions.visibilityOf(element));
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }



    public boolean checkElementToBeClickable(WebElement element){
       boolean flag = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(MAX_TIME_OUT));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public boolean checkElementToBeVisible(WebElement element){
        boolean flag = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(MAX_TIME_OUT));
            wait.until(ExpectedConditions.visibilityOfAllElements(element));
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public void scrollToElement(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                , element);
    }

    public void scrollUntilElementToBeVisible(WebElement element){
        boolean flag = false;
        while (!flag){
            if(checkElementToBeVisible(element)){
                pause(1000);
                flag = true;
            }else {
                pause(1000);
                ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,150)"
                        , "");
            }
        }
    }

    public void scrollUntilElementAndClick(WebElement element){
        boolean flag = false;
        while (!flag){
            if(checkElementToBeClickable(element)){
                pause(2000);
                clickOnElement(element);
                pause(2000);
                flag = true;
            }else {
                pause(2000);
                ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,150)"
                        , "");
                pause(2000);
            }
        }
    }

    public String getTextValue(WebElement element){
        fluentWaitForVisibilityOfElement(element);
        return element.getText().trim();
    }
    public int randomInt(int range){
        Random random = new Random();
        return random.nextInt(range);
    }
}
