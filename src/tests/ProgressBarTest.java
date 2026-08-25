package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ProgressBarPage;

public class ProgressBarTest {

    private WebDriver driver;
    private ProgressBarPage progressBarPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        progressBarPage = new ProgressBarPage(driver);
        progressBarPage.open();
        progressBarPage.openProgressBarSection();
    }

    @Test
    public void testInitialState() {
        Assert.assertEquals(progressBarPage.getCurrentValue(), 0,
                "Başlanğıc dəyəri 0 deyil");
        Assert.assertEquals(progressBarPage.getCurrentValueText(), "0%",
                "Başlanğıc label mətni 0% deyil");
    }

    @Test
    public void testProgressIncreases() {
        progressBarPage.start();

        // Thread.sleep əvəzinə explicit wait - dəyər 10-dan böyük olana qədər gözləyir
        progressBarPage.waitUntilValueReaches(10);

        Assert.assertTrue(progressBarPage.getCurrentValue() > 0,
                "Proqres başladıqdan sonra dəyər artmadı");
    }

    @Test
    public void testStopKeepsValue() {
        progressBarPage.start();
        progressBarPage.waitUntilValueReaches(30);

        progressBarPage.stop();
        int valueAtStop = progressBarPage.getCurrentValue();

        // Thread.sleep əvəzinə - passiv gözləmə WebDriverWait polling mexanizmi ilə
        progressBarPage.passiveWait(2);

        int valueAfterWait = progressBarPage.getCurrentValue();
        Assert.assertEquals(valueAfterWait, valueAtStop,
                "Dayandırılmış proqresin dəyəri dəyişdi");
    }

    @Test
    public void testReset() {
        progressBarPage.start();
        progressBarPage.waitUntilValueReaches(20);

        progressBarPage.reset();

        Assert.assertEquals(progressBarPage.getCurrentValue(), 0,
                "Reset sonrası dəyər 0-a qayıtmadı");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}