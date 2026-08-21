package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SlidersPage extends BasePage {

    private final By slidersMenu = By.cssSelector("button[data-p='slider']");
    private final By tempSlider = By.id("tempSlider");
    private final By tempVal = By.id("tempVal");
    private final By volSlider = By.id("volSlider");
    private final By volVal = By.id("volVal");

    public SlidersPage(WebDriver driver) {
        super(driver);
    }

    // "Sliders" bölməsinə keçir
    public void openSlidersSection() {
        WebElement menu = waitClickable(slidersMenu);
        clickWithJs(menu);
        waitVisible(tempSlider);
    }

    // Temperature label-in cari dəyərini qaytarır (məs. "50°C")
    public String getTemperatureValue() {
        return waitVisible(tempVal).getText();
    }

    // Volume label-in cari dəyərini qaytarır (məs. "75%")
    public String getVolumeValue() {
        return waitVisible(volVal).getText();
    }

    // Temperature slider-in mövqeyini dəyişir
    public void setTemperatureValue(int value) {
        setSliderValue(tempSlider, value);
    }

    // Volume slider-in mövqeyini dəyişir
    public void setVolumeValue(int value) {
        setSliderValue(volSlider, value);
    }

    private void setSliderValue(By locator, int value) {
        WebElement slider = waitVisible(locator);
        js.executeScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('input', {bubbles:true}));",
                slider, value
        );
    }

    public WebElement getTempSliderElement() {
        return waitVisible(tempSlider);
    }

    public WebElement getVolSliderElement() {
        return waitVisible(volSlider);
    }
}