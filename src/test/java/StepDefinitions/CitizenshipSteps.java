package StepDefinitions;

import Pages.DialogContent;
import Pages.leftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class CitizenshipSteps {
    leftNav ln=new leftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to Citizenship")
    public void navigateToCitizenship() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.citizenShip);
    }

    @When("Create a Citizenship")
    public void createACitizenship() {
        String citizenshipName= RandomStringUtils.randomAlphanumeric(8); // 8 harf
        String citizenshipShCo=RandomStringUtils.randomNumeric(4);

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,citizenshipName);
        dc.mySendKeys(dc.ShortName, citizenshipShCo);
        dc.myClick(dc.saveButton);
    }

    @When("Create a Citizenship name as {string} short name as {string}")
    public void createACitizenshipNameAsShortNameAs(String name, String shortname) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,name);
        dc.mySendKeys(dc.ShortName, shortname);
        dc.myClick(dc.saveButton);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.alreadyExist,"already");
    }
}
