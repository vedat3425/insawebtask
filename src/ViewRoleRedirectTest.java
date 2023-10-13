import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewRoleRedirectTest {

    public static void viewRole(WebDriver driver){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // "Senior Software Quality Assurance Engineer - Remote" başlığına mouse hover yapın
        WebElement positionTitle = driver.findElement(By.xpath("//p[@class='position-title font-weight-bold']"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", positionTitle);


        Actions actions = new Actions(driver);
        actions.moveToElement(positionTitle).perform();

        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(positionTitle));


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("View Role")));
        // "View Role" butonunu bul ve tıkla
        driver.findElement(By.linkText("View Role")).click();
        try {
            Thread.sleep(6000); // 2 saniye bekleme
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String mainWindowHandle = driver.getWindowHandle();
       java.util.Set<String> allWindowHandles = driver.getWindowHandles();

        String newWindowHandle = "";
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                newWindowHandle = handle;
                break;
            }
        }

        driver.switchTo().window(newWindowHandle);
        String currentURL = driver.getCurrentUrl();

        System.out.println(currentURL);

        if (currentURL.contains("https://jobs.lever.co/useinsider/")) {
            System.out.println("Aksiyon Lever Başvuru Formu sayfasına yönlendirdi.");
        } else {
            System.out.println("Aksiyon Lever Başvuru Formu sayfasına yönlendirmedi.");
        }

// URL'nin doğru olduğunu doğrula
        assert currentURL.contains("https://jobs.lever.co/useinsider/") : "URL yanlış sayfaya yönlendirildi.";

        System.out.println("Tüm doğrulamalar başarıyla tamamlandı.");

        driver.close();
        driver.switchTo().window(mainWindowHandle);

    }

}
