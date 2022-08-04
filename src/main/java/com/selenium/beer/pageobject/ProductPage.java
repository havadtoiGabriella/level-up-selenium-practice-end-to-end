package com.selenium.beer.pageobject;

import static com.selenium.beer.util.WebElementAssertions.elementIsDisplayed;
import static com.selenium.beer.util.WebElementAssertions.pageTitleContains;
import static com.selenium.beer.util.WebElementHandler.waitForElementToBeVisible;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(className = "featured-alkoholfok")
    private WebElement alcoholParameter;

    @FindBy(css = ".product-image.product-image-element.img-fluid")
    private WebElement productImage;

    public void checkIfCorrectProductPageIsLoaded(String productName) {
        LOGGER.info("Checking if product page title contains the product name: '" + productName + "'");
        waitForElementToBeVisible(productImage, driver);
        pageTitleContains(productName, driver);
    }

    public void checkIfProductParameterIsDisplayed() {
        LOGGER.info("Checking if 'Alkoholtartalom' product parameter is displayed");
        elementIsDisplayed(alcoholParameter);
    }

    public ProductPage(ChromeDriver driver) {
        super(driver);
    }
}
