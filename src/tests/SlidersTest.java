package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SlidersPage;

public class SlidersTest {

    private WebDriver driver;
    private SlidersPage slidersPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        slidersPage = new SlidersPage(driver);
        slidersPage.open();
        slidersPage.openSlidersSection();
    }

    @Test
    public void testDefaultValues() {
        Assert.assertEquals(slidersPage.getTemperatureValue(), "50°C",
                "Temperature default dəyəri düzgün deyil");
        Assert.assertEquals(slidersPage.getVolumeValue(), "75%",
                "Volume default dəyəri düzgün deyil");
    }

    @Test
    public void testTemperatureChange() {
        slidersPage.setTemperatureValue(25);
        Assert.assertEquals(slidersPage.getTemperatureValue(), "25°C",
                "Temperature dəyəri 25°C-yə düzgün dəyişmədi");
    }

    @Test
    public void testVolumeChange() {
        slidersPage.setVolumeValue(40);
        Assert.assertEquals(slidersPage.getVolumeValue(), "40%",
                "Volume dəyəri 40%-ə düzgün dəyişmədi");
    }

    @Test
    public void testTemperatureBoundaries() {
        // Minimum sərhəd
        slidersPage.setTemperatureValue(0);
        String minValue = slidersPage.getTemperatureValue();
        int minNumber = Integer.parseInt(minValue.replace("°C", ""));
        Assert.assertEquals(minValue, "0°C", "Minimum temperature dəyəri düzgün deyil");
        Assert.assertTrue(minNumber >= 0, "Temperature 0°C-dən aşağı düşdü");

        // Maksimum sərhəd
        slidersPage.setTemperatureValue(100);
        String maxValue = slidersPage.getTemperatureValue();
        int maxNumber = Integer.parseInt(maxValue.replace("°C", ""));
        Assert.assertEquals(maxValue, "100°C", "Maksimum temperature dəyəri düzgün deyil");
        Assert.assertTrue(maxNumber <= 100, "Temperature 100°C-dən yuxarı çıxdı");
    }

    @Test
    public void testVolumeBoundaries() {
        // Minimum sərhəd
        slidersPage.setVolumeValue(0);
        String minValue = slidersPage.getVolumeValue();
        int minNumber = Integer.parseInt(minValue.replace("%", ""));
        Assert.assertEquals(minValue, "0%", "Minimum volume dəyəri düzgün deyil");
        Assert.assertTrue(minNumber >= 0, "Volume 0%-dən aşağı düşdü");

        // Maksimum sərhəd
        slidersPage.setVolumeValue(100);
        String maxValue = slidersPage.getVolumeValue();
        int maxNumber = Integer.parseInt(maxValue.replace("%", ""));
        Assert.assertEquals(maxValue, "100%", "Maksimum volume dəyəri düzgün deyil");
        Assert.assertTrue(maxNumber <= 100, "Volume 100%-dən yuxarı çıxdı");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}