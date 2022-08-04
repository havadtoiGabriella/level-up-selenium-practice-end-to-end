package stepdefinition;

import static com.selenium.beer.driver.Driver.closeDriver;
import static com.selenium.beer.driver.Driver.initDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void beforeScenario() {
        initDriver();
    }

    @After
    public void afterScenario() {
        closeDriver();
    }
}
