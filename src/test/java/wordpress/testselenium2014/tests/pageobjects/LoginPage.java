package wordpress.testselenium2014.tests.pageobjects;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage {

    WebDriver driver;
    @FindBy(how = How.ID, id = "user_login")
    WebElement login;
    @FindBy(how = How.ID, id = "user_pass")
    WebElement password;
    @FindBy(how = How.ID, id = "wp-submit")
    WebElement submit;
    @FindBy(css = "#wpbody-content > div.wrap > h2")
    WebElement dashboardTitle;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://testselenium2014.wordpress.com/wp-login.php");
    }

    public void login() {
        login.sendKeys("testselenium2014");
        password.sendKeys("velosiped");
        submit.click();
    }

    public void checkTitle(String title) {
        String dashboardTitleText = dashboardTitle.getText();
        assertEquals(title, dashboardTitleText);

    }
};
