package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {

    //define locators
    private final By loginlink = By.xpath("//input[@class='button']");
    private final By Registerlink = By.xpath("//a[contains(text(),'Register')]");
    private final By username = By.xpath("//input[@name=\"username\"]");
    private final By password = By.xpath("//input[@name=\"password\"]");
    WebDriver driver;

    public Main(WebDriver driver) {
        this.driver = driver;
    }

    public Main clickLoginlink() {
        driver.findElement(this.loginlink).click();
        return this;
    }

    public Main clickRegisterlink() {
        driver.findElement(this.Registerlink).click();
        return this;
    }
}