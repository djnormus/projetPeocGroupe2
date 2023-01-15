package step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.LoginRegisterPageLocators;
import pages.MyAccountPageLocators;

import static step_definition.Hooks.driver;

public class AuthenticationSteps {

    LoginRegisterPageLocators loginLoc = new LoginRegisterPageLocators(driver);
    MyAccountPageLocators myAccountLoc = new MyAccountPageLocators(driver);

    @And("je saisis mon email dans le pavé login {string}")
    public void jeSaisisMonEmailDansLePaveLoginPoecgroupeEndtestIo(String email) {

        loginLoc.loginEmailInput.sendKeys(email);
    }

    @And("je saisis un password valide dans le pavé login {string}")
    public void jeSaisisUnPasswordValideDansLePaveLoginPoecgroupe(String password) {

        loginLoc.LoginPasswordInput.sendKeys(password);
    }


    @And("je clique sur le bouton login")
    public void jeCliqueSurLeBoutonLogin() {
        loginLoc.loginBtn.click();
    }

    @Then("je suis connecté")
    public void jeSuisConnecte() {

        String actualTxt = myAccountLoc.welcomeMessage.getText();

        Assert.assertTrue("Le message de bienvenue n'est pas affiché", actualTxt.contains("Hello"));

    }

    @And("je saisis un password invalide dans le pavé login {string}")
    public void jeSaisisUnPasswordInvalideDansLePaveLoginPoecgroupe(String invalidPassword) {

        loginLoc.LoginPasswordInput.sendKeys(invalidPassword);
    }

    @Then("je ne suis pas connecté et un message d erreur s affiche")
    public void jeNeSuisPasConnecteEtUnMessageDErreurSAffiche() {

        String errorMsg = loginLoc.loginErrorMsg.getText();

        Assert.assertTrue("Le message d'erreur n'est pas affiché", errorMsg.contains("Error"));
    }

    @And("je coche la case remember me")
    public void jeCocheLaCaseRememberMe() {

        //loginLoc.checkboxRemember.clear();
        loginLoc.checkboxRemember.click();
    }

    @And("je clique sur Logout")
    public void jeCliqueSurLogout() {
        myAccountLoc.logoutLink.click();
    }

    @Then("mon login est pré-rempli dans le pavé login")
    public void monLoginEstPreRempliDansLePaveLogin() {

        String mailInputTxt = loginLoc.loginEmailInput.getText();

        Assert.assertTrue("Le champ username est vide", mailInputTxt.contains("@"));

    }

    @Then("dans la page my account les liens : Dashboard, Orders, Download, Adresses, Account Details et Logout sont présents")
    public void dansLaPageMyAccountLesLiensDashboardOrdersDownloadAdressesAccountDetailsEtLogoutSontPresents() {

        myAccountLoc.linkIsDisplayed();
        
    }
}
