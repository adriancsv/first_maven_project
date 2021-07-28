package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickViewProductPage extends BasePage {

    @FindBy(xpath = "//iframe[@class='fancybox-iframe']")
    protected WebElement iFrameModal;

    @FindBy(xpath = "//p[@id='add_to_cart']/button[@name='Submit']")
    protected WebElement addToCartButton;

    @FindBy(id = "quantity_wanted")
    protected WebElement quantityField;

    @FindBy(id = "color_24")
    protected WebElement colorPink;

    @FindBy(xpath = "//*[@id=\"group_1\"]/option[1]")
    protected WebElement sizeSDropDown;

    @FindBy(xpath = "//*[@id=\"group_1\"]/option[2]")
    protected WebElement sizeMDropDown;

    @FindBy(xpath = "//*[@id=\"group_1\"]/option[3]")
    protected WebElement sizeLDropDown;


    public QuickViewProductPage(WebDriver driver) {
        super(driver);
    }

    public void waitForFrameModalToAppear() {
        BasePage.waitForElementToAppear(iFrameModal);
    }

    public void switchToFrameModal() {
        driver.webDriver.switchTo().frame(iFrameModal);
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void setQuantityTo(String quantityToSet) {
        quantityField.clear();
        quantityField.sendKeys(quantityToSet);
    }

    public void clickColorPink() {
        colorPink.click();
    }

    /**
     * @param size The size can be either S M or L
     */
    public void selectSizeNr(String size) {
        if (size == "S")
            sizeSDropDown.click();
        else if (size == "M")
            sizeMDropDown.click();
        else if (size == "L")
            sizeLDropDown.click();
    }

    public void clickColorPinkIfExits() {
        try {
            colorPink.click();
        } catch (Exception e) {
            System.out.println("The pink color does not exist");
        }
    }
}
