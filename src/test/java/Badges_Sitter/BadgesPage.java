package Badges_Sitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BadgesPage {

    public BadgesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[contains(@href, 'badges')]")
    public WebElement btnBadges;

    @FindBy (xpath = "//a[contains(@href, 'vaccine')]")
    public WebElement uploadDoc;

    @FindBy (xpath = "//input[contains(@id, 'file_upload')]")
    public WebElement fileUpload;

    @FindBy (xpath = "/html/body/div[2]/section/div[2]/div/div/form/div[2]/button")
    public WebElement btnSave;


}
