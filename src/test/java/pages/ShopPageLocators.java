package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShopPageLocators {

    WebDriver driver;

    public ShopPageLocators(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ONE ITEM "<li>"
    @FindBy(css = ".post-182.product.type-product.status-publish.product_cat-html.product_tag-html.has-post-title.no-post-date.has-post-category.has-post-tag.has-post-comment.has-post-author.last.instock.taxable.shipping-taxable.purchasable.product-type-simple")
    public WebElement oneArticle;

    // ALL ITEMS
    @FindBy(css = "product")
    public List<WebElement> allItems;


    // PICTURE ITEM
    @FindBy(xpath = "//img[@title=\"HTML5 Web Application Development Beginner's guide\"]")
    public WebElement pictureItem;

    // TITLE ITEM
    @FindBy(xpath = "//h3[normalize-space()='HTML5 WebApp Develpment']")
    public WebElement titleItem;

    // PRICE ITEM
    @FindBy(xpath ="//li[@class='post-182 product type-product status-publish product_cat-html product_tag-html has-post-title no-post-date has-post-category has-post-tag has-post-comment has-post-author last instock taxable shipping-taxable purchasable product-type-simple']//span[@class='woocommerce-Price-amount amount']" )
    public WebElement priceItem;

    // ADD TO BASKET BTN
    @FindBy (xpath = "//li[@class='post-182 product type-product status-publish product_cat-html product_tag-html has-post-title no-post-date has-post-category has-post-tag has-post-comment has-post-author last instock taxable shipping-taxable purchasable product-type-simple']//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart'][normalize-space()='Add to basket']")
    public WebElement addToBasketBtn ;




}
