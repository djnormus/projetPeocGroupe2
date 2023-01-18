package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailBoxPageLocators {

    WebDriver driver;

    public EmailBoxPageLocators(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    // MAIL SUBJECT
    @FindBy(xpath = "//div[@class='email_subject']")
    public WebElement mailSubject;






}
