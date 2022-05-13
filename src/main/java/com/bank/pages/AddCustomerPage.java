package com.bank.pages;


import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;


public class AddCustomerPage extends Utility {

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement firstName;

    public void inputFirstName(String text) {
        sendTextToElement(firstName, text);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement lastName;

    public void inputLastName(String text) {
        sendTextToElement(lastName, text);
    }


    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement postCode;

    public void inputPostcode(String text) {
        sendTextToElement(postCode, text);
    }


    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement addCustomerBtn;

    public void clickOnAddCustomerButton() {
        clickOnElement(addCustomerBtn);
    }

    public void acceptAlertMessage() {
        acceptAlert();
    }


    public void verifyPopUpMessage(){
        String actual = getTextFromAlert();
        String expected = "Customer added successfully with customer id :9";
        Assert.assertEquals(actual.substring(0,20),expected.substring(0,20),"wrong popup message");
    }


    public void clickOnOkButtonOnPopUp(){
        Reporter.log("Accepting popup message"+"\n</br>");
        acceptAlert();
    }




}
