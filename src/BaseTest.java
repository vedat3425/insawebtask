import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    public static void setUp(WebDriver driver){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe ");
            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));

         driver.get("https://useinsider.com/");
        String pageTitle = driver.getTitle();
        driver.manage().window().maximize();
        if (pageTitle.contains("Insider")) {
            System.out.println("Insider home page is opened.");
        } else {
            System.out.println("Insider home page is not opened.");
        };
    }
}
