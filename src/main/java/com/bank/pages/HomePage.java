package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeButtonBtn;

    public void clickOnHomeButton() {
        clickOnElement(homeButtonBtn);
    }


    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLoginBtn;

    public void clickOnCustomerTab() {
        clickOnElement(customerLoginBtn);
    }

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginBtn;

    public void clickOnBankManagerLogin() {
        clickOnElement(bankManagerLoginBtn);
    }


}
