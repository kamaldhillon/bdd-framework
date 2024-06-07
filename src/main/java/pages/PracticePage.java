package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {
    private WebDriver driver;
    // Locators
    private By emailInputLocator = By.name("email");
    private By passwordInputLocator = By.name("password");
    private By loginButtonLocator = By.xpath("//input[@type='submit']");
    private By forgottenPasswordLinkLocator = By.linkText("Forgotten Password");
    private By logoutLinkLocator = By.linkText("Logout");

    public PracticePage(WebDriver driver){
             this.driver=driver;

    }

    public void enterEmailId(String emailId){
        driver.findElement(emailInputLocator).sendKeys(emailId);
    }

    public void enterPassword(String password){
        driver.findElement(passwordInputLocator).sendKeys(password);
    }

    public void clickOnLoginButton(){
        driver.findElement(loginButtonLocator).click();
    }
    public void clickForgottenPasswordLink() {
        WebElement forgottenPasswordLink = driver.findElement(forgottenPasswordLinkLocator);
        forgottenPasswordLink.click();
    }

    public boolean checkLogoutLink(){
        return driver.findElement(logoutLinkLocator).isDisplayed();
    }
    public String getForgotPwdPageUrl(){
        String forgotPwdPageUrl = driver.getCurrentUrl();
        return forgotPwdPageUrl;
    }
}
