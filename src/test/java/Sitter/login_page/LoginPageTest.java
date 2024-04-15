package Sitter.login_page;

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
    private WebDriver driver;
    private Login_page login_page;

    @BeforeTest

    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url_dev);

        login_page = new Login_page(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void login() {
        login_page.logInButton.click();
        login_page.email.sendKeys(email_sitter);
        login_page.password.sendKeys(password_sitter);
        login_page.checkbox.click();
        login_page.btnLogIn.click();
        String actualTitle = driver.findElement(By.xpath("/html/body/div[2]/section/div[1]/div/h1")).getText();
        assertEquals(actualTitle, expectedTitle_sitter);

    }

}
