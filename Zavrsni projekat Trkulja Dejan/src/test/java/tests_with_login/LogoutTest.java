package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.LogoutPage;

public class LogoutTest extends BaseTestWithLogin{
    public LogoutPage logoutPage;

    @Test
    public void logout(){
        logoutPage = new LogoutPage(driver);

        logoutPage.logout();

        try {
            logoutPage.verifyLogout("Login");
            System.out.println("User is successfully logged out");
        } catch (Exception e){
            Assert.fail("User is not logged out");
        }
    }
}
