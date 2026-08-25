package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.function.Function;

public class ProgressBarPage extends BasePage {

    private final By progressMenu = By.cssSelector("button[data-p='progress']");
    private final By startBtn = By.id("pgStart");
    private final By stopBtn = By.id("pgStop");
    private final By resetBtn = By.id("pgReset");
    private final By progressBar = By.id("pgBar");
    private final By progressVal = By.id("pgVal");

    public ProgressBarPage(WebDriver driver) {
        super(driver);
    }

    // "Progress Bar" bölməsinə keçir
    public void openProgressBarSection() {
        WebElement menu = waitClickable(progressMenu);
        clickWithJs(menu);
        waitVisible(progressBar);
    }

    // Progresi başladır
    public void start() {
        WebElement btn = waitClickable(startBtn);
        clickWithJs(btn);
    }

    // Progresi dayandırır
    public void stop() {
        WebElement btn = waitClickable(stopBtn);
        clickWithJs(btn);
    }

    // Progresi sıfırlayır
    public void reset() {
        WebElement btn = waitClickable(resetBtn);
        clickWithJs(btn);
    }

    // aria-valuenow atributundan cari faizi (ədəd olaraq) qaytarır
    public int getCurrentValue() {
        String value = waitVisible(progressBar).getAttribute("aria-valuenow");
        return Integer.parseInt(value);
    }

    // Label-in cari mətnini qaytarır (məs. "45%")
    public String getCurrentValueText() {
        return waitVisible(progressVal).getText();
    }

    // Progresin verilmiş dəyərə çatmasını gözləyir (Thread.sleep əvəzinə)
    public void waitUntilValueReaches(int targetValue) {
        Function<WebDriver, Boolean> condition = d -> getCurrentValue() >= targetValue;
        wait.withTimeout(Duration.ofSeconds(30)).until(condition);
    }

    // Progresin tam tamamlanmasını (100%) gözləyir
    public void waitUntilComplete() {
        waitUntilValueReaches(100);
    }

    // Thread.sleep əvəzinə: WebDriverWait-in polling mexanizmi ilə passiv gözləmə
    public void passiveWait(int seconds) {
        try {
            wait.withTimeout(Duration.ofSeconds(seconds))
                    .until(d -> false);
        } catch (org.openqa.selenium.TimeoutException ignored) {
            // Gözlənilən vaxt bitdi, davam edirik
        }
    }
}