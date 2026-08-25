package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DatePickerPage;

public class DatePickerTest {

    private WebDriver driver;
    private DatePickerPage datePickerPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        datePickerPage = new DatePickerPage(driver);
        datePickerPage.open();
        datePickerPage.openDatePickerSection();
    }

    @Test
    public void testDateSelection() {
        datePickerPage.setDate("2026-08-21");

        Assert.assertEquals(datePickerPage.getDate(), "2026-08-21",
                "Tarix sahəsi düzgün dəyəri göstərmir");
    }

    @Test
    public void testDateTimeSelection() {
        datePickerPage.setDateTime("2026-08-21T14:30");

        Assert.assertEquals(datePickerPage.getDateTime(), "2026-08-21T14:30",
                "Tarix və saat sahəsi düzgün dəyəri göstərmir");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}