package test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.InstagramLoginPage;

public class InstagramLoginTest {

    public static class IGLoginTest extends TestBase {

        @Test
        public void init() throws Exception {

            // driver.get("https://instagram.com");
            InstagramLoginPage loginpage = PageFactory.initElements(driver, InstagramLoginPage.class);

            Thread.sleep(2000);
            loginpage.setEmail("abc@gmail.com");
            loginpage.setPassword("23456@qwe");
            loginpage.Login();
        }
    }
}
