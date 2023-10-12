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

        // Check if Career page is open
        // boolean careerPageIsOpen = driver.getCurrentUrl().contains("careers"); // Replace with the actual URL for the careers page
/*
        WebElement locationsBlock = driver.findElement(By.cssSelector("#career-our-location > div > div > div > div.col-12.col-md-6 > h3"));
        WebElement teamsBlock = driver.findElement(By.id("teams"));
        WebElement lifeAtInsiderBlock = driver.findElement(By.id("life-at-insider"));

        if (locationsBlock.isDisplayed() && teamsBlock.isDisplayed() && lifeAtInsiderBlock.isDisplayed()) {
            System.out.println("Career page, its Locations, Teams, and Life at Insider blocks are open.");
        } else {
            System.out.println("One or more blocks are not open on the Career page.");
        }


 */
    }
}
