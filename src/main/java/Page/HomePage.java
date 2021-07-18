package Page;

import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    AddNewCustomer anc;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    // Elements
    By New_Customer_link = By.linkText("New Customer");
    By Edit_Customer_link = By.linkText("Edit Customer");

    // Methods for Elements

    public AddNewCustomer ClickNew_Customer_link(){
        driver.findElement(New_Customer_link).click();
        anc = new AddNewCustomer();
        return anc;

    }
    public void clickEdit_Customer_link(){
        driver.findElement(Edit_Customer_link).click();

    }

    public void verifyuserinHomepage(){
        String title = driver.getTitle();
        //Assert.assertArrayEquals(title, "Guru99 Bank Manager HomePage");
        Assert.assertEquals("Guru99 Bank Manager HomePage", title);
    }
}
