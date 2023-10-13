package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P09_UpdateContactInfo {
    //ToDo: define locators
    private final By updateProfileLink = By.xpath("/parabank/updateprofile.htm");
    private final By updateProfileTitle = By.xpath("//h1[@class =contains(text(),'Update Profile')]");
    private final By phoneFiled = By.id("customer.phoneNumber");
    private final By updateProfileButton = By.xpath("(//input)[@class=\"button\"]");
    private final By confirmUpdateProfileTitle = By.xpath("//h1[@class =contains(text(),'Profile Updated')]");

    WebDriver driver;

    //ToDo: define driver
    public P09_UpdateContactInfo(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo: add action methods
    public P09_UpdateContactInfo clickOnUpdateProfileLink() {
        driver.findElement(this.updateProfileLink).click();
        return this;
    }

    public boolean checkTheUpdateProfileTitle() {
        return driver.findElement(this.updateProfileTitle).getText().equals("Update Profile");
    }

    public P09_UpdateContactInfo EnterPhone(String Phone) {
        driver.findElement(this.phoneFiled).sendKeys(Phone);
        return this;
    }

    public P09_UpdateContactInfo clickOnUpdateProfileButton() {
        driver.findElement(this.updateProfileButton).click();
        return this;
    }

    public boolean checkConfirmUpdateProfileTitle() {
        return driver.findElement(this.confirmUpdateProfileTitle).getText().equals("Profile Updated");
    }
}
