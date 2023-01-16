package step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasketPageLocators;
import pages.HomePageLocators;
import pages.NewsletterLocators;

import java.time.Duration;

import static step_definition.Hooks.driver;

public class Newsletter_Steps {

    BasketPageLocators basketLoc = new BasketPageLocators(driver);
    NewsletterLocators newsletter = new NewsletterLocators(driver);
    HomePageLocators homeLocator = new HomePageLocators(driver);


    @When("je clique sur Panier")
    public void jeCliqueSurPanier() {

        basketLoc.basketLink.click();
    }


    @Then("un bouton Subscribe s affiche en bas de la page")
    public void unBoutonSubscribeSAfficheEnBasDeLaPage() {

        Assert.assertTrue("Le bouton Subscribe ne s'affiche pas", newsletter.subscribeBtn.isDisplayed());

    }

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




        //driver.switchTo().frame("aswift_7");

        // EXPLICIT WAIT
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Subscribe']")));


        newsletter.subscribeBtn.click();


    }


    @Then("un message d'erreur apparaît")
    public void unMessageDErreurApparait() {

        String errorMessage = "Please provide a valid email address";

        Assert.assertTrue("Le message d'erreur n'apparait pas", driver.getPageSource().contains(errorMessage) );
    }
}