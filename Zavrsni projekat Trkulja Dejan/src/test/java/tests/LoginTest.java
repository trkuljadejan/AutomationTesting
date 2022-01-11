package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.PropertyManager;

public class LoginTest extends BaseTest{
    public HomePage homePage;
    public LoginPage loginPage;

    @Test
    public void login (){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(PropertyManager.getInstance().getUsername(), PropertyManager.getInstance().getPassword());

        try {
            homePage.verifyLogin("LOGOUT");
            System.out.println("User is successfully logged in.");
        } catch (Exception e){
            Assert.fail("User is not logged in.");
        }
    }
}
