package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P08_FindTransactions {
    //ToDo: define locators
    private final By findTransactionsLink = By.xpath("/parabank/findtrans.htm");
    private final By findTransactionTitle = By.xpath("//h1[@class =contains(text(),'Find Transactions')]");
    private final By findByDateField = By.xpath("//input[@id='criteria.onDate']");
    private final By findTransactionButton = By.xpath("//button[@ng-click=\"criteria.searchType = 'DATE'\"]");
    private final By transactionResultTitle = By.xpath("//h1[@class =contains(text(),'Transaction Results')]");
    WebDriver driver;

    //ToDo: define driver
    public P08_FindTransactions(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo: add action methods
    public P08_FindTransactions clickOnFindTransactionsLink() {
        driver.findElement(this.findTransactionsLink).click();
        return this;
    }

    public boolean checkTheTransactionTitle() {
        return driver.findElement(this.findTransactionTitle).getText().equals("Find Transactions");
    }

    public P08_FindTransactions EnterDate(String Date) {
        driver.findElement(this.findByDateField).sendKeys(Date);
        return this;
    }

    public P08_FindTransactions clickOnFindTransactionButton() {
        driver.findElement(this.findTransactionButton).click();
        return this;
    }

    public boolean checkTheTransactionResultTitle() {
        return driver.findElement(this.transactionResultTitle).getText().equals("Transaction Results");
    }
}