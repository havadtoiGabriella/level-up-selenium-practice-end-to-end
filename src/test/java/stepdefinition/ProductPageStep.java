package stepdefinition;

import com.selenium.beer.pageobject.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ProductPageStep extends BaseStepDefinition {
    private final ProductPage productPage = new ProductPage(driver);

    @Then("I should be redirected to the {string} product page")
    public void i_should_be_redirected_to_the_x_product_page(String productName) {
        productPage.checkIfCorrectProductPageIsLoaded(productName);
    }

    @And("'Alkoholtartalom' field should be displayed")
    public void alkoholtartalom_field_should_be_displayed() {
        productPage.checkIfProductParameterIsDisplayed();
    }
}
