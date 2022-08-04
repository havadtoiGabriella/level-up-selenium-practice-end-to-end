package com.selenium.beer.pageobject;

import com.selenium.beer.logger.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected ChromeDriver driver;
    protected static final Logger LOGGER = new Logger(BasePage.class);

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
