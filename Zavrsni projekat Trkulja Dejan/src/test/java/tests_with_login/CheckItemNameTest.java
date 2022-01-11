package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.ShoppingPage;

public class CheckItemNameTest extends BaseTestWithLogin{
    public ShoppingPage shoppingPage;

    @Test
    public void checkItemName (){
        shoppingPage = new ShoppingPage(driver);

        shoppingPage.navigateToCart();

        try {
            shoppingPage.verifyItemName("Sauce Labs Backpack");
            System.out.println("Item name is correct.");
        } catch (Exception e){
            Assert.fail("Item name is not correct.");
        }
    }
}
