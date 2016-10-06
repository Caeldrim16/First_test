import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by seregin-av on 05.10.2016.
 */
public class WorkPage {

    public WorkPage (){}

    public WorkPage(WebDriver driver, String findstr) {
        WebElement str = driver.findElement(By.xpath("//*[@class='bloko-control-group__main'] /child::input"));
        str.sendKeys(findstr);
        str.submit();
    }
}
