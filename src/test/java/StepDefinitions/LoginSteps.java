package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;

public class LoginSteps {
    DialogContent dc=new DialogContent();
    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        //System.out.println("the site is opened");
        GWD.getDriver().get("https://test.mersys.io/");
    }
    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        // System.out.println("Username and password were entered");

        //  WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        //  wait.until(ExpectedConditions.visibilityOf(dc.username));

        //dc.username.sendKeys("turkeyts");
        //dc.password.sendKeys("TechnoStudy123");
        // dc.loginButton.click();

        dc.sendKeys(dc.username, "turkeyts");
        dc.sendKeys(dc.password, "TechnoStudy123");
        dc.click(dc.loginButton);
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        // System.out.println("Entered, tested");
    }
}
