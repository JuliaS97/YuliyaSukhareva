import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task3_NestedFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            driver.get("https://anarabbas.com/labs/auto-lab");

            // "iFrame" kateqoriyasına keçirik
            WebElement iframeMenu = wait.until(
                    ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-p='iframe']"))
            );
            iframeMenu.click();

            // Xarici frame-ə keçirik
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("demoFrame")));

            WebElement frameInput = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("frameInput"))
            );
            frameInput.sendKeys("y");

            WebElement frameBtn = driver.findElement(By.id("frameBtn"));
            frameBtn.click();
            System.out.println("Xarici frame-də mətn yazıldı və düyməyə klikləndi.");

            // 2. Xarici frame-in daxilindəki ikinci (nested) frame-ə keçirik
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("innerFrame")));

            WebElement innerFrameBtn = wait.until(
                    ExpectedConditions.elementToBeClickable(By.id("innerFrameBtn"))
            );
            innerFrameBtn.click();
            System.out.println("Nested frame-də düyməyə klikləndi.");

            // 3. Birbaşa əsas səhifəyə qayıdırıq
            driver.switchTo().defaultContent();

            // Əsas səhifəyə qayıtdığımızı sübut etmək üçün bir elementin mətnini çap edirik
            WebElement mainPageElement = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-p='iframe']"))
            );
            System.out.println("Əsas səhifəyə qayıtdıq. Menyu elementinin mətni: " + mainPageElement.getText());

            System.out.println("\nBütün iFrame tapşırığı uğurla tamamlandı!");

        } finally {
            driver.quit();
        }
    }
}