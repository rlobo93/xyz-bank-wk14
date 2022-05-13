package com.bank.pages;


import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CustomersPage extends Utility {

    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }

@FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logout;

    public void clickLogOut(){
        clickOnElement(logout);
    }
    public String verifyLogOutText(){
        return getTextFromElement(logout);
    }



}
