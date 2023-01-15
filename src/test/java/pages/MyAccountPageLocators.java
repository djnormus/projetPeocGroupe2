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
    public WebElement accountLink;

    @FindBy(linkText = "Logout")
    public WebElement logoutLink;

    // LINKS LIST
    @FindBy(xpath = "//nav[@class='woocommerce-MyAccount-navigation']")
    public List<WebElement> navbarLinks;




    // VERIFY & PRINT ALL LINKS

    public void linkIsDisplayed() {

        WebElement[] links = {dashboardLink, ordersLink, downloadsLink, adressesLink, accountLink, logoutLink};

        for (WebElement link : links) {
            Assert.assertTrue(link.isDisplayed());
            System.out.println("lien : " + link.getText());
        }

    }



}
