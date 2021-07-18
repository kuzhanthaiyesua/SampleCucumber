package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    HomePage hp;
    WebDriverWait wait;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //WebElements
    By userId_txtbox = By.name("uid");
    By password_txtbox = By.name("password");
    By login_btn = By.name("btnLogin");
    By reset_txtbox = By.name("btnReset");


    //Methods for WebElements

    public void EnteruserId_txtbox(String userid){
        driver.findElement(userId_txtbox).clear();
        driver.findElement(userId_txtbox).sendKeys(userid);
    }

    public void Enterpassword_txtbox(String password){
        driver.findElement(password_txtbox).clear();
        driver.findElement(password_txtbox).sendKeys(password);
    }
    public HomePage Clicklogin_btn(){
        wait.until(ExpectedConditions.visibilityOf((WebElement) login_btn)).click();
       // driver.findElement(login_btn).click();
       // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        return hp;
    }


}
