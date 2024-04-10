package Family.SingUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static settings.FakerSettings.generateRandomEmail;
import static settings.settings.*;

import java.time.Duration;

import org.testng.annotations.Test;


public class SingUpTest {
     public WebDriver driver;
     public SingUp sing_up;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url_dev);

        sing_up = new SingUp(driver);
    }

    @AfterTest
    public void tearDown() {
//        driver.quit();
    }

    @Test
    public void singUp_start() {
        sing_up.SignUpButton.click();
        sing_up.btnParent.click();
        sing_up.email.sendKeys(generateRandomEmail());
        sing_up.password.sendKeys(password_singUp);
        sing_up.selectArea.click();
        sing_up.selectCity.click();
        sing_up.selectAboutUs.click();
        sing_up.selectDropDown.click();
        sing_up.checkbox.click();
        sing_up.btnSingUp.click();
    }

    @Test
     public void singUp_profile() {
        singUp_start();

    }

    @Test
    public void singUp_family() {
        singUp_start();
    }

    @Test
    public void singUp_negative() {
        sing_up.btnParent.click();
        sing_up.email.sendKeys(generateRandomEmail());
        sing_up.password.sendKeys("123");
        sing_up.selectArea.click();
        sing_up.selectCity.click();
        sing_up.selectAboutUs.click();
        sing_up.selectDropDown.click();
        sing_up.checkbox.click();
        sing_up.btnSingUp.click();
    }

}
