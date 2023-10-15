package StepDefinitions;

import Pages.DialogContent;
import Pages.leftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class CountrySteps {

    leftNav ln=new leftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to country")
    public void navigateToCountry() {
        ln.myClick(ln.setup); //setup
        ln.myClick(ln.parameters);//parameter
        ln.myClick(ln.countries);//country
    }

    @When("Create a country")
    public void createACountry() {
        String ulkeAdi= RandomStringUtils.randomAlphanumeric(8); // 8 harf
        String ulkeKodu=RandomStringUtils.randomNumeric(4);

        dc.myClick(dc.addButton); //+ tuşuna bas
        dc.mySendKeys(dc.nameInput, "ulkeAdi");//ülke adını gir
        dc.mySendKeys(dc.codeInput, "ulkeKodu");//ülke kodunu gir
        dc.myClick(dc.saveButton);//save tuşuna bas
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.successMessage,"success");
        //success yazısı çıktı mı kontrol et
    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, name);
        dc.mySendKeys(dc.codeInput, code);
        dc.myClick(dc.saveButton);
    }
}
