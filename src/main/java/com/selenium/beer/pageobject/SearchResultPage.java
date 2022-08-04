package com.selenium.beer.pageobject;

import static com.selenium.beer.util.WebElementAssertions.elementIsDisplayed;
import static com.selenium.beer.util.WebElementHandler.clickOn;
import static com.selenium.beer.util.WebElementHandler.elementAttributeContains;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {

    @FindBy(css = ".sortbar-bottom .page-next")
    private WebElement nextPageButton;

    @FindBy(className = "img-thumbnail-link")
    private List<WebElement> products;

    @FindBy(className = "module-search-critea")
    private WebElement searchCriteriaForm;

    public void clickOnNextPageButton() {
        clickOn(nextPageButton, driver);
    }

    public void checkIfSearchResultPageElementIsDisplayed() {
        LOGGER.info("Checking if search result page element is displayed");
        elementIsDisplayed(searchCriteriaForm);
    }

    public void clickOnProduct(String productName) {
        LOGGER.info("Clicking on the product: '" + productName + "'");
        for (WebElement product : products) {
            if (elementAttributeContains(product, "title", productName)) {
                clickOn(product, driver);
                break;
            }
        }
    }

    public SearchResultPage(ChromeDriver driver) {
        super(driver);
    }
}
