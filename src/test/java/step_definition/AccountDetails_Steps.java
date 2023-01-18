package step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.AccountDetailsPageLocators;
import pages.MyAccountPageLocators;

import static step_definition.Hooks.driver;

public class AccountDetails_Steps {

    MyAccountPageLocators myAccountLoc = new MyAccountPageLocators(driver);
    AccountDetailsPageLocators accountDetailsLoc = new AccountDetailsPageLocators(driver);


    @And("je clique sur Account Details")
    public void jeCliqueSurAccountDetails() {
        myAccountLoc.accountDetailsLink.click();
    }


    @Then("je suis redirigé vers les informations de compte")
    public void jeSuisRedirigeVersLesInformationsDeCompte() {

        String actualPageLink = driver.getCurrentUrl();

        Assert.assertTrue("La page Account Details n'est pas affichée", actualPageLink.contains("edit-account"));

    }

    @And("je saisis le password actuel dans le champ Current Password {string}")
    public void jeSaisisLePasswordActuelDansLeChampCurrentPasswordPoecgroupe(String currentPassword) {
        accountDetailsLoc.currentPswdInput.sendKeys(currentPassword);

    }

    @And("je saisis le nouveau password dans le champ New Password {string}")
    public void jeSaisisLeNouveauPasswordDansLeChampNewPasswordPoecgroupe(String newPassword) {

        accountDetailsLoc.newPswdInput.sendKeys(newPassword);
    }

    @And("je confirme le password dans le champ Confirm New Password {string}")
    public void jeConfirmeLePasswordDansLeChampConfirmNewPasswordPoecgroupe(String confirmPassword) {

        accountDetailsLoc.confirmPswdInput.sendKeys(confirmPassword);
    }

    @And("je saisis le password actuel incorrect dans le champ Current Password {string}")
    public void jeSaisisLePasswordActuelIncorrectDansLeChampCurrentPasswordPoecgroupe(String falsePassword) {

        accountDetailsLoc.confirmPswdInput.sendKeys(falsePassword);
    }

    @Then("le password est modifié avec un message de confirmation")
    public void lePasswordEstModifieAvecUnMessageDeConfirmation() {

        Assert.assertEquals("Le message n'est pas affiché",
                accountDetailsLoc.mesagePswdSuccess,
                accountDetailsLoc.mesagePswdSuccessPath.getText());

    }

    @Then("le password n est pas modifié et un message d erreur s affiche Your current password is incorrect")
    public void lePasswordNEstPasModifieEtUnMessageDErreurSAfficheYourCurrentPasswordIsIncorrect() {

        Assert.assertEquals("Le massage n'est pas affiché",
                accountDetailsLoc.messagePswdActuelError,
                accountDetailsLoc.messagePswdActuelErrorPath.getText());

    }

    @Then("le password n est pas modifié et un message d erreur s affiche New passwords do not match")
    public void lePasswordNEstPasModifieEtUnMessageDErreurSAfficheNewPasswordsDoNotMatch() {

        Assert.assertEquals("Le message n'est pas affiché",
                accountDetailsLoc.messagePswdNoMatch,
                accountDetailsLoc.messagePswdNoMatchPath.getText());
    }

    @And("je clique sur le bouton SAVE CHANGES")
    public void jeCliqueSurLeBoutonSAVECHANGES() {

        accountDetailsLoc.saveChangesBtn.click();
    }
}
