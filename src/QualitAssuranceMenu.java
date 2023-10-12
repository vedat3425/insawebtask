
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class QualitAssuranceMenu {

    public static void QA(WebDriver driver)
    {

        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
       driver.get("https://useinsider.com/careers/quality-assurance/");

        WebElement seeAllJobsButton = driver.findElement(By.partialLinkText("See all QA jobs"));
        seeAllJobsButton.click();


        try {
            sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement element = driver.findElement(By.name("filter-by-location"));

        Select slc=new Select((element));
        slc.selectByVisibleText(("Istanbul, Turkey"));


        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", slc);

        try {
            sleep(6_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement department = driver.findElement(By.name("filter-by-department"));
        Select slcDep=new Select((department));
        slcDep.selectByVisibleText(("Quality Assurance"));


        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", slcDep);

        try {
            sleep(6_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400);");




    }
}
