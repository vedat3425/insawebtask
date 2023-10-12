import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestWeb {

  public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
         WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
      BaseTest.setUp(driver);
      Cookie.disableCookie(driver);
      Company.selectCompany(driver);
      QualitAssuranceMenu.QA(driver);
      CheckJobs.Jobs(driver);
      ViewRoleRedirectTest.viewRole(driver);

      driver.quit();






    }
}