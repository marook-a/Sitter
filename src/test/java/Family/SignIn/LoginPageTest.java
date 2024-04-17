package Family.SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static settings.settings.*;

public class LoginPageTest {
    public WebDriver driver;
    public Login_page login_page;

    @BeforeTest

    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url_Staging);

        login_page = new Login_page(driver);
    }

//    @AfterTest
//    public void tearDown() {
//        driver.quit();
//    }

    @Test
    public void succesLogin() {
        try {
        login_page.email.sendKeys(email_family);
        login_page.password.sendKeys(password_family);
        login_page.checkbox.click();
        login_page.btnLogIn.click();
        String actualTitle = driver.findElement(By.xpath("//a[contains(@href, 'signup')]")).getText();
        assertEquals(actualTitle, expectedTitle_family);
         }catch (Exception e){
            System.out.println("Проблема c" + e);
        }
    }

    @Test
    public void login_negative_email() {
        try {
            login_page.email.sendKeys("test@test.com");
            login_page.password.sendKeys(password_family);
            login_page.checkbox.click();
            login_page.btnLogIn.click();
            String currentUrl = driver.getCurrentUrl();
            Assert.assertEquals("https://staging.sittertree.com/login", currentUrl);
        }catch (Exception e){
            System.out.println("Проблема c" + e);
        }
    }

    @Test
    public void login_negative_password() {
        try {
            login_page.email.sendKeys(email_family);
            login_page.password.sendKeys("123");
            login_page.checkbox.click();
            login_page.btnLogIn.click();
            String currentUrl = driver.getCurrentUrl();
            Assert.assertEquals("https://staging.sittertree.com/login", currentUrl);
        }catch (Exception e){
            System.out.println("Проблема c" + e);
        }
    }

    @Test
    public void login_forgotPassword() {
        try {
            login_negative_email();
            login_page.btnForgotPassword.click();
            login_page.emailForgotPassword.sendKeys("family33@example.com");
            login_page.btnRContinue.click();
            String pageTextAfter = driver.findElement(By.tagName("body")).getText();
            Assert.assertTrue(pageTextAfter.contains("We have sent an email to"), "Текст не найден на странице");


        }catch (Exception e){
            System.out.println("Проблема c" + e);
        }
    }

}



