package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P01_RegisterPage {

    // define locators
    private final By First_name = By.id("customer.firstName");
    private final By Last_name = By.id("customer.lastName");
    private final By Address = By.id("customer.address.street");
    private final By City = By.id("customer.address.city");
    private final By State = By.id("customer.address.state");
    private final By ZipCode = By.id("customer.address.zipCode");
    private final By SSN = By.id("customer.ssn");
    private final By UserName = By.id("customer.username");
    private final By Password = By.id("customer.password");
    private final By Confirm_password = By.id("repeatedPassword");
    private final By register_button = By.xpath("//tbody/tr[13]/td[2]/input[1]");
    private final By ConfirmRegistration = By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");
    private final By ValidationMessage = By.id("customer.username.errors");
    private final By LogoutButton = By.xpath("//a[contains(text(),'Log Out')]");

    //define driver
    WebDriver driver;
    Select select;

    public P01_RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public P01_RegisterPage addFirst_name(String Firstname) {
        driver.findElement(this.First_name).sendKeys(Firstname);
        return this;
    }

    public P01_RegisterPage addLast_name(String LastName) {
        driver.findElement(this.Last_name).sendKeys(LastName);
        return this;
    }

    public P01_RegisterPage addAddress(String Address) {
        driver.findElement(this.Address).sendKeys(Address);
        return this;
    }

    public P01_RegisterPage addCity(String City) {
        driver.findElement(this.City).sendKeys(City);
        return this;
    }

    public P01_RegisterPage addState(String State) {
        driver.findElement(this.State).sendKeys(State);
        return this;
    }

    public P01_RegisterPage addZipCode(String ZipCode) {
        driver.findElement(this.ZipCode).sendKeys(ZipCode);
        return this;
    }

    public P01_RegisterPage addSSN(String SSN) {
        driver.findElement(this.SSN).sendKeys(SSN);
        return this;
    }

    public P01_RegisterPage addUsername(String UserName) {
        driver.findElement(this.UserName).sendKeys(UserName);
        return this;
    }

    public P01_RegisterPage addPassword(String password) {
        driver.findElement(this.Password).sendKeys(password);
        return this;
    }

    public P01_RegisterPage addConfirm_password(String password) {
        driver.findElement(this.Confirm_password).sendKeys(password);
        return this;
    }

    public P01_RegisterPage clickRegisterButton() {
        driver.findElement(this.register_button).click();
        return this;
    }

    public P01_RegisterPage clickLogoutButton() {
        driver.findElement(this.LogoutButton).click();
        return this;
    }

    public boolean confirmationMessage() {
        return driver.findElement(this.ConfirmRegistration).getText().equals("Your account was created successfully. You are now logged in.");
    }

    public boolean ValidationMessage() {
        return driver.findElement(this.ValidationMessage).getText().equals("This username already exists.");
    }
}