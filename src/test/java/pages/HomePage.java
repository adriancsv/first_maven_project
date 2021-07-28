package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    String pageUrl = "http://automationpractice.com";

    @FindBy(id = "header_logo")
    protected WebElement headerLogo;

    @FindBy(className = "container")
    protected WebElement container;

    @FindBy(css = "img[alt='My Store']")
    protected WebElement myStoreImg;

    @FindBy(xpath = "//div[@id='header_logo']//img[@alt='My Store']")
    protected WebElement myStoreImgLogo;

    @FindBy(xpath = "/html//input[@id='search_query_top']")
    protected WebElement searchField;

    @FindBy(xpath = "//form[@id='searchbox']/button[@name='submit_search']")
    protected WebElement searchButton;


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void openPage() {
        navigate(pageUrl);
    }

    public void checkForElementsToBeVisible(){
        headerLogo.isDisplayed();
        container.isDisplayed();
        myStoreImg.isDisplayed();
        myStoreImgLogo.isDisplayed();
    }

    public void searchFor(String wordToSearchFor){
        searchField.sendKeys(wordToSearchFor);
        searchButton.click();
    }

}