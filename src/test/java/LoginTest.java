import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by seregin-av on 03.10.2016.
 */
public class LoginTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    private void connection () throws Exception {
//        driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10000);
    }

    @Test(dataProvider = "Data for login", dataProviderClass = DataProviders.class)
    public void loginTest(String login, String pass) throws Exception {
        driver.get("https://accounts.google.com/");

        Login loginm = new Login(driver, wait);
        loginm.login(login, pass);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@title, 'Dealing Dealingoviy')]"))).getText();
    }

    @AfterTest
     void closeConnection() throws Exception{
        driver.quit();
    }
}
