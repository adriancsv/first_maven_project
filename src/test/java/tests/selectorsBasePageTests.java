package tests;

import org.testng.annotations.Test;

public class selectorsBasePageTests extends basePageTest {

    @Test
    public void firstTest() {
        //pages used
        getHomePage();

        homePage.openPage();
        homePage.checkForElementsToBeVisible();
    }

    @Test
    public void findDressTest() {
        //pages used
        getHomePage();
        getSearchResultPage();
        getQuickViewProductPage();

        //1. Navigate to http://automationpractice.com
        homePage.openPage();

        //2. Search for “dress”
        homePage.searchFor("dress");

        //3. Click on the first item on the page
        searchResultPage.clickFirstProduct();

        quickViewProductPage.waitForFrameModalToAppear();
        quickViewProductPage.switchToFrameModal();

        //4. Add to cart
        quickViewProductPage.clickAddToCartButton();
    }

    @Test
    public void changeDressAttributesTest() {
        //pages used
        getHomePage();
        getSearchResultPage();
        getQuickViewProductPage();

        //1. Navigate to http://automationpractice.com
        homePage.openPage();

        //2. Search for “dress”
        homePage.searchFor("dress");

        //3. Click on the second item on the page
        searchResultPage.clickSecondProduct();

        quickViewProductPage.waitForFrameModalToAppear();
        quickViewProductPage.switchToFrameModal();

        //4. Change size
        quickViewProductPage.setQuantityTo("2");

        //5. Change color
        quickViewProductPage.clickColorPink();

        //6. Add to cart
        quickViewProductPage.clickAddToCartButton();
    }

    @Test
    public void checkoutDeleteFlowTest() {
        //pages used
        getHomePage();
        getSearchResultPage();
        getQuickViewProductPage();
        getLayerCartPage();
        getOrderPage();

        //1. Navigate to http://automationpractice.com
        homePage.openPage();

        //2. Search for “dress”
        homePage.searchFor("dress");

        //3. Click on any item on the page
        searchResultPage.clickFirstProduct();

        quickViewProductPage.waitForFrameModalToAppear();
        quickViewProductPage.switchToFrameModal();

        //4. Change size and quantity
        quickViewProductPage.setQuantityTo("2");
        quickViewProductPage.selectSizeNr("M");

        //5. Change color if possible
        quickViewProductPage.clickColorPinkIfExits();

        //6. Add to cart
        quickViewProductPage.clickAddToCartButton();

        //7. Click Proceed to checkout
        layerCartPage.waitForLayerCartToAppear();
        layerCartPage.clickProceedToCheckoutButton();

        //8. Delete the product
        orderPage.waitForCartTitleToAppear();
        orderPage.clickDeleteFirstItemButton();
    }
}