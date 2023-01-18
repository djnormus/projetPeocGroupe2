package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetailsPageLocators {

    WebDriver driver;

    public AccountDetailsPageLocators(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    // INPUT CURRENT PASSWORD
    @FindBy(id = "password_current")
    public WebElement currentPswdInput;

    // INPUT NEW PASSWORD
    @FindBy(id = "password_1")
    public WebElement newPswdInput;

    // INPUT CONFIRM NEW PASSWORD
    @FindBy(id = "password_2")
    public WebElement confirmPswdInput;

    // BTN SAVE CHANGES
    @FindBy(xpath = "//input[@name='save_account_details']")
    public WebElement saveChangesBtn;


    // LOCATOR MESSAGE CONFIRM SUCCESS
    @FindBy(xpath = "//div[@class='woocommerce-message']")
    public WebElement mesagePswdSuccessPath;
    // MESSAGE CONFIRM SUCCESS
    public  String mesagePswdSuccess = "Account details changed successfully.";


    // LOCATOR MESSAGE ACTUEL PASSWORD ERROR
    @FindBy(xpath = "//li[normalize-space()='Your current password is incorrect.']")
    public WebElement messagePswdActuelErrorPath;
    // MESSAGE ACTUEL PASSWORD ERROR
    public String messagePswdActuelError = "Your current password is incorrect.";


    // LOCATOR MESSAGE NEW PASSWORDS DO NO MATCH
    @FindBy(xpath = "//li[normalize-space()='New passwords do not match.']")
    public WebElement messagePswdNoMatchPath;
    // MESSAGE NEW PASSWORDS DO NO MATCH
    public String messagePswdNoMatch = "New passwords do not match.";



}
