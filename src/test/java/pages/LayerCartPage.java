package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LayerCartPage extends BasePage{

    @FindBy(id = "layer_cart")
    protected WebElement layerCart;

    @FindBy(xpath = "//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")
    protected WebElement proceedToCheckoutButton;


    public LayerCartPage(WebDriver driver) {
        super(driver);
    }


    public void waitForLayerCartToAppear(){
        BasePage.waitForElementToAppear(layerCart);
    }

    public void clickProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }
}