package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.ShoppingPage;

public class ShoppingTest extends BaseTestWithLogin {
    public ShoppingPage shoppingPage;

    @Test
    public void shopping (){
        shoppingPage = new ShoppingPage(driver);

        shoppingPage.navigateToFinish();

        try {
            shoppingPage.verifyPurchase("THANK YOU FOR YOUR ORDER");
            System.out.println("Purchase is succesffully completed.");
        } catch (Exception e){
            Assert.fail("Purchaces is failed.");
        }
    }
}
