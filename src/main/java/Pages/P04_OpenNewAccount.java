package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_OpenNewAccount {
    //ToDo: define locators
    private final By OpenNewAccountLink = By.xpath("//a[@href='/parabank/openaccount.htm']");
    private final By OpenNewAccountButton = By.id("id0");
    private final By OpenNewAccountTitle = By.xpath("//h1[@class =contains(text(),'Open New Account')]");
    private final By accountOpenedTitle = By.xpath("//h1[@class =contains(text(),'Account Opened!')]");

    WebDriver driver;

    //ToDo: define driver
    public P04_OpenNewAccount(WebDriver driver) {
        this.driver = driver;
    }
    //ToDo: add action methods
    public P04_OpenNewAccount clickOnOpenNewAccountLink() {
        driver.findElement(this.OpenNewAccountLink).click();
        return this;
    }
    public boolean checkTheTitle() {
        return driver.findElement(this.OpenNewAccountTitle).getText().equals("Open New Account");
    }
    public P04_OpenNewAccount clickOnOpenNewAccountButton() {
        driver.findElement(this.OpenNewAccountButton).click();
        return this;
    }
    public boolean checkAccountOpenedTitle() {
        return driver.findElement(this.accountOpenedTitle).getText().equals("Account Opened!");
    }

}