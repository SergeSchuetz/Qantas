package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhpTravelLandingPage extends BasicActions {

    @FindBy (className = "btn.btn-primary.btn-block")
    private WebElement ExpediaDemoButton;
    @FindBy (className = "popover-body-message")
    private WebElement PopoverMessage;
    @FindBy (id = "onesignal-popover-cancel-button")
    private WebElement PopoverCancelButton;
    @FindBy (className = "mc-closeModal")
    private WebElement SignupForm;

    public PhpTravelLandingPage(WebDriver driver) {
        super(driver);
    }

    public HotelsHomePage bookHotel () {
        // Cancel the Popup messages
        checkElementPresent(PopoverMessage, "Popup");
        click(PopoverCancelButton, "PopupCancel");
        // Close the Signup Form
        checkElementPresent(SignupForm, "SignupForm");
        click(SignupForm, "Close Signup Form");
        // Maximise the window
        driver.manage().window().maximize();
        // Navigate to the Expedia page to book Hotels
        driver.get("http://www.phptravels.net/public/expedia/");
        return new HotelsHomePage(getDriver());
    }
    public FlightsHomePage bookFlights () {

        driver.get("http://www.phptravels.net/public/amadeus/");
        return new FlightsHomePage(getDriver());

    }

}
