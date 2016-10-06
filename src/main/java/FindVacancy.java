import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by seregin-av on 06.10.2016.
 */
public class FindVacancy {

    public FindVacancy() {}

    public List<WebElement> FindVacancy(WebDriver driver) {
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'специалист') or contains(text(),'Специалист') and contains(text(),'по') and contains(text(),'тестированию')]"));
        return list;
    }
}

