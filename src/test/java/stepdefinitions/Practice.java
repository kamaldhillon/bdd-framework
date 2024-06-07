package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.PracticePage;

import java.util.List;

public class Practice {

    private WebDriver driver;
    private PracticePage page;

    @Before
    public void setup() {
        System.out.println("Setting up WebDriver");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        System.out.println("WebDriver initialized: " + (driver != null));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Given("I am on the OpenCart login page")
    public void i_am_on_the_open_cart_login_page() {
        driver.get("https://amazon.com/opencart/index.php?route=account/login");
        page = new PracticePage(driver);
    }

    @Given("I have entered a valid username and password")
    public void i_have_entered_a_valid_username_and_password() {
        page.enterEmailId("qatestertest@gmail.com");
        page.enterPassword("Test@123");

    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
      page.clickOnLoginButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        Assert.assertEquals(page.checkLogoutLink(), true);
    }

    @Given("I have entered invalid {string} and {string}")
    public void i_have_entered_invalid_and(String username, String password) {
        page.enterEmailId(username);
        page.enterPassword(password);
    }

    @Then("I should see an error message indicating {string}")
    public void i_should_see_an_error_message_indicating(String string) {
        Assert.assertEquals( driver.findElement(By.cssSelector(".alert-danger")).isDisplayed(), true);
    }

    @When("I click on the {string} link")
    public void i_click_on_the_link(String string) {
        page.clickForgottenPasswordLink();
    }

    @Then("I should be redirected to the password reset page")
    public void i_should_be_redirected_to_the_password_reset_page() {
        Assert.assertTrue(page.getForgotPwdPageUrl().contains("account/forgotten"));
    }
}
