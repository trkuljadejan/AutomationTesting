package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.ShoppingPage;

public class RemoveItemFromCartTest extends BaseTestWithLogin{
    public ShoppingPage shoppingPage;

    @Test
    public void removeItemFromCart (){
        shoppingPage = new ShoppingPage(driver);

        shoppingPage.removeItemFromCart();

        try {
            shoppingPage.verifyRemoveItem("Total: $0.00");
            System.out.println("Item is succesffuly removed.");
        } catch (Exception e){
            Assert.fail("Item is not removed.");
        }
    }
}
