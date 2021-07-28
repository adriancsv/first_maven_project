package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage{

    @FindBy(xpath = "//div[@id='center_column']/ul/li[1]")
    protected WebElement firstProduct;

    @FindBy(xpath = "//div[@id='center_column']/ul/li[2]")
    protected WebElement secondProduct;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstProduct(){
        firstProduct.click();
    }

    public void clickSecondProduct(){
        BasePage.waitForElementToAppear(secondProduct);
        secondProduct.click();
    }
}