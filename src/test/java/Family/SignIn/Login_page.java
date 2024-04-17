package Family.SignIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
    public Login_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[class*='link']")
    public WebElement logInButton;

    @FindBy(css = "input[id='email']")
    public WebElement email;

    @FindBy(css = "input[id='password']")
    public WebElement password;

    @FindBy(css = "label[for='stay_signed_in']")
    public WebElement checkbox;

    @FindBy(css = "button[class='expand']")
    public WebElement btnLogIn;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/ul[1]/li/a")
    public WebElement btnForgotPassword;

    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement emailForgotPassword;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/div/form/div[2]/button")
    public WebElement btnRContinue;

}


