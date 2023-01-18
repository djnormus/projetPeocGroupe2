package step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasketPageLocators;
import pages.ShopPageLocators;

import java.time.Duration;

import static step_definition.Hooks.driver;

public class AddToCart_Steps {

    ShopPageLocators shopLoc = new ShopPageLocators(driver);
    BasketPageLocators basketLocator = new BasketPageLocators(driver);

    @Then("chaque article contient une photo descriptive, un libellé et le prix affiché au-dessous")
    public void chaqueArticleContientUnePhotoDescriptiveUnLibelleEtLePrixAfficheAuDessous() {

        for (WebElement article: shopLoc.allItems){

            Assert.assertTrue("La photo n'est pas affichée", article.findElement(By.className("wp-post-image")).isDisplayed());
            Assert.assertTrue("Le titre n'est pas affiché",article.findElement(By.tagName("h3")).isDisplayed());
            Assert.assertTrue("Le prix n'est pas affichée",article.findElement(By.className("price")).isDisplayed());
        }


    }

    @Then("Le lien READ MORE est affiché sur les articles indisponibles")
    public void leLienREADMOREEstAfficheSurLesArticlesIndisponibles() {

        Assert.assertTrue("Le bouton READ MORE n'est pas affiché", shopLoc.readMoreBtn.isDisplayed());
    }

    @And("Je clique sur ADD TO BASKET sous un article")
    public void jeCliqueSurADDTOBASKETSousUnArticle() {

        shopLoc.addToBasketBtn.click();
    }


    @Then("Un lien VIEW BASKET apparait en dessous de l article")
    public void unLienVIEWBASKETApparaitEnDessousDeLArticle() {

        // EXPLICIT WAIT
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='View Basket']")));

        Assert.assertTrue("Le lien VIEW BASKET n'apparait pas", shopLoc.viewBasketLink.isDisplayed());
    }

    @And("je clique sur le bouton view basket")
    public void jeCliqueSurLeBoutonViewBasket() {

        shopLoc.viewBasketLink.click();
    }

    @Then("la page panier s affiche correctement avec l article ajouté")
    public void laPagePanierSAfficheCorrectementAvecLArticleAjoute() {

        Assert.assertTrue("Aucun article n'est dans le panier", basketLocator.cartItem.isDisplayed());

    }

    @Then("Un filtre permet d'affiner la vue des articles par prix est présent")
    public void unFiltrePermetDAffinerLaVueDesArticlesParPrixEstPresent() {

        Assert.assertTrue("Le filtre par prix n'est pas affiché", shopLoc.filterByPrice.isDisplayed());
    }

    @And("Un filtre permet d'affiner la vue des articles par theme est présent")
    public void unFiltrePermetDAffinerLaVueDesArticlesParThemeEstPresent() {

        Assert.assertTrue("Le filtre par prix n'est pas affiché", shopLoc.filterByTheme.isDisplayed());
    }

    @Then("La page Shop contient les articles en vente")
    public void laPageShopContientLesArticlesEnVente() {

        Assert.assertTrue("Le filtre par prix n'est pas affiché", shopLoc.oneItem.isDisplayed());
    }



}
