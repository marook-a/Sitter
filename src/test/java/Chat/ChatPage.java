package Chat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPage {

    public ChatPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='https://staging.sittertree.com/chat']")
        public WebElement btnChat;

    @FindBy(xpath = "//*[@id=\"st-chat-ui\"]/div/div/div[1]/div[2]/div/ul/li[1]/div/div/div[2]")
    public WebElement lastMessage;

    @FindBy(xpath = "//div[@contenteditable='true']")
    public WebElement message;

    @FindBy(xpath = "//button[@class='cs-button cs-button--send']")
    public WebElement btnSend;
}
