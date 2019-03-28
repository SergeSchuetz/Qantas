package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsHomePage extends BasicActions {

    @FindBy (id = "citiesInput")
    private WebElement citiesInput;
    @FindBy (name = "checkin")
    private WebElement checkin;
    @FindBy (name = "checkout")
    private WebElement checkout;
    @FindBy (xpath = "//*[@id=\"properties\"]/form/div[5]/button")
    private WebElement submit;

    public HotelsHomePage(WebDriver driver) {
        super(driver);
    }

    public HotelsHomePage validateHotelsLandingPage() {
        checkElementPresent(citiesInput, "citiesInput");
        sendkeys (this.citiesInput, "Barcelona, Spain", "citiesInput");
        checkElementPresent(checkin, "checkin");
        sendkeys (this.checkin, "31/03/2019", "checkin");
        checkElementPresent(checkout, "checkout");
        sendkeys (this.checkout, "15/04/2019", "checkout");
        checkElementPresent(submit, "submit");
        click(submit, "submit");
        return this;
    }

}
