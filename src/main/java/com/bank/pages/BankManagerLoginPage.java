package com.bank.pages;


import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BankManagerLoginPage extends Utility {

    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomerTab;

    public void clickOnAddCustomerTab() {
        clickOnElement(addCustomerTab);
    }


    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccountTab;

    public void clickOnOpenAccountTab() {
        clickOnElement(openAccountTab);
    }


    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[3]")
    WebElement customers;

    public void clickOnCustomers() {
        clickOnElement(customers);
    }

}
