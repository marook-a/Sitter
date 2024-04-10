package Reviews;

import Sitter.login_page.Login_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;
import static settings.settings_sitter.*;

public class ReviewsPageTest {

    private WebDriver driver;
    public ReviewsPage reviews_page;
    public Login_page login_page;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);

        login_page = new Login_page(driver);
        reviews_page = new ReviewsPage(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test

    public void reviews() {
        try {
            login_page.logInButton.click();
            login_page.email.sendKeys(email);
            login_page.password.sendKeys(password);
            login_page.checkbox.click();
            login_page.btnLogIn.click();
            reviews_page.btnReviews.click();
            reviews_page.btnReviewJob.click();
            reviews_page.btnAddReview.click();
            reviews_page.txtReview.sendKeys("Good family");
            reviews_page.btnSubmitFeedback.click();
            String pageTextAfter = driver.findElement(By.tagName("body")).getText();
            Assert.assertTrue(pageTextAfter.contains("Thanks for your review."), "Текст не найден на странице");

        } catch (Exception e) {
            System.out.println(" No reviews");
        }
    }

}
