package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_AccountsOverview {
    //ToDo: define locators
    private final By AccountOverviewLink = By.xpath("//a[@href='/parabank/overview.htm']");
    private final By AccountOverviewTitle = By.xpath("//h1[@class='title']");
    private final By AccountNumber = By.xpath("//a[@class=\"ng-binding\"]");
    private final By AccountDetailsTitle = By.xpath("//h1[@class =contains(text(),'Account Details')]");

    WebDriver driver;

    //ToDo: define driver
    public P05_AccountsOverview(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo: add action methods
    public P05_AccountsOverview clickOnOverviewLink() {
        driver.findElement(this.AccountOverviewLink).click();
        return this;
    }

    public boolean checkTheAccountOverviewTitle() {
        return driver.findElement(this.AccountOverviewTitle).getText().equals("Accounts Overview");
    }

    public P05_AccountsOverview clickOnAccountNumber() {
        driver.findElement(this.AccountNumber).click();
        return this;
    }

    public boolean checkTheAccountDetailsTitle() {
        return driver.findElement(this.AccountDetailsTitle).getText().equals("Account Details");
    }
}