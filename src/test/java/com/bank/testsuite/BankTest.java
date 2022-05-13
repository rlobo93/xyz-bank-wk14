package com.bank.testsuite;


import com.bank.pages.*;
import com.bank.testbase.TestBase;
import javafx.scene.control.Tab;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BankTest extends TestBase {

    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    AccountPage accountPage;
    CustomerLoginPage customerLoginPage;
    CustomersPage customersPage;
    OpenAccountPage openAccountPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        addCustomerPage = new AddCustomerPage();
        accountPage = new AccountPage();
        customerLoginPage = new CustomerLoginPage();
        customersPage = new CustomersPage();
        openAccountPage = new OpenAccountPage();
    }

    @Test(groups = {"smoke", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
//    click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLogin();
//    click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomerTab();
//    enter FirstName
        addCustomerPage.inputFirstName("Ron");
//    enter LastName
        addCustomerPage.inputLastName("Jira");
//    enter PostCode
        addCustomerPage.inputPostcode("UB10 10UB");
//    click On "Add Customer" Button
        addCustomerPage.clickOnAddCustomerButton();
        Thread.sleep(1000);
//    verify message "Customer added successfully"
        addCustomerPage.verifyPopUpMessage();
        Thread.sleep(1000);
//    click on "ok" button on popup.
        addCustomerPage.acceptAlertMessage();
    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
//    click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLogin();
//    click On "Open Account" Tab
        bankManagerLoginPage.clickOnOpenAccountTab();
//    Search customer that created in first test
        openAccountPage.selectCustomerName("Ron Jira");
//    Select currency "Pound"
        openAccountPage.selectCurrency("Pound");
//    click on "process" button
        openAccountPage.clickProcessButton();
//    popup displayed
//    verify message "Account created successfully"

//    click on "ok" button on popup.
        openAccountPage.acceptAlert();

    }

    @Test(groups = {"sanity", "regression"})
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException {
        //    click on "Customer Login" Tab
        homePage.clickOnCustomerTab();

//    search customer that you created.
        customerLoginPage.selectCustomer("Ron Jira");

//    click on "Login" Button
        customerLoginPage.clickLogin();
        Thread.sleep(1000);

//    verify "Logout" Tab displayed.
        String expectedMessage = "Logout";
        String actualMessage = customersPage.verifyLogOutText();
        Assert.assertEquals(expectedMessage, actualMessage);

//    click on "Logout"
        customersPage.clickLogOut();

//    verify "Your Name" text displayed.
        String expectedMessage1 = "Your Name :";
        String actualMessage1 = customerLoginPage.verifyYourNameText();
        Assert.assertEquals(expectedMessage1, actualMessage1);

    }

    @Test(groups = {"regression"})
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
//    click on "Customer Login" Tab
        homePage.clickOnCustomerTab();
//    search customer that you created.
        customerLoginPage.selectCustomer("Ron Jira");
//    click on "Login" Button
        customerLoginPage.clickLogin();
//    click on "Deposit" Tab
        accountPage.clickDeposit();
//    Enter amount 100
        accountPage.setEnterDeposit("100");
        Thread.sleep(1000);
//    click on "Deposit" Button
        accountPage.clickDepositBtn();
        Thread.sleep(1000);
//    verify message "Deposit Successful"
        String expectedMessage = "Deposit Successful";
        String actualMessage = accountPage.verfiyDepositSuccessful();
        Assert.assertEquals(expectedMessage, actualMessage);


    }


    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
//    click on "Customer Login" Tab
        homePage.clickOnCustomerTab();
//    search customer that you created.
        customerLoginPage.selectCustomer("Ron Jira");
//    click on "Login" Button
        customerLoginPage.clickLogin();

        accountPage.clickDeposit();
//    Enter amount 100
        accountPage.setEnterDeposit("500");
        Thread.sleep(1000);
//    click on "Deposit" Button
        accountPage.clickDepositBtn();
        Thread.sleep(1000);


//        customerShouldDepositMoneySuccessfully();

//    click on "Withdrawl" Tab
        accountPage.clickwithdrawbt1();
        Thread.sleep(1000);
//    Enter amount 50
        accountPage.enterWithdrawlAmmount("50");
        Thread.sleep(1000);

//    click on "Withdraw" Button
        accountPage.clickWithdrawbt2();
        Thread.sleep(1000);

//    verify message "Transaction Successful"
        String expectedMessage = "Transaction successful";
        String actualMessage = accountPage.verifyTransactionSuccessful();
        Assert.assertEquals(actualMessage,expectedMessage);


    }


}
