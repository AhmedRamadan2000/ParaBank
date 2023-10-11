package testcases;

import drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import static drivers.DriverHolder.setDriver;

public class TestBase {
    protected WebDriver driver;

    @Parameters("browser")
    @BeforeTest()
    public void setupChromeDriver(String browser) {

        driver = DriverFactory.getNewInstance(browser);
        setDriver(driver);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

//    @AfterTest
//    public void quite() {
//        driver.quit();
//        Thread.currentThread().interrupt();
//    }
}