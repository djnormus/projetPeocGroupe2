package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPageLocators {

    WebDriver driver;

    public MyAccountPageLocators(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // WELCOME MESSAGE
    @FindBy(xpath = "//p[contains(text(),'Hello')]")
    public WebElement welcomeMessage;

    // LOGO
    @FindBy(xpath = "//a[@title='Automation Practice Site']")
    public WebElement websiteLogo;


    // LINKS
    @FindBy(linkText = "Dashboard")
    public WebElement dashboardLink;

    @FindBy(linkText = "Orders")
    public WebElement ordersLink;

    @FindBy(linkText = "Downloads")
    public WebElement downloadsLink;

    @FindBy(linkText = "Addresses")
    public WebElement adressesLink;

    @FindBy(linkText = "Account Details")
    public WebElement accountDetailsLink;

    @FindBy(linkText = "Logout")
    public WebElement logoutLink;

    // LINKS LIST
    @FindBy(xpath = "//nav[@class='woocommerce-MyAccount-navigation']")
    public List<WebElement> menuLinks;


    // VERIFY & PRINT ALL LINKS

    public void linkIsDisplayed() {

        WebElement[] links = {dashboardLink, ordersLink, downloadsLink, adressesLink, accountDetailsLink, logoutLink};

        for (WebElement link : links) {
            Assert.assertTrue(link.isDisplayed());
            System.out.println("lien : " + link.getText());
        }

    }


    public void allPageContainLogoAndLinkToHome() {

        // LIST WEB ELEMENTS WITHOUT LOGOUT
        WebElement[] links = {dashboardLink, ordersLink, downloadsLink, adressesLink, accountDetailsLink};

        for (WebElement link : links) {

            link.click();

            // TO GET HREF FROM LOGO
            String logoHrefLink = websiteLogo.getAttribute("href");

            Assert.assertTrue("Le logo n'est pas affiché dans la page : " + driver.getCurrentUrl(), websiteLogo.isDisplayed());

            // VERIFY EACH PAGE LOGO CONTAIN LINK TO HOME PAGE
            Assert.assertEquals("L'image ne contient pas le lien vers l'accueil dans : " + driver.getCurrentUrl(),
                    "https://practice.automationtesting.in/", logoHrefLink);

            // BACK
            //driver.navigate().back();

        }


    }


// END
}
