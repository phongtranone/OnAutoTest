package core.bases;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class CustomKeywords extends BasePage {
    int MAX_TIME_OUT = 20;
    int POLLING_PERIOD = 3;
    protected CustomKeywords(WebDriver driver, Logger log) {
        super(driver, log);
    }

    protected void clickOnElement(WebElement element){
        fluentWaitForVisibilityOfElement(element);
        element.click();
    }

    protected void enterDataBySendKey(WebElement element, String data){
        fluentWaitForVisibilityOfElement(element);
        element.sendKeys(data);
    }

    protected void enterDataByKeyboard(WebElement element, String data){
        Actions actions = new Actions(driver);
        //Dayang Bay Resort
        actions.sendKeys(element, "D").perform();
        actions.sendKeys(element, "a").perform();
        actions.sendKeys(element, "y").perform();
        actions.sendKeys(element, "a").perform();
        actions.sendKeys(element, "n").perform();
        actions.sendKeys(element, "g").perform();
        actions.sendKeys(element, " ").perform();
        actions.sendKeys(element, "B").perform();
        actions.sendKeys(element, "a").perform();
        actions.sendKeys(element, "y").perform();
        //actions.sendKeys(element, " ").perform();
//        actions.sendKeys(element, "R").perform();
//        actions.sendKeys(element, "e").perform();
//        actions.sendKeys(element, "s").perform();
//        actions.sendKeys(element, "o").perform();
//        actions.sendKeys(element, "r").perform();
//        actions.sendKeys(element, "t").perform();
        pause(2000);
    }

    protected void clearDataInTextBox(WebElement element){
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
    }
    public static void pause(long milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean waitForJStoLoad() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // wait for jQuery to load
        ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return ((JavascriptExecutor) driver).executeScript("return jQuery.active").toString()
                            .equals("0");
                }
                catch (Exception e) {
                    return true;
                }
            }
        };

        // wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
                        .equals("complete");
            }
        };
        return wait.until(jQueryLoad) && wait.until(jsLoad);
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

    public boolean checkElementDisplayed(WebElement element){
        return element.isDisplayed();
    }

    public boolean checkVisibilityOfElement(WebElement element){
        boolean flag = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(MAX_TIME_OUT));
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

    public void scrollToElement(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                , element);
    }

    public void scrollUntilElementAndClick(WebElement element){
        boolean flag = false;
        while (!flag){
            if(checkElementToBeClickable(element)){
                clickOnElement(element);
                flag = true;
            }else {
                ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,150)"
                        , "");
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
