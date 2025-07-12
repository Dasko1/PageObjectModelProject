package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InstagramLoginPage {

    WebDriver driver;

    public InstagramLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Using FindBy for locating elements
    @FindBy(how = How.NAME, using = "username")
    WebElement emailTextBox;

    @FindBy(how = How.NAME, using = "password")
    WebElement passwordTextBox;

    @FindBy(how = How.XPATH, using = "//div/button[@type='submit']")
    WebElement nextButton;


    // Define all the user actions (Methods) that can be performed in the Instagram home page.

    // This method is to set Email in the email text box.
    public void setEmail(String strEmail) {
        emailTextBox.sendKeys(strEmail);
    }

    // This method is to set Password in the password text box
    public void setPassword(String strPassword) {
        passwordTextBox.sendKeys(strPassword);
    }
    // This method is to click on Next Button
    public void Login() {
        nextButton.click();
    }
}
