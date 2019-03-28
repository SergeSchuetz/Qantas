package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsHomePage extends BasicActions {

    @FindBy (id = "citiesInput")
    private WebElement citiesInput;
    @FindBy (xpath = "//*[@id=\"select2-drop\"]/div/input")
    private WebElement FlightFrom;
    @FindBy (name = "checkout")
    private WebElement checkout;
    @FindBy (xpath = "//*[@id=\"select2-drop\"]/div/input")
    private WebElement submit;

    public FlightsHomePage(WebDriver driver) {
        super(driver);
    }

    public FlightsHomePage validateFlightsLandingPage() {
        // checkElementPresent(FlightFrom, "Flight from");
        //sendkeys (this.FlightFrom, "Sydney Kingsford Smith Arpt (Syd)", "Flight from");
        return this;
    }
}
