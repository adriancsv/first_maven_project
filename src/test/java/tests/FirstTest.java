package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    public static Driver driver = null;
    String URL = "http://automationpractice.com";

    @Test
    public void firstTest(){
        driver = Driver.getInstance();
        driver.navigate(URL);
        driver.webDriver.findElement(By.id("homepage-slider"));
        driver.webDriver.findElement((By.className("homeslider-container")));
        driver.webDriver.findElement(By.cssSelector("#homeslider > li:nth-child(2) > a > img"));
        driver.webDriver.findElement(By.xpath("//*[@id=\"homeslider\"]/li[3]/a/img"));

        driver.exit();
    }


    @Test
    public void findDress() throws InterruptedException {
        driver = Driver.getInstance();
        driver.navigate(URL);

        WebElement searchBox = driver.webDriver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
        searchBox.sendKeys("dress");

        WebElement searchButton = driver.webDriver.findElementByXPath("//*[@id=\"searchbox\"]/button");
        searchButton.click();


        WebElement firstItem = driver.webDriver.findElementByXPath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img");
        firstItem.click();


        WebElement addToCart = driver.webDriver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
        addToCart.click();

       // driver.exit();

    }

    @Test
    public void changeDressAttributes() {
        driver = Driver.getInstance();
        driver.navigate(URL);

        WebElement searchBox = driver.webDriver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
        searchBox.sendKeys("dress");

        WebElement searchButton = driver.webDriver.findElementByXPath("//*[@id=\"searchbox\"]/button");
        searchButton.click();

        WebElement secondItem = driver.webDriver.findElementByXPath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img");
        secondItem.click();

        WebElement changeColor = driver.webDriver.findElementByXPath("//*[@id=\"color_24\"]");
        changeColor.click();

        WebElement changeSizeSelector = driver.webDriver.findElementByXPath("//*[@id=\"group_1\"]");
        changeSizeSelector.click();
        changeSizeSelector.sendKeys("l");

        WebElement addToCart = driver.webDriver.findElementByXPath("//*[@id=\"add_to_cart\"]/button/span");
        addToCart.click();
    }


    @Test
    public void checkoutDelete() {
        driver = Driver.getInstance();
        driver.navigate(URL);

        WebElement searchBox = driver.webDriver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
        searchBox.sendKeys("dress");

        WebElement searchButton = driver.webDriver.findElementByXPath("//*[@id=\"searchbox\"]/button");
        searchButton.click();

        WebElement secondItem = driver.webDriver.findElementByXPath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img");
        secondItem.click();

        WebElement changeColor = driver.webDriver.findElementByXPath("//*[@id=\"color_24\"]");
        changeColor.click();

        WebElement changeSizeSelector = driver.webDriver.findElementByXPath("//*[@id=\"group_1\"]");
        changeSizeSelector.click();
        changeSizeSelector.sendKeys("l");

        WebElement addToCart = driver.webDriver.findElementByXPath("//*[@id=\"add_to_cart\"]/button/span");
        addToCart.click();

        WebDriverWait wait = new WebDriverWait(driver.webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")));

        WebElement proceedToCheckoutButton = driver.webDriver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        proceedToCheckoutButton.click();

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product_4_45_0_0\"]/td[7]/div")));


        WebElement deleteItemButton = driver.webDriver.findElement(By.xpath("//table[@id='cart_summary']/tbody/tr[1]//a[@title='Delete']/i[@class='icon-trash']"));
        deleteItemButton.click();
    }

    }

