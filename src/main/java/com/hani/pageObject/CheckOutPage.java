package com.hani.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    public static WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(id = "first-name")
    private WebElement firstname;
    public void setFirstname(String user){
        firstname.sendKeys(user);
    }
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastname;
    public void setLastname(String lstname){
        lastname.sendKeys(lstname);
    }
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement zipcode;
    public void setZipcode(String postalcode){
        zipcode.sendKeys(postalcode);
    }
    @FindBy(xpath = "//h3")
    private WebElement errorMessage;
    public String getErrorMessage(){
        return errorMessage.getText();
    }
    @FindBy(id = "continue")
    private WebElement continueButton;
    public void buttonCountinue( ){
        continueButton.click();
    }



    public boolean isDisplayed(){
        firstname.isDisplayed();
        return true;
    }
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement ItemTotalCheck;
    public String CheckTOTAL (){ return ItemTotalCheck.getText();}

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement TaxCheck;
    public String CheckTax (){return TaxCheck.getText();}

    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement TotalAll;
    public String AllTotal (){return TotalAll.getText();}

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finish;
    public void Finish (){finish.click();}

    @FindBy(css = ".complete-header")
    private WebElement HappyEnding;
    public String End (){return HappyEnding.getText();}

}

