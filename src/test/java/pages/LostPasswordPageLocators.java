package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LostPasswordPageLocators {

    WebDriver driver;

    public LostPasswordPageLocators(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "user_login")
   public WebElement resetInput;

    @FindBy(xpath ="//input[@value='Reset Password']" )
    public WebElement resetPasswordBtn;


}
