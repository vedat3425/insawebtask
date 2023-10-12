import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class Cookie {
    public static void disableCookie(WebDriver driver){

        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        try {
            sleep(2_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement acceptButton = driver.findElement(By.id("wt-cli-accept-all-btn")); // "wt-cli-accept-all-btn" ID'sini kullanarak düğmeyi bulun
        acceptButton.click();


    }
}
