package featureTests;
import org.junit.Before;
import org.junit.After;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import wordpress.testselenium2014.tests.pageobjects.LoginPage;
import wordpress.testselenium2014.tests.pageobjects.AdminMenu;

public class CheckMenuLinksTest {
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
    public void openMenuLinksTest() {

        AdminMenu adminMenu = PageFactory.initElements(driver, AdminMenu.class);

        adminMenu.openPagesLink();
        adminMenu.checkTitle("Pages Add New");

        adminMenu.openPostsLink();
        adminMenu.checkTitle("Posts Add New");

        adminMenu.openMediaLink();
        adminMenu.checkTitle("Media Library Add New");

    }

}
