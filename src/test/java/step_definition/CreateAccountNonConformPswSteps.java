package step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.LoginRegisterPageLocators;

import static step_definition.Hooks.driver;

public class CreateAccountNonConformPswSteps {

    LoginRegisterPageLocators loginLoc = new LoginRegisterPageLocators(driver);

    @And("je saisis un mot de passe non conforme au Regex dans le pavé register {string}")
    public void jeSaisieUnMotDePasseNonConformeAuRegexPoecgroupe(String NonConformPassword) {
        loginLoc.registerPasswordInput.sendKeys(NonConformPassword);

    }

    @Then("le compte client n est pas créé")
    public void leCompteClientNEstPasCree() {

        Assert.assertFalse("Le bouton est cliquable", loginLoc.registerBtn.isEnabled() );

    }
}
