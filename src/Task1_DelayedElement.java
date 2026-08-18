import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1_DelayedElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            driver.get("https://anarabbas.com/labs/auto-lab");

            // 1. "Dynamic Elements" kateqoriyasına keçirik
            WebElement dynMenu = wait.until(
                    ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-p='dyn']"))
            );
            dynMenu.click();

            // 2. delayBtn-in klikə hazır olmasını gözləyirik
            WebElement delayBtn = wait.until(
                    ExpectedConditions.elementToBeClickable(By.id("delayBtn"))
            );

            long startTime = System.currentTimeMillis();
            delayBtn.click();

            // 3. dynReveal-in görünməsini gözləyirik
            WebElement dynReveal = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("dynReveal"))
            );

            long endTime = System.currentTimeMillis();
            long elapsedMs = endTime - startTime;

            System.out.println("Element " + elapsedMs + " millisaniyə sonra göründü.");
            System.out.println("Mətn: " + dynReveal.getText());

        } finally {
            driver.quit();
        }
    }
}