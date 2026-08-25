package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerPage extends BasePage {

    private final By datePickerMenu = By.cssSelector("button[data-p='date']");
    private final By datePicker = By.id("datePicker");
    private final By dateTimePicker = By.id("dateTimePicker");

    public DatePickerPage(WebDriver driver) {
        super(driver);
    }

    // "Date Picker" bölməsinə keçir
    public void openDatePickerSection() {
        WebElement menu = waitClickable(datePickerMenu);
        clickWithJs(menu);
        waitVisible(datePicker);
    }

    // Tarix sahəsinə dəyər təyin edir (format: "2026-08-21")
    public void setDate(String date) {
        WebElement input = waitVisible(datePicker);
        js.executeScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('input', {bubbles:true}));" +
                        "arguments[0].dispatchEvent(new Event('change', {bubbles:true}));",
                input, date
        );
    }

    // Tarix sahəsinin cari dəyərini oxuyur
    public String getDate() {
        return waitVisible(datePicker).getAttribute("value");
    }

    // Tarix+saat sahəsinə dəyər təyin edir (format: "2026-08-21T14:30")
    public void setDateTime(String dateTime) {
        WebElement input = waitVisible(dateTimePicker);
        js.executeScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('input', {bubbles:true}));" +
                        "arguments[0].dispatchEvent(new Event('change', {bubbles:true}));",
                input, dateTime
        );
    }

    // Tarix+saat sahəsinin cari dəyərini oxuyur
    public String getDateTime() {
        return waitVisible(dateTimePicker).getAttribute("value");
    }
}