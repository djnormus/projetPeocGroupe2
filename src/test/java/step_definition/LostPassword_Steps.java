package step_definition;

import cucumber.api.java.en.And;
import pages.LoginRegisterPageLocators;
import pages.LostPasswordPageLocators;

import static step_definition.Hooks.driver;

public class LostPassword_Steps {

    LoginRegisterPageLocators loginLoc = new LoginRegisterPageLocators(driver);
    LostPasswordPageLocators lostLoc = new LostPasswordPageLocators(driver);
    @And("je clique sur Lost your password")
    public void jeCliqueSurLostYourPassword() {

        loginLoc.linkLostPassword.click();
    }


    @And("je saisis mon email dans le pavé reset password {string}")
    public void jeSaisisMonEmailDansLePaveResetPasswordPoecgroupeEndtestIo(String email) {

        lostLoc.resetInput.sendKeys(email);
    }


    @And("je clique sur bouton reset password")
    public void jeCliqueSurBoutonResetPassword() {
        lostLoc.resetPasswordBtn.click();
    }
}
