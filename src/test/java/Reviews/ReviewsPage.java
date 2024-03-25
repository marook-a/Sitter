package Reviews;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewsPage {
    public ReviewsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@href, 'by')]")
    public WebElement btnReviews;

    @FindBy(xpath = "/html/body/div[2]/section/div[2]/div/div[2]/div[1]/div/div[3]/div/div/a")
    public WebElement btnReviewJob;

    @FindBy(xpath = "//*[@id='rateit-range-2']")
    public WebElement btnAddReview;

    @FindBy(xpath = "//textarea[contains(@style, 'height:')]")
    public WebElement txtReview;

    @FindBy(xpath = "/html/body/div[2]/section/div[1]/div/div/div/form/div[4]/button")
    public WebElement btnSubmitFeedback;
}
