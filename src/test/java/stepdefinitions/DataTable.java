package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTable {
    @When("I search for any product")
    public void i_search_for_any_product(io.cucumber.datatable.DataTable dataTable) {
       List<List<String>> list =dataTable.asLists(String.class);
       for(List<String> s: list){
           System.out.println(s);
       }
    }

    @Then("submit the response")
    public void submit_the_response() {

    }
}
