package Stepdefinition;

import Config.ConfigReader;
import Page.AddNewCustomer;
import Page.HomePage;
import Page.LoginPage;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class Loginstepdefinition {

    DriverFactory df;
    LoginPage lp;
    HomePage hp;
    ConfigReader config;
    AddNewCustomer anc;
    WebDriver driver;

    @Given("Launch chrome browser and navigate to demo guru url")
    public void launch_chrome_browser_and_navigate_to_demo_guru_url() {
        config = new ConfigReader();
        df = new DriverFactory();
        driver = df.getDriver(config.getProperies("browser"));
        driver.get(config.getProperies("url"));
    }
    @When("Enter the userId and password")
    public void enter_the_user_id_and_password() {
        lp = new LoginPage(driver);
        lp.EnteruserId_txtbox(config.getProperies("userid"));
        lp.Enterpassword_txtbox(config.getProperies("password"));
    }
    @Then("Click on Login button")
    public void click_on_login_button() {
        lp.Clicklogin_btn();
    }

    @Then("Verify that user is logged in successfully")
    public void verify_that_user_is_logged_in_successfully() {
        hp = new HomePage(driver);
        hp.verifyuserinHomepage();
    }

}
