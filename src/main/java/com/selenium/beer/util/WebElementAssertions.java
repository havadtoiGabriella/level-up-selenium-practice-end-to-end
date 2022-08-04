package com.selenium.beer.util;

import static org.assertj.core.api.Assertions.assertThat;
import com.selenium.beer.logger.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class WebElementAssertions {
    private static final Logger LOGGER = new Logger(WebElementAssertions.class);

    private WebElementAssertions() {
    }

    public static void elementIsDisplayed(WebElement element) {
        LOGGER.debug("Checking if element is displayed");
        assertThat(element.isDisplayed()).isTrue();
    }

    public static void pageHasTitle(String expectedTitle, ChromeDriver driver) {
        LOGGER.debug("Checking if page has title: '" + expectedTitle + "'");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    public static void pageTitleContains(String text, ChromeDriver driver) {
        LOGGER.debug("Checking if page title contains: '" + text + "'");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).contains(text);
    }
}
