package stepdefinition;

import com.selenium.beer.pageobject.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class BackgroundStep extends BaseStepDefinition {
    private final HomePage homePage = new HomePage(driver);

    @Given("I navigate to the home page")
    public void i_navigate_to_the_home_page() {
        driver.navigate().to(BASE_URL);
    }

    @And("I accept the age verification pop-up")
    public void i_accept_the_age_verification_pop_up() {
        homePage.acceptAgeVerificationPopUp();
    }
}
