package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginPage extends BasicActions {

    @FindBy (name = "email")
    private WebElement email;
    @FindBy (name = "pass")
    private WebElement password;
    @FindBy (xpath = "//input[@data-testid='royal_login_button']")
    private WebElement loginButton;

    public FacebookLoginPage(WebDriver driver) {
        super(driver);
    }

    public FacebookWelcomePage successfulLogin (String email, String password) {
        clear(this.email, "email");
        sendkeys (this.email, email, "email");
        clear(this.password, "password");
        sendkeys (this.password, password, "password");
        click (loginButton, "LoginButton");
        return new FacebookWelcomePage(getDriver());
    }

}
