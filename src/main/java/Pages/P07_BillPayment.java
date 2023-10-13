package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P07_BillPayment {
    //ToDo: define locators
    private final By billPaymentLink = By.xpath("//a[@href='/parabank/billpay.htm']");
    private final By billPaymentTitle = By.xpath("//h1[@class =contains(text(),'Bill Payment Service')]");
    private final By payeeNameField = By.id("id0");
    private final By addressField = By.id("id1");
    private final By cityField = By.id("id2");
    private final By stateField = By.id("id3");
    private final By zipCodeField = By.id("id4");
    private final By phoneField = By.id("id5");
    private final By accountField = By.id("id6");
    private final By verifyAccountField = By.id("id7");
    private final By amountField = By.id("id8");
    private final By sendPaymentButton = By.id("id9");
    private final By completePaymentTitle = By.xpath("//h1[@class =contains(text(),'Bill Payment Complete')]");

    WebDriver driver;

    //ToDo: define driver
    public P07_BillPayment(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo: add action methods
    public P07_BillPayment clickOnBillPaymentLink() {
        driver.findElement(this.billPaymentLink).click();
        return this;
    }

    public boolean checkTheBillPaymentTitle() {
        return driver.findElement(this.billPaymentTitle).getText().equals("Bill Payment Service");
    }

    public P07_BillPayment EnterPayeeName(String PayeeName) {
        driver.findElement(this.payeeNameField).sendKeys(PayeeName);
        return this;
    }

    public P07_BillPayment EnterAddress(String Address) {
        driver.findElement(this.addressField).sendKeys(Address);
        return this;
    }

    public P07_BillPayment EnterCity(String City) {
        driver.findElement(this.cityField).sendKeys(City);
        return this;
    }

    public P07_BillPayment EnterState(String State) {
        driver.findElement(this.stateField).sendKeys(State);
        return this;
    }

    public P07_BillPayment EnterZipCode(String ZipCode) {
        driver.findElement(this.zipCodeField).sendKeys(ZipCode);
        return this;
    }

    public P07_BillPayment EnterPhone(String PhoneNumber) {
        driver.findElement(this.phoneField).sendKeys(PhoneNumber);
        return this;
    }

    public P07_BillPayment EnterAccountNumber(String AccountNumber) {
        driver.findElement(this.accountField).sendKeys(AccountNumber);
        return this;
    }

    public P07_BillPayment EnterVerifyAccountNumber(String AccountNumber) {
        driver.findElement(this.verifyAccountField).sendKeys(AccountNumber);
        return this;
    }

    public P07_BillPayment EnterAmount(String Amount) {
        driver.findElement(this.amountField).sendKeys(Amount);
        return this;
    }

    public P07_BillPayment clickOnSendPaymentButton() {
        driver.findElement(this.sendPaymentButton).click();
        return this;
    }

    public boolean checkTheCompletePaymentTitle() {
        return driver.findElement(this.completePaymentTitle).getText().equals("Bill Payment Complete");
    }
}
