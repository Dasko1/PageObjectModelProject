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
    WebElement usernameTextBox;

    @FindBy(how = How.NAME, using = "password")
    WebElement passwordTextBox;

    @FindBy(how = How.XPATH, using = "//div/button[@type='submit']")
    WebElement loginButton;


    // Define all the user actions (Methods) that can be performed in the Instagram login page.
    // This method is to set username in the username text box.
    public void setEmail(String strEmail) {
        usernameTextBox.sendKeys(strEmail);
    }

    // This method is to set Password in the password text box
    public void setPassword(String strPassword) {
        passwordTextBox.sendKeys(strPassword);
    }

    // This method is to click on Login Button
    public void Login() {
        loginButton.click();
    }
}
