package stepdefinition;

import com.selenium.beer.pageobject.SearchResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class SearchResultPageStep extends BaseStepDefinition {
    private final SearchResultPage searchResultPage = new SearchResultPage(driver);

    @And("on the search result page I click on the Next page button")
    public void on_the_search_result_page_i_click_on_the_next_page_button() {
        searchResultPage.checkIfSearchResultPageElementIsDisplayed();
        searchResultPage.clickOnNextPageButton();
    }

    @When("I click on the {string} product")
    public void i_click_on_the_x_product(String productName) {
        searchResultPage.clickOnProduct(productName);
    }
}
