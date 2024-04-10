package Badges_Sitter;

import com.github.javafaker.Faker;
import com.github.javafaker.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;

public class BadgesPage {

    public BadgesPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@href, 'badges')]")
    public WebElement btnBadges;

    @FindBy(xpath = "//a[contains(@href, 'vaccine')]")
    public WebElement uploadDoc;

    @FindBy(xpath = "//*[@id=\"file_upload\"]")
    public WebElement fileUpload;
    @FindBy(xpath = "//*[@id=\"sitter_profile\"]/div[1]/div[2]/div[1]/div/a")
    public WebElement name_file;

    @FindBy(xpath = "/html/body/div[2]/section/div[2]/div/div/form/div[2]/button")
    public WebElement btnSave;


}
