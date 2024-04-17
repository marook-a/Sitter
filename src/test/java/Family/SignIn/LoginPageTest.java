package Family.SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void succesLogin() {
        try {
        login_page.email.sendKeys("isaiah.cummerata@example.com");
        login_page.password.sendKeys("qweqweqwe");
        login_page.checkbox.click();
        login_page.btnLogIn.click();
        String actualTitle = driver.findElement(By.xpath("//a[contains(@href, 'signup')]")).getText();
        assertEquals(actualTitle, expectedTitle_family);
    }catch (Exception e){
            System.out.println("Проблема c" + e);
        }
    }


   // @Test
 //   public void login_negative() {
  //      login_page.logInButton.click();

    }


