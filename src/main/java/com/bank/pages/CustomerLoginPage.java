package com.bank.pages;


import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CustomerLoginPage extends Utility {

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customer;

    public void selectCustomer(String text){
        selectByVisibleTextFromDropDown(customer,text);

    }

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement login;

    public void clickLogin() {
        clickOnElement(login);
    }



    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement nametag;
    public String verifyYourNameText(){
        return getTextFromElement(nametag);
    }

}
