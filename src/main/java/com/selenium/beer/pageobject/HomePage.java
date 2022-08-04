package com.selenium.beer.pageobject;

import static com.selenium.beer.util.WebElementAssertions.elementIsDisplayed;
import static com.selenium.beer.util.WebElementAssertions.pageHasTitle;
import static com.selenium.beer.util.WebElementHandler.clickOn;
import static com.selenium.beer.util.WebElementHandler.sendKeysTo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "#auroraOverlayButtons .btn.btn-primary.button")
    private WebElement over18Button;

    @FindBy(css = ".dropdown.search-module.d-flex input")
    private WebElement searchInputField;

    @FindBy(css = ".input-group-append button")
    private WebElement searchButton;

    @FindBy(className = "js-nanobar-close-cookies")
    private WebElement cookiePolicyButton;

    @FindBy(id = "section-banner_slider_csakajosor")
    private WebElement homePageBanner;

    public void checkIfHomePageElementIsDisplayed() {
        LOGGER.info("Checking if home page element is displayed");
        elementIsDisplayed(homePageBanner);
    }

    public void acceptAgeVerificationPopUp() {
        LOGGER.info("Accepting the age verification pop up");
        clickOn(over18Button, driver);
    }

    public void searchFor(String searchTarget) {
        LOGGER.info("Searching for: '" + searchTarget + "'");
        sendKeysTo(searchInputField, searchTarget);
        clickOn(searchButton, driver);
    }

    public void acceptDataHandlingDialogBox() {
        LOGGER.info("Accepting the data handling dialog box");
        clickOn(cookiePolicyButton, driver);
    }

    public HomePage(ChromeDriver driver) {
        super(driver);
    }
}
