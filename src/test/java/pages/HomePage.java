package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By cookieAgreeBtn = By.id("didomi-notice-agree-button");
    private By kontaktLink = By.xpath("//a[@href='/content/kontakt']");
    private By dostavaLink = By.xpath("//a[@href='/content/dostava-i-placanje']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void acceptCookies() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(cookieAgreeBtn)).click();
        } catch (Exception ignored) {}
    }

    public void openKontakt() {
        wait.until(ExpectedConditions.elementToBeClickable(kontaktLink)).click();
    }

    public void openDostava() {
        wait.until(ExpectedConditions.elementToBeClickable(dostavaLink)).click();
    }

    public void openProteiniPage() {
        driver.get("https://gymbeam.hr/proteini");
    }

    public void clickFilterButton() {
        By filterBtn = By.xpath("//span[normalize-space()='Prikaži filtere']");
        wait.until(ExpectedConditions.elementToBeClickable(filterBtn)).click();
    }

    public boolean isCategoryVisible(String category) {
        By locator = By.xpath("//span[normalize-space()='" + category + "']");
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return el.isDisplayed();
    }
}
