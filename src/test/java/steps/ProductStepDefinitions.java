package steps;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductStepDefinitions extends BaseTest {

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    AccountPageSteps accountPageSteps;

    @Given("^the user is in homepage$")
    public void homePage() {
        homePageSteps.signIn();
    }

    @When("^the user creates the account$")
    public void theUserCreatesTheAccount() {
        homePageSteps.accountCreation();
    }

    @Then("^validate the label as personal info$")
    public void validateTheLabelAsPersonalInfo() {
        homePageSteps.validatePersonalInfo();
    }

    @And("^search the product (.+) and validate the product (.+)$")
    public void searchTheProductDressAndValidateTheProductBlousesBlouse(String searchText,String productName) {
        accountPageSteps.doSearchDress(searchText,productName);
    }
}
