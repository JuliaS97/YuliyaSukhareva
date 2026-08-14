import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumHomework3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://anarabbas.com/labs/auto-lab");

            WebElement fullName = driver.findElement(By.id("fullName"));
            fullName.sendKeys("Yuliya Sukhareva");
            System.out.println("Full Name daxil edildi: " + fullName.getAttribute("value"));

            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("yuliya@abb.az");
            System.out.println("Email daxil edildi: " + email.getAttribute("value"));

            WebElement password = driver.findElement(By.id("passField"));
            password.sendKeys("Abb123");
            System.out.println("Password daxil edildi.");

            WebElement clickBtn = driver.findElement(By.id("clickBtn"));
            js.executeScript("arguments[0].scrollIntoView({block: 'center'}); arguments[0].click();", clickBtn);
            System.out.println("Primary Click düyməsinə basıldı.");

            WebElement dblBtn = driver.findElement(By.id("dblBtn"));
            js.executeScript(
                    "arguments[0].scrollIntoView({block: 'center'});" +
                            "var ev = new MouseEvent('dblclick', {bubbles: true, cancelable: true, view: window});" +
                            "arguments[0].dispatchEvent(ev);", dblBtn);
            System.out.println("Double Click düyməsinə iki dəfə basıldı.");

            WebElement rcBtn = driver.findElement(By.id("rcBtn"));
            js.executeScript(
                    "arguments[0].scrollIntoView({block: 'center'});" +
                            "var ev = new MouseEvent('contextmenu', {bubbles: true, cancelable: true, view: window});" +
                            "arguments[0].dispatchEvent(ev);", rcBtn);
            System.out.println("Right Click düyməsinə sağ klik edildi.");

            WebElement disabledBtn = driver.findElement(By.cssSelector("button.pg-btn[disabled]"));
            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", disabledBtn);
            System.out.println("Disabled düymə aktiv deyil: " + !disabledBtn.isEnabled());

            System.out.println("\nBütün Text Box və Buttons avtomatlaşdırması uğurla tamamlandı");

            Thread.sleep(2000);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            driver.quit();
        }
    }
}