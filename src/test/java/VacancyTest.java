import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seregin-av on 03.10.2016.
 */
public class VacancyTest {
    private WebDriver driver;

    @BeforeTest
    private void connection () throws Exception {
//        driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Google/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "Data for find", dataProviderClass = DataProviders.class)
    public void vacancyTest(String findstr) throws Exception {

        GeneralPage generalPage = new GeneralPage(driver);

        WorkPage workPage = new WorkPage(driver, findstr);

        FindVacancy findVacancy = new FindVacancy();
        List<WebElement> list = findVacancy.FindVacancy(driver);

        if (list.isEmpty())
            throw new Exception("Not found vacancy");
    }

    @AfterTest
     void closeConnection() throws Exception{
        driver.quit();
    }
}
