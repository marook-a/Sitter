package Badges_Sitter;

import Sitter.login_page.Login_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.io.File;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static settings.settings_sitter.*;

public class BadgesPageTest {
    private WebDriver driver;
    public BadgesPage badges_page;
    public Login_page login_page;
    public FakerImageUploader fakerImageUploader;

    String pathToFile = "/Users/fusion_tech/Desktop/sitter/testImg/photo3-2.jpeg";

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
        try {
            login_page.logInButton.click();
            login_page.email.sendKeys(email);
            login_page.password.sendKeys(password);
            login_page.checkbox.click();
            login_page.btnLogIn.click();
            badges_page.btnBadges.click();
            System.out.println("Открыта страница Badges");
            badges_page.uploadDoc.click();
            File tempImageFile = FakerImageUploader.createTempImageFile();
            String pathToTempImageFile = tempImageFile.getAbsolutePath();
           System.out.println(pathToTempImageFile);
            badges_page.fileUpload.sendKeys(pathToTempImageFile);
           String actualText = badges_page.name_file.getText();
           assertNotEquals(pathToTempImageFile, actualText);
//           badges_page.fileUpload.sendKeys(pathToFile);
            badges_page.btnSave.click();
            Thread.sleep(4000);
        }
        catch (Exception e) {
            System.out.println("Проблема с загрузкой файла");
        }

    }
}