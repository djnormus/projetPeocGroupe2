package step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.ItemDetailsPageLocators;
import pages.ShopPageLocators;

import static step_definition.Hooks.driver;

public class ItemsDetails_Steps {


    ShopPageLocators shopLoc = new ShopPageLocators(driver);
    ItemDetailsPageLocators itemDetails = new ItemDetailsPageLocators(driver);

    @And("je clique sur un article")
    public void jeCliqueSurUnArticle() {
        shopLoc.pictureItem.click();
    }

    @Then("une photographie, un détail descriptif,le prix et le nombre d'exemplaires s affichent")
    public void unePhotographieUnDetailDescriptifLePrixEtLeNombreDExemplairesSAffichent() {

        Assert.assertTrue("photo non affichée", itemDetails.itemPicture.isDisplayed());
        Assert.assertTrue("Description non affichée,", itemDetails.itemDescription.isDisplayed());
        Assert.assertTrue("prix non affiché", itemDetails.itemPrice.isDisplayed());
        Assert.assertTrue("nom d'exemplaire non affiché", itemDetails.stockLabel.isDisplayed());


    }

    @And("je clique sur Add to basket le produit {string}")
    public void jeCliqueSurAddToBasketLeProduit(String arg0) {
        itemDetails.itemButtonAdd.click();
    }

    @Then("Un champ qui indique le nombre d'exemplaire affiche {string}")
    public void unChampQuiIndiqueLeNombreDExemplaireAffiche(String arg0) {
        Assert.assertTrue("nombre d'exemplaire non affiché", itemDetails.itemQuantitySelect.isDisplayed());

    }

    @And("Un message de succés {string} apparait")
    public void unMessageDeSuccesApparait(String arg0) {
        Assert.assertTrue("message d'ajout au panier non conforme", itemDetails.successMessage.getText().contains("has been added to your basket."));
    }

    @And("le bouton View Basket s affiche")
    public void leBoutonViewBasketSAffiche() {
        Assert.assertTrue("bouton View basket non affiché", itemDetails.itemButtonView.isDisplayed());
    }
}
