package testcases;

import Pages.P02_LoginPage;
import Pages.P03_HomePage;
import Pages.P09_UpdateContactInfo;
import Pages.P10_RequestLoan;
import org.testng.Assert;
import org.testng.annotations.Test;
import retry.MyRetry;
import utility.Utilities;

import static testcases.TC01_Registration.PASSWORD;
import static testcases.TC01_Registration.UserName;
import static utility.Utilities.softAssert;

public class TC10_RequestLoan extends TestBase{
    public static String LoanAmount = "10";
    public static String DownPayment = "5";

    @Test(priority = 1, retryAnalyzer = MyRetry.class)
    public void RequestLoan_P() {
        new P02_LoginPage(driver).EnterUsername(UserName).enterPassword(PASSWORD).clickLoginButton();

        //ToDo: Take a login screenshot
        Utilities.Capturescreenshots(driver, "ValidLoginImage");
        Assert.assertTrue(new P02_LoginPage(driver).checkLoginProfile());

        new P10_RequestLoan(driver).clickOnRequestLoanLink().checkTheRequestLoanTitle();
        //ToDo: Take Apply for a Loan screenshot
        Utilities.Capturescreenshots(driver, "Apply for a Loan");

        new P10_RequestLoan(driver).EnterAmount(LoanAmount).EnterDownPayment(DownPayment).clickOnApplyNowButton();
        //ToDo: Take approved Loan screenshot
        Utilities.Capturescreenshots(driver, "approved Request");
        softAssert.assertTrue(new P10_RequestLoan(driver).checkThetProcessedTitle());
    }
    @Test(priority = 2, retryAnalyzer = MyRetry.class)
    public void Logout_P(){
        new P03_HomePage(driver).clickOnLogOutButton();
    }
}