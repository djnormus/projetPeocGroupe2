package step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasketPageLocators;
import pages.EmailBoxPageLocators;
import pages.HomePageLocators;
import pages.NewsletterPageLocators;
import utils.Screenshot;

import java.io.IOException;
import java.time.Duration;

import static step_definition.Hooks.driver;
import static step_definition.Hooks.prop;

public class Newsletter_Steps {

    BasketPageLocators basketLoc = new BasketPageLocators(driver);
    NewsletterPageLocators newsletter = new NewsletterPageLocators(driver);
    HomePageLocators homeLocator = new HomePageLocators(driver);
    EmailBoxPageLocators mailLoc = new EmailBoxPageLocators(driver);
    Screenshot screenshot = new Screenshot(driver);



    @When("je clique sur Panier")
    public void jeCliqueSurPanier() {

        basketLoc.basketLink.click();

    }

    /*

    @Then("un bouton Subscribe s affiche en bas de la page")
    public void unBoutonSubscribeSAfficheEnBasDeLaPage() {

        String actualPage = driver.getCurrentUrl();

        Assert.assertTrue("La page panier n'est pas affiché",actualPage.contains("basket") );
        Assert.assertTrue("Le bouton Subscribe ne s'affiche pas", newsletter.subscribeBtn.isDisplayed());

    }
    */

    @When("je clique sur Shop")
    public void jeCliqueSurShop() {

        homeLocator.shopLink.click();

    }

    @And("je saisis un email au format invalide dans le champ Subscribe Here {string}")
    public void jeSaisisUnEmailAuFormatInvalideDansLeChampSubscribeHereMailCom(String invalidEmail) {

        newsletter.subscribeInput.sendKeys(invalidEmail);
    }

    @And("je clique sur le bouton Subscribe")
    public void jeCliqueSurLeBoutonSubscribe() {

        newsletter.subscribeBtn.click();
    }


    @Then("un message d'erreur apparaît")
    public void unMessageDErreurApparait() {

        String errorMessage = "Please provide a valid email address";

        Assert.assertTrue("Le message d'erreur n'apparait pas", driver.getPageSource().contains(errorMessage) );
    }

    @And("je saisis un email au format valide dans le champ Subscribe Here {string}")
    public void jeSaisisUnEmailAuFormatValideDansLeChampSubscribeHereEmail(String emailValid) {

        newsletter.subscribeInput.sendKeys(emailValid);
    }

    @Then("un mail de confirmation est reçu dans la boite email de l'utilisateur")
    public void unMailDeConfirmationEstRecuDansLaBoiteEmailDeLUtilisateur() throws IOException {

        driver.navigate().to(prop.getProperty("urlEmailBox"));
        driver.navigate().refresh();

        // EXPLICIT WAIT
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='email_subject']")));

        String confirmationMailMessage = mailLoc.mailSubject.getText();

        Assert.assertTrue("Le mail ne s'affiche pas", confirmationMailMessage.contains("Please Confirm Subscription"));

        // SCREENSHOT
        screenshot.takeScreenshot();


    }

    @Then("un bouton Subscribe s affiche en bas de la page panier")
    public void unBoutonSubscribeSAfficheEnBasDeLaPagePanier() {

        String actualPage = driver.getCurrentUrl();

        Assert.assertTrue("La page panier n'est pas affiché",actualPage.contains("basket") );
        Assert.assertTrue("Le bouton Subscribe ne s'affiche pas", newsletter.subscribeBtn.isDisplayed());

    }

    @Then("un bouton Subscribe s affiche en bas de la page shop")
    public void unBoutonSubscribeSAfficheEnBasDeLaPageShop() {

        String actualPage = driver.getCurrentUrl();

        Assert.assertTrue("La page panier n'est pas affiché",actualPage.contains("shop") );
        Assert.assertTrue("Le bouton Subscribe ne s'affiche pas", newsletter.subscribeBtn.isDisplayed());
    }

    @Then("un bouton Subscribe s affiche en bas de la page My Account")
    public void unBoutonSubscribeSAfficheEnBasDeLaPageMyAccount() {

        String actualPage = driver.getCurrentUrl();

        Assert.assertTrue("La page panier n'est pas affiché",actualPage.contains("my-account") );
        Assert.assertTrue("Le bouton Subscribe ne s'affiche pas", newsletter.subscribeBtn.isDisplayed());

    }
}
