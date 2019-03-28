package StepDefinitions;

import Pages.*;
import TestRunners.TestDefaultValues;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class FacebookStepDefinitions {
    private String email = TestDefaultValues.getUser();
    private String password = TestDefaultValues.getPassword();
    private WebDriver driver = MyStepdefsTest.getDriver();
    private FacebookLoginPage facebookLoginPage;
    private FacebookWelcomePage facebookWelcomePage;
    private PhpTravelLandingPage phptravelLandingPage;
    private HotelsHomePage hotelsHomePage;
    private FlightsHomePage flightsHomePage;

    @When("^I successfully login to Facebook with email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_successfully_login_to_Facebook_with_email_and_password(String email, String password) throws Throwable {
        facebookLoginPage = new FacebookLoginPage(driver);
        facebookWelcomePage = facebookLoginPage.successfulLogin(email, password);

    }
    @When("^I access the phptravels page")
    public void i_access_the_phptravels_page() throws Throwable {
        phptravelLandingPage = new PhpTravelLandingPage(driver);
        hotelsHomePage = phptravelLandingPage.bookHotel();
    }
    @When("^ $")
    public void i_successfully_login_to_Facebook_with_default_credentials() throws Throwable {
        facebookLoginPage = new FacebookLoginPage(driver);
        facebookWelcomePage = facebookLoginPage.successfulLogin(email, password);
    }
    @Then("^the Facebook Welcome Page is successfully displayed$")
    public void validateFacebookWelcomePage() throws Throwable {
        facebookWelcomePage.validateFacebookWelcomePage();
    }
    @Then("^book hotels")
    public void validateHotelsLandingPage() throws Throwable {
        hotelsHomePage.validateHotelsLandingPage();
    }
    @And("^book flights")
    public void validateFlightsLandingPage() throws Throwable {
        phptravelLandingPage = new PhpTravelLandingPage(driver);
        flightsHomePage = phptravelLandingPage.bookFlights();
        flightsHomePage.validateFlightsLandingPage();
    }
}
