package Family.SingUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingUp {

    public SingUp(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = "//a[@href='/family/signup']")
        public WebElement btnParent;

        @FindBy (xpath = "//input[@name='email']")
        public WebElement email;

        @FindBy (xpath = "//input[@type='password']")
        public WebElement password;

        @FindBy (xpath = "//*[@id='react-select-2-placeholder']")
        public WebElement selectArea;

        @FindBy (xpath = "//*[@id='react-select-3-placeholder']")
        public WebElement selectCity;

        @FindBy(xpath = "//div[contains(@class, 'css-b62m3t-container')][.//*[@id='aria-context']]")
        public WebElement selectAboutUs;

        @FindBy (xpath = "//html/body/div[2]/div/div/form/div[4]/div/div/div[2]/span")
        public WebElement selectDropDown;

        @FindBy (xpath = "//input[@type='checkbox']")
        public WebElement checkbox;

        @FindBy (xpath = "//button[@type='submit']")
        public WebElement btnSingUp;

        @FindBy (xpath = "//img[contains(@src, 'profile')]")
        public WebElement profile;

        @FindBy (xpath = "//*[@id='family.home_phone']")
        public WebElement phone;

        @FindBy (xpath = "//*[@id='family.address.address']")
        public WebElement address;

        @FindBy (xpath = "//*[@id='family.address.city']")
        public WebElement city;

        @FindBy (xpath = "//*[@id='family.address.state']")
        public WebElement state;

        @FindBy (xpath = "//*[@id='family.address.zip']")
        public WebElement zip;

        @FindBy (xpath = "/html/body/div[2]/section/div[2]/div/div[2]/form/div[2]/button")
        public WebElement btnSave;



}
