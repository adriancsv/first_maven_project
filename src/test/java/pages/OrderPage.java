package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage{

    @FindBy(id = "cart_title")
    protected WebElement cartTitle;

    @FindBy(xpath = "//table[@id='cart_summary']/tbody/tr[1]//a[@title='Delete']/i[@class='icon-trash']")
    protected WebElement deleteFirstItemButton;


    public OrderPage(WebDriver driver) {
        super(driver);
    }


    public void waitForCartTitleToAppear(){
        BasePage.waitForElementToAppear(cartTitle);
    }

    public void clickDeleteFirstItemButton(){
        deleteFirstItemButton.click();
    }
}