package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_LoginPage {

    //ToDo: define locators
    private final By Username = By.name("username");
    private final By Password = By.name("password");
    private final By LoginButton = By.xpath("//input[@class=\"button\"]");
    private final By LoginProfile = By.xpath("//h1[contains(text(),'Accounts Overview')]");
    private final By ValidationMessage = By.xpath("//p[contains(text(),'The username and password could not be verified.')]");

    WebDriver driver;

    //ToDo: define driver
    public P02_LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo: add action methods
    public P02_LoginPage EnterUsername(String Username) {
        driver.findElement(this.Username).sendKeys(Username);
        return this;
    }

    public P02_LoginPage enterPassword(String Password) {
        driver.findElement(this.Password).sendKeys(Password);
        return this;
    }

    public P02_LoginPage clickLoginButton() {
        driver.findElement(this.LoginButton).click();
        return this;
    }

    public boolean checkLoginProfile() {
        return driver.findElement(this.LoginProfile).getText().equals("Accounts Overview");
    }
    public boolean validationMessage() {
        return driver.findElement(this.ValidationMessage).getText().equals("The username and password could not be verified.");
    }
}