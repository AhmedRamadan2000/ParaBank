package testcases;

import Pages.P02_LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import retry.MyRetry;
import utility.Utilities;

import static testcases.TC01_Registration.PASSWORD;
import static testcases.TC01_Registration.UserName;

public class TC02_LoginPage extends TestBase {

    //define test data

    //ToDo: create test case to check login with valid emila nad password
    @Test(priority = 1, retryAnalyzer = MyRetry.class)
    public void loginWithValidUsernameAndValidPassword_P() {
        new P02_LoginPage(driver).EnterUsername(UserName).enterPassword(PASSWORD).clickLoginButton();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "ValidLoginImage");
        Assert.assertTrue(new P02_LoginPage(driver).checkLoginProfile());
    }

    //Negative test cases
    @Test(priority = 2)
    public void loginWithValidUsernameAndInvalidPassword_N() {
        PASSWORD = "dsfsd";

        //ToDo: Login with invalid mail and invalid password
        new P02_LoginPage(driver).EnterUsername(UserName).enterPassword(PASSWORD).clickLoginButton();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "InvalidPasswordImage");
        Assert.assertTrue(new P02_LoginPage(driver).validationMessage());
    }

    @Test(priority = 3)
    public void loginWithInvalidUsernameAndValidPassword_N() {

        UserName = "djdd";
        //ToDo: Login with invalid mail and invalid password
        new P02_LoginPage(driver).EnterUsername(UserName).enterPassword(PASSWORD).clickLoginButton();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "InvalidUsernameImage");
        Assert.assertTrue(new P02_LoginPage(driver).validationMessage());
    }

    @Test(priority = 4)
    public void loginWithInvalidUsernameAndInvalidPassword_N() {
        UserName = "djdd";
        PASSWORD = "dsfsd";
        //ToDo: Login with invalid mail and invalid password
        new P02_LoginPage(driver).EnterUsername(UserName).enterPassword(PASSWORD).clickLoginButton();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "invalidUsernameAndPasswordImage");
        Assert.assertTrue(new P02_LoginPage(driver).validationMessage());
    }
}