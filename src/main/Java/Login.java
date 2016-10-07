import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by seregin-av on 07.10.2016.
 */
public class Login {
    WebDriver driver;
    WebDriverWait wait;

    public Login(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        }

    public void login(String login, String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Email")));
        WebElement email = driver.findElement(By.name("Email"));
        email.sendKeys(login);
        email.submit();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd")));
        WebElement passwd = driver.findElement(By.name("Passwd"));
        passwd.sendKeys(pass);
        passwd.submit();
    }
}
