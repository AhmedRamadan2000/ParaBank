package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_HomePage {
    //ToDo: define locators
    private final By logOutButton = By.xpath("//a[@href='/parabank/logout.htm']");

    WebDriver driver;

    //ToDo: define driver
    public P03_HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo: add action methods
    public P03_HomePage clickOnLogOutButton() {
        driver.findElement(this.logOutButton).click();
        return this;
    }
}