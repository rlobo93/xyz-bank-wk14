package com.bank.pages;


import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


public class OpenAccountPage extends Utility {

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customer;
    public void selectCustomerName(String text) {
        mouseHoverToElement(currency);
       selectByVisibleTextFromDropDown(customer,text);
    }


    @FindBy(xpath = "//select[@id='currency']")
    WebElement currency;
    public void selectCurrency(String text){
        mouseHoverToElement(currency);
        selectByVisibleTextFromDropDown(currency,text);
    }


    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processBtn;
    public void clickProcessButton(){
        clickOnElement(processBtn);
      }



public void clickOKpopUp(){
        acceptAlert();
}





}
