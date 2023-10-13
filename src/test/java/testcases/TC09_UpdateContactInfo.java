package testcases;

import Pages.P02_LoginPage;
import Pages.P09_UpdateContactInfo;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import retry.MyRetry;
import utility.Utilities;

import static testcases.TC01_Registration.PASSWORD;
import static testcases.TC01_Registration.UserName;
import static utility.Utilities.softAssert;

public class TC09_UpdateContactInfo extends TestBase {
    public static Faker faker = new Faker();
    public static String Phone = faker.phoneNumber().cellPhone();

    @Test(priority = 1, retryAnalyzer = MyRetry.class)
    public void UpdateTheProfile_P() {
        new P02_LoginPage(driver).EnterUsername(UserName).enterPassword(PASSWORD).clickLoginButton();

        //ToDo: Take a login screenshot
        Utilities.Capturescreenshots(driver, "ValidLoginImage");
        Assert.assertTrue(new P02_LoginPage(driver).checkLoginProfile());

        new P09_UpdateContactInfo(driver).clickOnUpdateProfileLink().checkTheUpdateProfileTitle();
        //ToDo: Take update profile screenshot
        Utilities.Capturescreenshots(driver, "Update Profile");

        new P09_UpdateContactInfo(driver).EnterPhone(Phone).clickOnUpdateProfileButton();
        //ToDo: Take Profile Updated screenshot
        Utilities.Capturescreenshots(driver, "Profile Updated");
        softAssert.assertTrue(new P09_UpdateContactInfo(driver).checkConfirmUpdateProfileTitle());
    }
}