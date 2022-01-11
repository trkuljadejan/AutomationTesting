package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.PropertyManager;

public class FailedLoginTest extends BaseTest{
    public HomePage homePage;
    public LoginPage loginPage;


    @Test
    public void failedLoginWithEmptyUsername() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login("", PropertyManager.getInstance().getPassword());

        try {
            homePage.verifyFailedLogin("Epic sadface: Username is required");
            System.out.println("User is not logged in.");
        } catch (Exception e) {
            Assert.fail("User is logged in.");
        }
    }

    @Test
    public void failedLoginWithEmptyPassword(){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(PropertyManager.getInstance().getUsername(), "");

        try {
            homePage.verifyFailedLogin("Epic sadface: Password is required");
            System.out.println("User is not logged in.");
        } catch (Exception e){
            Assert.fail("User is logged in.");
        }
    }

    @Test
    public void failedLoginWithWrongCredentials(){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(PropertyManager.getInstance().getFakeUsername(), PropertyManager.getInstance().getFakePassword());

        try {
            homePage.verifyFailedLogin("Epic sadface: Username and password do not match any user in this service");
            System.out.println("User is not logged in.");
        } catch (Exception e){
            Assert.fail("User is logged in.");
        }
    }
}
