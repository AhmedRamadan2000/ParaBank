package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P06_TransferFunds {
    //ToDo: define locators
    private final By transferFundsLink = By.xpath("//a[@href='/parabank/transfer.htm']");
    private final By transferFundsTitle = By.xpath("//h1[@class =contains(text(),'Transfer Funds')]");
    private final By amountField = By.id("amount");
    private final By transferButton = By.id("id1");
    private final By transferCompleteTitle = By.xpath("//h1[@class =contains(text(),'Transfer Complete!')]");

    WebDriver driver;

    //ToDo: define driver
    public P06_TransferFunds(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo: add action methods
    public P06_TransferFunds clickOnTransferFundsLink() {
        driver.findElement(this.transferFundsLink).click();
        return this;
    }

    public boolean checkTheTransferFundsTitle() {
        return driver.findElement(this.transferFundsTitle).getText().equals("Transfer Funds");
    }

    public P06_TransferFunds AddAmount(Integer amount) {
        driver.findElement(this.amountField).sendKeys();
        return this;
    }

    public P06_TransferFunds clickOnTransferButton() {
        driver.findElement(this.transferButton).click();
        return this;
    }

    public boolean checkTheTransferCompleteTitle() {
        return driver.findElement(this.transferCompleteTitle).getText().equals("Transfer Complete");
    }
}