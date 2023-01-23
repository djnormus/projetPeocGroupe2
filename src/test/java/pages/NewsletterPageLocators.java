package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsletterPageLocators {

    WebDriver driver;

    public NewsletterPageLocators(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //SUBSCRIBE BTN
    @FindBy(xpath = "//*[@id=\"mc4wp-form-1\"]/div[1]/p[2]/input")
    public WebElement subscribeBtn;

    // SUBSCRIBE INPUT
    @FindBy(name = "EMAIL")
    public WebElement subscribeInput;


    // ERROR MESSAGE







}
