package stepdefinition;

import com.selenium.beer.pageobject.HomePage;
import cucumber.api.java.en.And;

public class HomePageStep extends BaseStepDefinition {
    private final HomePage homePage = new HomePage(driver);

    @And("I search for {string}")
    public void i_search_for(String searchTarget) {
        homePage.searchFor(searchTarget);
    }

    @And("I accept the data handling dialog box")
    public void i_accept_the_data_handling_dialog_box() {
        homePage.acceptDataHandlingDialogBox();
        homePage.checkIfHomePageElementIsDisplayed();
    }
}
