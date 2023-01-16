package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginRegisterPageLocators {

    WebDriver driver;

    // CONSTRUCTOR
    public LoginRegisterPageLocators(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // LOGIN USERNAME OR EMAIL INPUT
    @FindBy(id = "username")
    public WebElement loginEmailInput;

    // LOGIN PASSWORD INPUT
    @FindBy(id = "password")
    public WebElement LoginPasswordInput;

    // LOGIN BTN SUBMIT
    @FindBy(name = "login")
    public WebElement loginBtn;

    // LOGIN ERROR MESSAGE
    @FindBy(xpath = "//li[contains(text(),': the password you entered for the username')]")
    public WebElement loginErrorMsg;

    // LINK LOST YOUR PASSWORD
    @FindBy(xpath ="//a[normalize-space()='Lost your password?']" )
    public WebElement linkLostPassword;


    // REGISTER USERNAME OR EMAIL INPUT
    @FindBy(id = "reg_email")
    public WebElement registerEmailInput;

    // REGISTER PASSWORD INPUT
    @FindBy(id = "reg_password")
    public WebElement registerPasswordInput;

    // REGISTER BTN SUBMIT
    @FindBy(name = "register")
    public WebElement registerBtn;

    // CHECKBOX
    @FindBy(id = "rememberme")
    public WebElement checkboxRemember;






}
