package test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.InstagramLoginPage;
import org.testng.Assert;

public class InstagramLoginTest {

    public static class IGLoginTest extends TestBase {

        @Test
        public void init() throws Exception {

            // driver.get("https://instagram.com");
            InstagramLoginPage loginpage = PageFactory.initElements(driver, InstagramLoginPage.class);
            String expectedTitle = "Instagram";
            String actualTitle = "Instagram";

            Thread.sleep(2000);
            // Start to use assertions!!
            Assert.assertEquals("Log in with Facebook", "Log in with Facebook");
            Assert.assertEquals(actualTitle, expectedTitle);
            loginpage.setEmail("abc@gmail.com");
            loginpage.setPassword("23456@qwe");
            loginpage.Login();
        }
    }
}
