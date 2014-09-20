package wordpress.testselenium2014.tests.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class AppearancePage {

    WebDriver driver;

    @FindBy(css = "#wpbody-content > div.wrap > h2")
    public WebElement widgetAboutMe;


    public AppearancePage(WebDriver driver) {
        this.driver = driver;

    }


}