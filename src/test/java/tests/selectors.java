package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Driver;
import java.util.List;

import java.awt.*;
import java.util.ArrayList;

public class selectors {

    public static Driver driver = null;
    String URL = "https://www.seleniumeasy.com/test/";

    /*On the Input Forms section - checkbox demo:
    build a single selector for the 4 options that allows you to choose between them using a parameter.
    Check all options and search for an element that tells you all options are checked*/
    @Test
    public void checkBoxDemo(){

        driver = Driver.getInstance();
        driver.navigate("https://www.seleniumeasy.com");
        driver.navigate("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement checkboxOption1 = driver.webDriver.findElementByCssSelector("div:nth-of-type(1) > label > .cb1-element");
        checkboxOption1.click();
        WebElement checkboxOption2 = driver.webDriver.findElementByCssSelector("div:nth-of-type(2) > label > .cb1-element");
        checkboxOption2.click();
        WebElement checkboxOption3 = driver.webDriver.findElementByCssSelector("div:nth-of-type(3) > label > .cb1-element");
        checkboxOption3.click();
        WebElement checkboxOption4 = driver.webDriver.findElementByCssSelector("div:nth-of-type(4) > label > .cb1-element");
        checkboxOption4.click();

        WebElement checkAll = driver.webDriver.findElementById("isChkd");

        if (checkAll.getAttribute("value").equals("true")) {
            System.out.println("All options are checked");
        } else
            System.out.println("NOT all options are checked");

        driver.exit();

        }

   /* On the Date pickers section - JQuery date picker,
    build selectors for one of the fields that allows you to pick a date*/

    @Test
    public void datePicker(){
        driver = Driver.getInstance();
        driver.navigate("https://www.seleniumeasy.com");
        driver.navigate("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");

        WebElement fromDate = driver.webDriver.findElementById("from");
        fromDate.click();
        WebElement selectFromDate = driver.webDriver.findElementByCssSelector("tr:nth-of-type(3) > td:nth-of-type(4) > .ui-state-default");
        selectFromDate.click();

        driver.exit();

    }

/*    On the  Table section - table data search:
    build a single selector that can get all the elements rows*/

    @Test
    public void tableElementsSelector(){
        driver = Driver.getInstance();
        driver.navigate("https://www.seleniumeasy.com");
        driver.navigate("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        WebElement table = driver.webDriver.findElementByCssSelector("table#task-table");
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {

                System.out.print(cell.getText() + "\t");
            }
            System.out.print("\n");
        }

        driver.exit();

    }

}
