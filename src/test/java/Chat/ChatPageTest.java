package Chat;

import Sitter.login_page.Login_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static settings.settings.*;

public class ChatPageTest {
    private WebDriver driver;
    private ChatPage chat_page;
    public Login_page login_page;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url_dev);

        login_page = new Login_page(driver);
        chat_page = new ChatPage(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void chat() {
        login_page.logInButton.click();
        login_page.email.sendKeys(email_sitter);
        login_page.password.sendKeys(password_sitter);
        login_page.checkbox.click();
        login_page.btnLogIn.click();
        chat_page.btnChat.click();
        WebElement Message = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(chat_page.lastMessage));
        chat_page.lastMessage.click();
        Assert.assertTrue(chat_page.btnChat.isDisplayed(), "Чат не открыт");
        chat_page.message.sendKeys(message);
        chat_page.btnSend.click();
    }


}
