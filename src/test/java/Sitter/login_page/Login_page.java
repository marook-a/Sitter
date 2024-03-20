package Sitter.login_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

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

}


