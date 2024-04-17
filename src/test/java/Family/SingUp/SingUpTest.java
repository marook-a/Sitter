package Family.SingUp;

import Family.SignIn.LoginPageTest;
import Family.SignIn.Login_page;
import com.sun.source.util.SourcePositions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static io.netty.util.internal.SocketUtils.accept;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static settings.FakerSettings.*;
import static settings.settings.*;

import java.time.Duration;

import org.testng.annotations.Test;


public class SingUpTest {
    public WebDriver driver;
    public SingUp sing_up;
    public Login_page login_page;
    public LoginPageTest loginPageTest;

    String FileJpeg_mother = "/Users/fusion_tech/Desktop/sitter/testImg/kartinki-schastlivoj-semi-30.jpeg";
    String FileJpeg_father = "/Img/father.jpg";
    String FileJpeg_child_f = "/Img/child.jpg";
    String FileJpeg_child_m = "/Users/fusion_tech/Desktop/sitter/testImg/Child-with-glasses-reading-a-book-1-1.webp";

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url_Staging);

        sing_up = new SingUp(driver);
        login_page = new Login_page(driver);
        loginPageTest = new LoginPageTest();
    }

    @AfterTest
    public void tearDown() {
//        driver.quit();
    }

    @Test
    public void singUp_start() {
        try {
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
        } catch (Exception e) {
            System.out.println("Проблема c" + e);
        }
    }

    @Test
    public void singUp_profile() {
        try {
//            login_page.email.sendKeys("dulcie.kutch@example.com");
//            login_page.password.sendKeys("qweqweqwe");
//            login_page.checkbox.click();
//            login_page.btnLogIn.click();
//            String actualTitle = driver.findElement(By.xpath("//a[contains(@href, 'signup')]")).getText();
//            assertEquals(actualTitle, expectedTitle_family);
            singUp_start();
            WebElement profile = new WebDriverWait(driver, Duration.ofSeconds(20))
                    .until(ExpectedConditions.elementToBeClickable(sing_up.profile));
            profile.click();
            sing_up.phone.sendKeys(faker_phone);
            sing_up.address.sendKeys(faker_address);
            sing_up.city.sendKeys("Atlanta");
            sing_up.state.sendKeys("GA");
            sing_up.zip.sendKeys("30318");
            sing_up.btnSave.click();
            new WebDriverWait(driver, Duration.ofSeconds(20))
                    .until(ExpectedConditions.alertIsPresent())
                    .accept();
            System.out.println("profile saved");
        } catch (Exception e) {
            System.out.println("Проблема c" + e);
        }
    }


    @Test
    public void singUp_family() {
        try {
//            login_page.email.sendKeys("isaiah.cummerata@example.com");
//            login_page.password.sendKeys("qweqweqwe");
//            login_page.checkbox.click();
//            login_page.btnLogIn.click();
//            String actualTitle = driver.findElement(By.xpath("//a[contains(@href, 'signup')]")).getText();
//            assertEquals(actualTitle, expectedTitle_family);
            singUp_start();
            singUp_profile();
            sing_up.tabMembers.click();
            //       sing_up.uploadFile.sendKeys(FileJpeg_mother);
            driver.findElement(By.xpath("//input[@type='file']")).sendKeys(FileJpeg_mother);
            sing_up.dropDown_members.click();
            sing_up.dropDown_adult.click();
            sing_up.firstName.sendKeys("Elizabeth");
            sing_up.lastName.sendKeys("Anderson");
            sing_up.contact_phone.sendKeys(faker_phone);
            sing_up.primaryContact.click();
            sing_up.btnSaveMember.click();
            new WebDriverWait(driver, Duration.ofSeconds(20))
                    .until(ExpectedConditions.alertIsPresent())
                    .accept();
            System.out.println("Сохранил");
            sing_up.FalseClick.click();
            System.out.println("Кликнулся");
            sing_up.tabPreferences.click();
            sing_up.btnSaveMember.click();
            sing_up.tabMembers.click();
            sing_up.btnSaveMember.click();
            Thread.sleep(2000);
            WebElement btnAddMember = new WebDriverWait(driver, Duration.ofSeconds(20))
                    .until(ExpectedConditions.elementToBeClickable(sing_up.btnAddMember));
            sing_up.btnAddMember.click();
            sing_up.tabMembers.click();
            btnAddMember.click();
            //       sing_up.uploadFile.sendKeys(FileJpeg_father);
            driver.findElement(By.xpath("//input[@type='file']")).sendKeys(FileJpeg_father);
            sing_up.dropDown_members.click();
            sing_up.dropDown_adult.click();
            sing_up.firstName.sendKeys("Kevin");
            sing_up.lastName.sendKeys("Anderson");
            sing_up.contact_phone.sendKeys(faker_phone);
            sing_up.btnSaveMember.click();
            sing_up.btnAddMember.click();
//        sing_up.uploadFile.sendKeys(FileJpeg_child_f);
            driver.findElement(By.xpath("//input[@type='file']")).sendKeys(FileJpeg_child_f);
            sing_up.dropDown_members.click();
            sing_up.dropDown_child.click();
            sing_up.firstName.sendKeys("Mary");
            sing_up.gender.click();
//        sing_up.gender_male.click(); //если нужно создать мальчика
            sing_up.gender_female.click();
            sing_up.birthMonth.click();
            sing_up.birthMonth_march.click();
            sing_up.birthYear.click();
            sing_up.birthYear_2020.click();
            sing_up.specialNeeds.click();
            //         sing_up.specialNeeds_yes.click(); //если нужно создать с ограниченными возможностями
            sing_up.specialNeeds_no.click();
            sing_up.btnSaveMember.click();
            String actualTitle2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/h1")).getText();
            assertEquals(actualTitle2, expectedTitle_add);
        } catch (Exception e) {
            System.out.println("Проблема с " + e);
        }
    }


    @Test
    public void singUp_negative_password() {
        sing_up.SignUpButton.click();
        sing_up.btnParent.click();
        sing_up.email.sendKeys(generateRandomEmail());
        sing_up.password.sendKeys("123");
        sing_up.selectArea.click();
        sing_up.selectCity.click();
        sing_up.selectAboutUs.click();
        sing_up.selectDropDown.click();
        sing_up.checkbox.click();
        sing_up.btnSingUp.click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://staging.sittertree.com/family/signup", currentUrl);
    }

    @Test
    public void singUp_negative_email() {
        sing_up.SignUpButton.click();
        sing_up.btnParent.click();
        sing_up.email.sendKeys("test.com");
        sing_up.password.sendKeys("qweqweqwe");
        sing_up.selectArea.click();
        sing_up.selectCity.click();
        sing_up.selectAboutUs.click();
        sing_up.selectDropDown.click();
        sing_up.checkbox.click();
        sing_up.btnSingUp.click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://staging.sittertree.com/family/signup", currentUrl);
    }

    @Test
    public void singUp_negative_doubleUser() {
        sing_up.SignUpButton.click();
        sing_up.btnParent.click();
        sing_up.email.sendKeys("family");
        sing_up.password.sendKeys("family");
        sing_up.selectArea.click();
        sing_up.selectCity.click();
        sing_up.selectAboutUs.click();
        sing_up.selectDropDown.click();
        sing_up.checkbox.click();
        sing_up.btnSingUp.click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://staging.sittertree.com/family/signup", currentUrl);
    }

    @Test
    public void singUp_negative_notCheckbox() {
        sing_up.SignUpButton.click();
        sing_up.btnParent.click();
        sing_up.email.sendKeys(generateRandomEmail());
        sing_up.password.sendKeys("qweqweqwe");
        sing_up.selectArea.click();
        sing_up.selectCity.click();
        sing_up.selectAboutUs.click();
        sing_up.selectDropDown.click();
        sing_up.btnSingUp.click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://staging.sittertree.com/family/signup", currentUrl);
    }

    @Test
    public void singUp_negative_notMetroArea() {
        sing_up.SignUpButton.click();
        sing_up.btnParent.click();
        sing_up.email.sendKeys(generateRandomEmail());
        sing_up.password.sendKeys("qweqweqwe");
        sing_up.selectAboutUs.click();
        sing_up.selectDropDown.click();
        sing_up.checkbox.click();
        sing_up.btnSingUp.click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://staging.sittertree.com/family/signup", currentUrl);
    }

    @Test
    public void singUp_negative_notAboutUs() {
        sing_up.SignUpButton.click();
        sing_up.btnParent.click();
        sing_up.email.sendKeys(generateRandomEmail());
        sing_up.password.sendKeys("qweqweqwe");
        sing_up.selectArea.click();
        sing_up.selectCity.click();
        sing_up.checkbox.click();
        sing_up.btnSingUp.click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://staging.sittertree.com/family/signup", currentUrl);
    }
}
