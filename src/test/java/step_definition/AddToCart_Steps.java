package step_definition;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ShopPageLocators;

import static step_definition.Hooks.driver;

public class AddToCart_Steps {

    ShopPageLocators shopLoc = new ShopPageLocators(driver);

    @Then("chaque article contient une photo descriptive, un libellé et le prix affiché au-dessous")
    public void chaqueArticleContientUnePhotoDescriptiveUnLibelléEtLePrixAffichéAuDessous() {

        for (WebElement article: shopLoc.allItems){

            Assert.assertTrue("La photo n'est pas affichée", article.findElement(By.className("wp-post-image")).isDisplayed());
            Assert.assertTrue("Le titre n'est pas affiché",article.findElement(By.tagName("h3")).isDisplayed());
            Assert.assertTrue("Le prix n'est pas affichée",article.findElement(By.className("price")).isDisplayed());

        }


    }
}
