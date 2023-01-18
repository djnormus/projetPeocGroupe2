package step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.LoginRegisterPageLocators;
import pages.MyAccountPageLocators;

import static step_definition.Hooks.driver;

public class Logout_Steps {

    MyAccountPageLocators myAccountLog = new MyAccountPageLocators(driver);
    LoginRegisterPageLocators loginglog = new LoginRegisterPageLocators(driver);

    @Then("je suis déconnecté et la page Account affiche les pavé de Login et de Register")
    public void jeSuisDéconnectéEtLaPageAccountAfficheLesPavéDeLoginEtDeRegister() {

        Assert.assertTrue("la page n'est pas affiché", loginglog.loginEmailInput.isDisplayed());
    }


}
