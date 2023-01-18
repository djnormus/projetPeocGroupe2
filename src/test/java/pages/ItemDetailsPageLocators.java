package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemDetailsPageLocators {
    WebDriver driver;

    public ItemDetailsPageLocators(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//*[@id=\"product-182\"]/div[1]/a/img")
    public WebElement itemPicture;


    @FindBy (xpath = "//*[@id='product-182']/div[2]/div[1]/p/span")
    public WebElement itemPrice;

    @FindBy (xpath = "//*[@id=\"product-182\"]/div[2]/p")
    public WebElement stockLabel;

    @FindBy (xpath = "//*[@id=\"product-182\"]/div[2]/div[2]")
    public WebElement itemDescription;

    @FindBy (xpath = "//*[@id=\"product-182\"]/div[2]/form/button")
    public WebElement itemButtonAdd;

    @FindBy (xpath = "//*[@id=\"product-182\"]/div[2]/form/div/input")
    public WebElement itemQuantitySelect;

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]")
    public WebElement successMessage;

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/a")
    public WebElement itemButtonView;


}