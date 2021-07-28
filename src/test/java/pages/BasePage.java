package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

public class BasePage {

    static Driver driver = null;

    public BasePage(WebDriver driver) {
        BasePage.driver = Driver.getInstance();
        PageFactory.initElements(driver, this);
    }

    protected WebDriver getDriver() {
        return (WebDriver) driver;
    }

    public void navigate(String url) {
        driver.webDriver.get(url);
    }

    public static void waitForElementToAppear(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(driver.webDriver, 10);
        wait.until(ExpectedConditions.visibilityOf(ele));
    }
}