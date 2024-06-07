package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//@all for all
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/java/appfeature/Order.feature"},
        glue = {"stepdefinitions"},
        plugin = {"pretty",
        "json:target/MyReports/report.json",
        "junit:target/MyReports/report.xml"}
)
public class OrderTest {
}
