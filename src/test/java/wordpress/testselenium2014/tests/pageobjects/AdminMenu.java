package wordpress.testselenium2014.tests.pageobjects;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class AdminMenu {

    WebDriver driver;

    @FindBy(xpath = "//div[contains(text(),'Pages')]") WebElement linkPages;
    @FindBy(xpath = "//div[contains(text(),'Posts')]") WebElement linkPosts;
    @FindBy(xpath = "//div[contains(text(),'Media')]") WebElement linkMedia;
    @FindBy(css = "#wpbody-content > div.wrap > h2") WebElement pagesTitle;


    public AdminMenu (WebDriver driver) {
        this.driver = driver;

    }

    public void openPagesLink (){
        linkPages.click();
    }

    public void openPostsLink (){
        linkPosts.click();
    }

    public void openMediaLink (){
        linkMedia.click();
    }

    public void checkTitle(String title) {
        String pagesTitleText = pagesTitle.getText();
        assertEquals(title, pagesTitleText);

    }




}