package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPageLocators {

    WebDriver driver;

    public BasketPageLocators(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    // BASKET LINK
    @FindBy(id = "wpmenucartli")
    public WebElement basketLink;

    // LIST ITEM
    @FindBy(xpath = "//tr[@class='cart_item']")
    public WebElement cartItem;







}
