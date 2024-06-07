package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Before;
import org.junit.runner.RunWith;

//@all for all
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/java/appfeature/DataTable.feature"},
        glue = {"stepdefinitions"},
        plugin = {"pretty"}
)
public class DataTable {

}
