import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task2_AlertsAndModal {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            driver.get("https://anarabbas.com/labs/auto-lab");

            // "Alerts & Modal" kateqoriyasına keçirik
            WebElement modalMenu = wait.until(
                    ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-p='modal']"))
            );
            modalMenu.click();

            // Sadə alert()
            WebElement alertBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("alertBtn")));
            alertBtn.click();

            Alert simpleAlert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("Alert mətni: " + simpleAlert.getText());
            simpleAlert.accept();

            // confirm() - imtina edirik (dismiss)
            WebElement confirmBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmBtn")));
            confirmBtn.click();

            Alert confirmAlert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("Confirm mətni: " + confirmAlert.getText());
            confirmAlert.dismiss();

            // prompt() - ad yazıb qəbul edirik
            WebElement promptBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("promptBtn")));
            promptBtn.click();

            Alert promptAlert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("Prompt mətni: " + promptAlert.getText());
            promptAlert.sendKeys("Aysel Məmmədova");
            promptAlert.accept();

            //Saxta Modal - switchTo().alert()
            WebElement openModalBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("openModal")));
            openModalBtn.click();

            // Adi findElement ilə modalın içindəki mətn sahəsini tapırıq
            WebElement modalInput = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("modalInput"))
            );
            modalInput.sendKeys("Bu saxta modaldır, real alert deyil!");

            WebElement modalSubmit = driver.findElement(By.id("modalSubmit"));
            modalSubmit.click();

            System.out.println("\nSaxta modal uğurla dolduruldu və təsdiqləndi (real alert API-si istifadə olunmadı).");
            System.out.println("Bütün Alerts & Modal tapşırığı tamamlandı!");

        } finally {
            driver.quit();
        }
    }
}