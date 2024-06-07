package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//@all for all
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/java/appfeature/Practice.feature"},
        glue = {"stepdefinitions"},
        plugin = {"pretty"}
)
public class Practice {


}
