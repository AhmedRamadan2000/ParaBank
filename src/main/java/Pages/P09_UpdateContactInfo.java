package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P09_UpdateContactInfo {
    //ToDo: define locators
    private final By UserProfile = By.xpath("//p[@class=\"oxd-userdropdown-name\"]");

    WebDriver driver;

    //ToDo: define driver
    public P09_UpdateContactInfo(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo: add action methods
}
