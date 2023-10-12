import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class CheckJobs {
    public static void Jobs(WebDriver driver){
        WebElement jobsList = driver.findElement(By.id("career-position-list"));
        if (jobsList.isDisplayed()) {
            System.out.println("İş listesi görüntülendi.");
        } else {
            System.out.println("İş listesi görüntülenmedi.");
        }
        assert jobsList.isDisplayed() : "İş listesi görüntülenmedi.";

        System.out.println("Başarıyla tamamlandı.");

    }}


