package com.hani.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {

    public static WebDriver driver;

    public InventoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private static WebElement oneProduct;
    public void addOneProduct() {
        oneProduct.click();
    }
    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private static WebElement removeOne;

    public void backpackRemove() {
        removeOne.click();
    }
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private static WebElement productSort;

    public void sortProduct(String sortProduct) {
        productSort.click();
        Select a = new Select(productSort);
        a.selectByVisibleText(sortProduct);
    }
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private static WebElement firstProduct;
    public void addFirst(){
        firstProduct.click();
    }

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private static WebElement secondProduct;
    public void addSecond(){
        secondProduct.click();
    }
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
   private static WebElement clickBasket;
    public void clickCart(){
        clickBasket.click();
    }
    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
        private static WebElement removeFirst;
    public void remove1(){

        removeFirst.click();
    }

    @FindBy(xpath = "//button[@id='continue-shopping']")
    private static WebElement continueShopping;

    public void shoppingContinue(){
        continueShopping.click(); }
@FindBy(xpath = "//button[@id='checkout']")
private static WebElement checkOut;
    public void goOut(){
        checkOut.click();

}

}

