package featureTests;
import org.junit.Before;
import org.junit.After;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wordpress.testselenium2014.tests.pageobjects.LoginPage;

public class CheckUserLoggedInToDashboardTest {
    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();
        LoginPage lgnPage = PageFactory.initElements(driver, LoginPage.class);
        lgnPage.login();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void UserLogIntoDashboardTest() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains("Dashboard"));

    }

}
