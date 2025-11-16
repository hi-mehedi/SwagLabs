package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.YourCartPage;

public class SwagLabsTest extends BaseTest {
        String userName = "standard_user";
        String userPass = "secret_sauce";

        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        YourCartPage yourCartPage = new YourCartPage();

        @Test
        public void Test1() {
            Assert.assertTrue(loginPage.isLoginPageDisplayed(), "Login Page is Displayed");
            loginPage.setUsername(userName);
            loginPage.setUserPass(userPass);
            loginPage.clickLoginBtn();
            Assert.assertTrue(homePage.isHomePageDisplayed(), "HomePage is not Displayed");
            homePage.getText();
            homePage.clickAddToCartBtn();
            homePage.clickShoppingChart();
            Assert.assertTrue(yourCartPage.isYourCartPageDisplayed(),"Your Cart button not displayed");
            Assert.assertEquals(homePage.getText(), yourCartPage.getTextCart(), "Product name is no equal");
            yourCartPage.clickMenuBtn();
            yourCartPage.waitForLogOutBtn();
            yourCartPage.clickLogOutBtn();
        }
    }


