package step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.HomePageLocators;
import pages.LoginRegisterPageLocators;
import pages.MyAccountPageLocators;
import utils.Screenshot;

import java.io.IOException;

import static step_definition.Hooks.driver;
import static step_definition.Hooks.prop;

public class CreateAccountConformPswSteps {

    LoginRegisterPageLocators loginLoc = new LoginRegisterPageLocators(driver);
    HomePageLocators homeLoc = new HomePageLocators(driver);
    MyAccountPageLocators myAccountLoc = new MyAccountPageLocators(driver);

    Screenshot screenshot = new Screenshot(driver);


    @Given("j ouvre l application")
    public void jOuvreLApplication() {
        driver.get(prop.getProperty("url"));
    }

    @When("je clique sur My Account")
    public void jeCliqueSurMyAccount() {
        homeLoc.myAccountButton.click();
    }


    @And("je saisis mon email dans le pavé register {string}")
    public void jeSaisieLeEmailStandard_user(String email) {
        loginLoc.registerEmailInput.sendKeys(email);
    }

    @And("je saisis un password conforme au Regex dans le pavé register {string}")
    public void jeSaisieUnPasswordConformeAuRegexPoecgroupe(String conformPassword) {
        loginLoc.registerPasswordInput.sendKeys(conformPassword);
    }

    @And("je clique sur le bouton register")
    public void jeCliqueSurRegister() {
        loginLoc.registerBtn.click();
    }

    @Then("le compte client est créé")
    public void leCompteClientEstCree() throws IOException {
        String actualTxt = myAccountLoc.welcomeMessage.getText();
        //String expectedTxt = "Hello";

        //Assert.assertEquals("Le message de bienvenue n'est pas affiché", actualTxt.contains("Hello"));
        Assert.assertTrue("Le message de bienvenue n'est pas affiché", actualTxt.contains("Hello"));


        //SCREENSHOT
        screenshot.takeScreenshot();


    }
}
