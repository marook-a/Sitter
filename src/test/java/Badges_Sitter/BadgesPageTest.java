package Badges_Sitter;

import Sitter.login_page.Login_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Locale;


import static settings.FakerSettings.faker_email;
import static settings.FakerSettings.*;
import static settings.settings.*;

public class BadgesPageTest {
    private WebDriver driver;
    public BadgesPage badges_page;
    public Login_page login_page;

    public FakerImageUploader fakerImageUploader;

    String FileJpeg = "/Users/fusion_tech/Desktop/sitter/testImg/test-img.jpeg";

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);

        login_page = new Login_page(driver);
        badges_page = new BadgesPage(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void badges() {
        login_page.logInButton.click();
        login_page.email.sendKeys(email);
        login_page.password.sendKeys(password);
        login_page.checkbox.click();
        login_page.btnLogIn.click();
        badges_page.btnBadges.click();
        badges_page.uploadDoc.click();
        fakerImageUploader.uploadFile(" .jpeg");
        badges_page.btnSave.click();
    }
}
