package Family.SingUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SingUp {

    public SingUp(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

        @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/ul[2]/li/a")
        public WebElement SignUpButton;
        @FindBy(xpath = "//a[@href='/family/signup']")
        public WebElement btnParent;

        @FindBy (xpath = "//input[@name='email']")
        public WebElement email;

        @FindBy (xpath = "//input[@type='password']")
        public WebElement password;

        @FindBy (xpath = "//*[@id='react-select-2-placeholder']")
        public WebElement selectArea;

        @FindBy (xpath = "//*[@id=\"portal-full-screen\"]/div/div/form/div[3]/div/div/div[1]/div/div/div")
        public WebElement selectCity;

        @FindBy(xpath = "//*[@id=\"react-select-3-placeholder\"]")
        public WebElement selectAboutUs;

        @FindBy (xpath = "//*[@id=\"portal-full-screen\"]/div/div/form/div[4]/div/div/div[1]/div/div/div")
        public WebElement selectDropDown;

        @FindBy (xpath = "//*[@id=\"portal-full-screen\"]/div/div/form/div[6]/div/label")
        public WebElement checkbox;

        @FindBy (xpath = "//button[@type='submit']")
        public WebElement btnSingUp;

         @FindBy (xpath = "/html/body/nav/div/div[1]/div[1]/div[1]/a/img")
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

        @FindBy (xpath = "//a[contains(@href, 'members')]")
        public WebElement tabMembers;

        @FindBy (xpath = "//label[@for='file_upload']")
        public WebElement uploadFile;

        @FindBy (xpath = "//select[@name='type']")
        public WebElement dropDown_members;

        @FindBy (xpath = "//*[@id=\"family-member-container\"]/div/form/div/div[2]/select/option[2]")
        public WebElement dropDown_adult;

        @FindBy (xpath = "//*[@id=\"family-member-container\"]/div/form/div/div[2]/select/option[3]")
        public WebElement dropDown_child;

        @FindBy (xpath = "//input[@name='first_name']")
        public WebElement firstName;

        @FindBy (xpath = "//input[@name='last_name']")
        public WebElement lastName;

        @FindBy (xpath = "//*[@id=\"family-member-container\"]/div/form/div/div[4]/div/select")
        public WebElement gender;

        @FindBy (xpath = "//*[@id=\"family-member-container\"]/div/form/div/div[4]/div/select/option[2]")
        public WebElement gender_male;

        @FindBy (xpath = "//*[@id=\"family-member-container\"]/div/form/div/div[4]/div/select/option[3]")
        public WebElement gender_female;

        @FindBy (xpath = "//*[@id=\"family-member-container\"]/div/form/div/div[5]/div/select")
        public WebElement birthMonth;

        @FindBy (xpath = "//*[@id=\"family-member-container\"]/div/form/div/div[5]/div/select/option[4]")
        public WebElement birthMonth_march;

        @FindBy (xpath = "//*[@id=\"family-member-container\"]/div/form/div/div[6]/div/select")
        public WebElement birthYear;

        @FindBy(xpath = "//*[@id=\"family-member-container\"]/div/form/div/div[6]/div/select/option[6]")
        public WebElement birthYear_2020;

        @FindBy (xpath = "//*[@id=\"family-member-container\"]/div/form/div/div[7]/div/select")
        public WebElement specialNeeds;

        @FindBy (xpath = "//*[@id=\"family-member-container\"]/div/form/div/div[7]/div/select/option[2]")
        public WebElement specialNeeds_yes;

        @FindBy (xpath = "//*[@id=\"family-member-container\"]/div/form/div/div[7]/div/select/option[3]")
        public WebElement specialNeeds_no;

        @FindBy (xpath = "//input[@name='guardian_mobile_phone']")
        public WebElement contact_phone;

        @FindBy (xpath = "//*[@id=\"is_primary_contact\"]")
        public WebElement primaryContact;

        @FindBy (xpath = "/html/body/div[2]/section/div[2]/div/div[3]/div/form/div/button")
        public WebElement btnSaveMember;

        @FindBy (xpath = "//*[@id=\"family-member-container\"]/div/div[1]/button")
        public WebElement btnAddMember;

        @FindBy (xpath = "//*[@id=\"family-member-container\"]/div/form/div/div[6]/label")
        public WebElement FalseClick;

        @FindBy (xpath = "//*[@id=\"content\"]/div[2]/div/div[1]/ul/li[3]/a")
        public WebElement tabPreferences;











}
