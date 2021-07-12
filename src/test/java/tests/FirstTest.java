package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    public void findDress(){
        driver = Driver.getInstance();
        driver.navigate(URL);

        WebElement searchBox = driver.webDriver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
        searchBox.sendKeys("dress");

        WebElement searchButton = driver.webDriver.findElementByXPath("//*[@id=\"searchbox\"]/button");
        searchButton.click();

        WebElement firstItem = driver.webDriver.findElementByXPath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img");
        firstItem.click();

        WebElement addToCar = driver.webDriver.findElementByXPath("//*[@id=\"add_to_cart\"]/button/span");
        addToCar.click();

        driver.exit();

    }

    @Test
    public void changeDressAttributes(){
        driver = Driver.getInstance();
        driver.navigate(URL);

        WebElement searchBox = driver.webDriver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
        searchBox.sendKeys("dress");

        WebElement searchButton = driver.webDriver.findElementByXPath("//*[@id=\"searchbox\"]/button");
        searchButton.click();

        WebElement firstItem = driver.webDriver.findElementByXPath("//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img");
        firstItem.click();

        WebElement changeColor = driver.webDriver.findElementByXPath("//*[@id=\"color_8\"]");
        changeColor.click();

        WebElement changeSizeSelector = driver.webDriver.findElementByXPath("//*[@id=\"group_1\"]");
        changeSizeSelector.click();
        changeSizeSelector.sendKeys("l");

        WebElement addToCar = driver.webDriver.findElementByXPath("//*[@id=\"add_to_cart\"]/button/span");
        addToCar.click();



}
