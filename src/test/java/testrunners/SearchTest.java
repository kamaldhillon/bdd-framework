package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Before;
import org.junit.runner.RunWith;

//@all for all
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/java/appfeature/Search.feature"},
        tags="@Smoke or @regression",
        glue = {"stepdefinitions"},
        plugin = {"pretty"}
)
public class SearchTest {

    @Before
    public void test(){
        System.out.println("before test");
    }
}
