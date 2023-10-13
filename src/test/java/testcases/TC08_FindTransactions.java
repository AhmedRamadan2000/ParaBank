package testcases;

import Pages.P02_LoginPage;
import Pages.P08_FindTransactions;
import org.testng.Assert;
import org.testng.annotations.Test;
import retry.MyRetry;
import utility.Utilities;

import static testcases.TC01_Registration.PASSWORD;
import static testcases.TC01_Registration.UserName;
import static utility.Utilities.softAssert;

public class TC08_FindTransactions extends TestBase {
    public static String Date = "10-13-2023";

    //ToDo: create test case to filter the Transactions

    @Test(priority = 1, retryAnalyzer = MyRetry.class)
    public void FilterTheTransactionsByDate_P() {
        new P02_LoginPage(driver).EnterUsername(UserName).enterPassword(PASSWORD).clickLoginButton();

        //ToDo: Take a login screenshot
        Utilities.Capturescreenshots(driver, "ValidLoginImage");
        Assert.assertTrue(new P02_LoginPage(driver).checkLoginProfile());

        new P08_FindTransactions(driver).clickOnFindTransactionsLink().checkTheTransactionTitle();
        //ToDo: Take Find Transactions screenshot
        Utilities.Capturescreenshots(driver, "Find Transactions");

        new P08_FindTransactions(driver).EnterDate(Date).clickOnFindTransactionButton();
        //ToDo: Take Transaction Results screenshot
        Utilities.Capturescreenshots(driver, "Transaction Results");
        softAssert.assertTrue(new P08_FindTransactions(driver).checkTheTransactionResultTitle());
    }
}