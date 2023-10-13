package testcases;

import Pages.P02_LoginPage;
import Pages.P04_OpenNewAccount;
import org.testng.Assert;
import org.testng.annotations.Test;
import retry.MyRetry;
import utility.Utilities;

import static testcases.TC01_Registration.PASSWORD;
import static testcases.TC01_Registration.UserName;
import static utility.Utilities.softAssert;

public class TC04_OpenNewAccount extends TestBase{
    //ToDo: create test case to create a new account
    @Test(priority = 1, retryAnalyzer = MyRetry.class)
    public void OpenNewAccount_P() {
        new P02_LoginPage(driver).EnterUsername(UserName).enterPassword(PASSWORD).clickLoginButton();
        //ToDo: Take Login screenshot
        Utilities.Capturescreenshots(driver, "ValidLoginImage");
        Assert.assertTrue(new P02_LoginPage(driver).checkLoginProfile());

     new P04_OpenNewAccount(driver).clickOnOpenNewAccountLink().checkTheTitle();
        //ToDo: Take Open New Account screenshot
        Utilities.Capturescreenshots(driver, "Open New Account");
     new P04_OpenNewAccount(driver).clickOnOpenNewAccountButton();
        //ToDo: Take Account Opened screenshot
        Utilities.Capturescreenshots(driver, "Account Opened");
     softAssert.assertTrue(new P04_OpenNewAccount(driver).checkAccountOpenedTitle());
    }
}