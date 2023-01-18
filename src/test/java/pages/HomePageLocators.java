package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLocators {

    WebDriver driver;

    public HomePageLocators(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // NAVBAR LINKS
    @FindBy(xpath = "//a[normalize-space()='My Account']")
    public WebElement myAccountLink;

    @FindBy(xpath = "//a[normalize-space()='Shop']")
    public WebElement shopLink;

    //@FindBy(xpath = "")
    //public WebElement cartLink;







}
