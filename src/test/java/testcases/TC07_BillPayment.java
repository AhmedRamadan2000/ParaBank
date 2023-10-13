package testcases;

import Pages.P02_LoginPage;
import Pages.P07_BillPayment;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import retry.MyRetry;
import utility.Utilities;

import static testcases.TC01_Registration.PASSWORD;
import static testcases.TC01_Registration.UserName;
import static utility.Utilities.softAssert;

public class TC07_BillPayment extends TestBase {
    public static Faker faker = new Faker();
    public static String PayeeName = faker.name().firstName();
    public static String Address = faker.address().streetAddress();
    public static String City = faker.country().name();
    public static String State = faker.country().capital();
    public static String ZipCode = faker.address().zipCode();
    public static String Phone = faker.phoneNumber().cellPhone();
    public static String AccountNumber = "65487";
    public static String Amount = "5";


    //ToDo: create test case to check the Transfer Funds
    @Test(priority = 1, retryAnalyzer = MyRetry.class)
    public void AddBillPayment_P() {
        new P02_LoginPage(driver).EnterUsername(UserName).enterPassword(PASSWORD).clickLoginButton();

        //ToDo: Take a login screenshot
        Utilities.Capturescreenshots(driver, "ValidLoginImage");
        Assert.assertTrue(new P02_LoginPage(driver).checkLoginProfile());
        new P07_BillPayment(driver).clickOnBillPaymentLink().checkTheBillPaymentTitle();
        //ToDo: Take Bill Payment Service screenshot
        Utilities.Capturescreenshots(driver, "Bill Payment Service");

        new P07_BillPayment(driver).EnterPayeeName(PayeeName).EnterAddress(Address).EnterCity(City)
                .EnterState(State).EnterZipCode(ZipCode).EnterPhone(Phone).EnterAccountNumber(AccountNumber)
                .EnterVerifyAccountNumber(AccountNumber).EnterAmount(Amount).clickOnSendPaymentButton();
        //ToDo: Take Complete Bill Payment screenshot
        Utilities.Capturescreenshots(driver, "Bill Payment Complete");
        softAssert.assertTrue(new P07_BillPayment(driver).checkTheCompletePaymentTitle());
    }
}