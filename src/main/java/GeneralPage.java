import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by seregin-av on 05.10.2016.
 */
public class GeneralPage {

    public GeneralPage() {}

    public GeneralPage(WebDriver driver){
        driver.get("http://www.tut.by");
        WebElement work = driver.findElement(By.xpath("//*[@class='topbar__link' and @title='Работа']"));
        work.click();
    }
}
