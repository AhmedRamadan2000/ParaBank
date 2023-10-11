package testcases;

import Pages.Main;
import Pages.P01_RegisterPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.Utilities;

public class TC01_Registration extends TestBase {
    public static Faker faker = new Faker();

    public static String FName = faker.name().firstName();
    public static String LastName = faker.name().lastName();
    public static String Address = faker.address().streetAddress();
    public static String City = faker.country().name();
    public static String State = faker.country().capital();
    public static String ZipCode = faker.address().zipCode();
    public static String SSN = faker.idNumber().ssnValid();
    public static String UserName = faker.name().username();
    public static String PASSWORD = "ahmed123";

    @Test(enabled = true)
    public void RegisterNewUserWithValidData_P() {

        new Main(driver).clickRegisterlink();

        new P01_RegisterPage(driver).addFirst_name(FName).addLast_name(LastName).addAddress(Address)
                .addCity(City).addState(State).addZipCode(ZipCode).addSSN(SSN).addUsername(UserName)
                .addPassword(PASSWORD).addConfirm_password(PASSWORD).clickRegisterButton();
        System.out.println(UserName);

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "RegisterWithNewUser");

        //ToDo: Assert the user register successfully
        Assert.assertTrue(new P01_RegisterPage(driver).confirmationMessage());
    }

    @Test(enabled = true)
    public void RegisterNewUserWithInvalidData_N() {
        //ToDo: Register with new user
        new Main(driver).clickRegisterlink();
        UserName = "admin22";

        new P01_RegisterPage(driver).addFirst_name(FName).addLast_name(LastName).addAddress(Address)
                .addCity(City).addState(State).addZipCode(ZipCode).addSSN(SSN).addUsername(UserName)
                .addPassword(PASSWORD).addConfirm_password(PASSWORD).clickRegisterButton().clickLogoutButton();

        //ToDo: Register again with the same username
        new Main(driver).clickRegisterlink();
        new P01_RegisterPage(driver).addFirst_name(FName).addLast_name(LastName).addAddress(Address)
                .addCity(City).addState(State).addZipCode(ZipCode).addSSN(SSN).addUsername(UserName)
                .addPassword(PASSWORD).addConfirm_password(PASSWORD).clickRegisterButton();

        //ToDo: Take a screenshot
        Utilities.Capturescreenshots(driver, "RegisterWithInvalidData");

        //ToDo: Assert the validation message appears
        Assert.assertTrue(new P01_RegisterPage(driver).ValidationMessage());
    }
}