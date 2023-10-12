import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static java.lang.Thread.sleep;

import static java.lang.Thread.sleep;

public class Company {

    public static void selectCompany(WebDriver driver){

        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        // Find and click the "Company" menu
        WebElement companyMenu = driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle' and contains(text(), 'Company')]"));
        companyMenu.click();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Wait for the "Careers" link to be clickable and click it
        WebElement careersLink = driver.findElement(By.xpath("//a[@href='https://useinsider.com/careers/' and @class='dropdown-sub']"));
        careersLink.click();




    }
}
