package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazonStepDefinition {
    @Given("amazon webpage is launch")
    public void amazon_webpage_is_launch() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Given");
    }
    @When("user enter product name")
    public void user_enter_product_name() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("when");    }
    @When("user click on search button")
    public void user_click_on_search_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("when");
    }
    @Then("product should be displayed")
    public void product_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then");    }

}
