package testcases;

import Pages.P02_LoginPage;
import Pages.P04_OpenNewAccount;
import Pages.P05_AccountsOverview;
import org.testng.Assert;
import org.testng.annotations.Test;
import retry.MyRetry;
import utility.Utilities;

import static testcases.TC01_Registration.PASSWORD;
import static testcases.TC01_Registration.UserName;
import static utility.Utilities.softAssert;

public class TC05_AccountsOverview extends TestBase{
    //ToDo: create test case to check the account Details
    @Test(priority = 1, retryAnalyzer = MyRetry.class)
    public void CheckAccountOverView_P() {
        new P02_LoginPage(driver).EnterUsername(UserName).enterPassword(PASSWORD).clickLoginButton();

        //ToDo: Take a login screenshot
        Utilities.Capturescreenshots(driver, "ValidLoginImage");
        Assert.assertTrue(new P02_LoginPage(driver).checkLoginProfile());
        new P05_AccountsOverview(driver).clickOnOverviewLink().checkTheAccountOverviewTitle();
        //ToDo: Take Accounts Overview screenshot
        Utilities.Capturescreenshots(driver, "Accounts Overview");
      new P05_AccountsOverview(driver).clickOnAccountNumber();
        //ToDo: Take Account Details screenshot
        Utilities.Capturescreenshots(driver, "Account Details");
        softAssert.assertTrue(new P05_AccountsOverview(driver).checkTheAccountDetailsTitle());
    }
}