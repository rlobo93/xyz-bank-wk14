package com.bank.pages;


import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountPage extends Utility {

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

@FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement deposit;
    public void clickDeposit(){
        clickOnElement(deposit);
    }

@FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement enterDeposit;
    public void setEnterDeposit(String text){
        sendTextToElement(enterDeposit,text);
    }

@FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement clickdepositbtn1;
    public void clickDepositBtn(){
        clickOnElement(clickdepositbtn1);
    }

    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositSuccessful;
    public String verfiyDepositSuccessful(){
        return getTextFromElement(depositSuccessful);
    }






    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement widraw;

    public void clickwithdrawbt1(){
        clickOnElement(widraw);
    }

    @FindBy(xpath = "(//input[@placeholder='amount'])[1]")
    WebElement withdrawlAmount;
    public void enterWithdrawlAmmount(String text){
        sendTextToElement(withdrawlAmount,text);
    }



@FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement clckwithdraw;

    public void clickWithdrawbt2(){
        clickOnElement(clckwithdraw);
    }


@FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement verifytransaction;

    public String verifyTransactionSuccessful(){
        return getTextFromElement(verifytransaction);
    }


    //store Transaction, deposit and withdraw.





}
