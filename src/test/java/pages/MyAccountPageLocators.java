package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPageLocators {

    WebDriver driver;

    public MyAccountPageLocators(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    // WELCOME MESSAGE
    @FindBy(xpath = "//p[contains(text(),'Hello')]")
    public WebElement welcomeMessage;



}
