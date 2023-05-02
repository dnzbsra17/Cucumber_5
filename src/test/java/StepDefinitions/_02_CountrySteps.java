package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;


public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to Country page")
    public void navigateToCountryPage()
    {

        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.paremeters);
        ln.clickFunction(ln.countries);

    }

    @When("Create a Country")
    public void createACountry()
    {
        String countryName= RandomStringUtils.randomAlphabetic(8); // 8 harf
        String countryCode =RandomStringUtils.randomNumeric(4); // 4 rakam
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,countryName);
        dc.sendKeysFunction(dc.codeInput,countryCode);
        dc.clickFunction(dc.saveButton);

    }

    @Then("Success mesasage should be displayed")
    public void successMesasageShouldBeDisplayed()
    {
        dc.verifyContainsTextFunction(dc.successMesasage,"success");

    }

    @When("Create a Country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code)

    {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.codeInput,code);
        dc.clickFunction(dc.saveButton);
    }
}
