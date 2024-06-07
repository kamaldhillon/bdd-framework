package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
    @Given("I have search field on amazon page")
    public void i_have_search_field_on_amazon_page() {
        // Write code here that turns the phrase above into concrete actions
       System.out.println("Step1");
    }

    @When("I search for any product with name {string} and price {int}")
    public void i_search_for_any_product_with_name_and_price(String string, Integer int1) {
      System.out.println("Step2");
    }

    @Then("Product with Name {string} should be displayed")
    public void product_with_name_should_be_displayed(String string) {
       System.out.println("Step3");

    }
}
