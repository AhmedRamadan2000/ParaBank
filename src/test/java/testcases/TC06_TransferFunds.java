package testcases;

import Pages.P02_LoginPage;
import Pages.P05_AccountsOverview;
import Pages.P06_TransferFunds;
import org.testng.Assert;
import org.testng.annotations.Test;
import retry.MyRetry;
import utility.Utilities;

import static testcases.TC01_Registration.PASSWORD;
import static testcases.TC01_Registration.UserName;
import static utility.Utilities.softAssert;

public class TC06_TransferFunds extends TestBase{
    //ToDo: create test case to check the Transfer Funds
    @Test(priority = 1, retryAnalyzer = MyRetry.class)
    public void CheckTheTransferFunds_P() {
        new P02_LoginPage(driver).EnterUsername(UserName).enterPassword(PASSWORD).clickLoginButton();

        //ToDo: Take a login screenshot
        Utilities.Capturescreenshots(driver, "ValidLoginImage");
        Assert.assertTrue(new P02_LoginPage(driver).checkLoginProfile());

        new P06_TransferFunds(driver).clickOnTransferFundsLink().checkTheTransferFundsTitle();
        //ToDo: Take Transfer Funds screenshot
        Utilities.Capturescreenshots(driver, "Transfer Funds");
        new P06_TransferFunds(driver).AddAmount(10).clickOnTransferButton();
        //ToDo: Take Account Details screenshot
        Utilities.Capturescreenshots(driver, "Transfer Complete");
        softAssert.assertTrue(new P06_TransferFunds(driver).checkTheTransferCompleteTitle());
    }
}