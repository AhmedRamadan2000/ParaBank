package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P10_RequestLoan {
    //ToDo: define locators
    private final By requestLoanLink = By.xpath("/parabank/requestloan.htm");
    private final By requestLoanTitle = By.xpath("//h1[@class =contains(text(),'Apply for a Loan')]");
    private final By loanAmountField = By.id("amount");
    private final By downPaymentField = By.id("downPayment");
    private final By applyNowButton = By.id("id2");
    private final By requestProcessedTitle = By.xpath("//h1[@class =contains(text(),'Loan Request Processed')]");

    WebDriver driver;

    //ToDo: define driver
    public P10_RequestLoan(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo: add action methods
    public P10_RequestLoan clickOnRequestLoanLink() {
        driver.findElement(this.requestLoanLink).click();
        return this;
    }

    public boolean checkTheRequestLoanTitle() {
        return driver.findElement(this.requestLoanTitle).getText().equals("Apply for a Loan");
    }

    public P10_RequestLoan EnterAmount(String LoanAmount) {
        driver.findElement(this.loanAmountField).sendKeys(LoanAmount);
        return this;
    }

    public P10_RequestLoan EnterDownPayment(String DownPayment) {
        driver.findElement(this.downPaymentField).sendKeys(DownPayment);
        return this;
    }

    public P10_RequestLoan clickOnApplyNowButton() {
        driver.findElement(this.applyNowButton).click();
        return this;
    }

    public boolean checkThetProcessedTitle() {
        return driver.findElement(this.requestProcessedTitle).getText().equals("Loan Request Processed");
    }
}