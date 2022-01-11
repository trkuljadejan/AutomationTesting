package pages;

import faker.DataCreation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingPage extends BasePage{
    public ShoppingPage(WebDriver driver) {
        super(driver);
    }

    By addToCartButton1By = By.id("add-to-cart-sauce-labs-backpack");
    By cartIconBy = By.className("shopping_cart_link");
    By removeButton1By = By.id("remove-sauce-labs-backpack");
    By checkoutButtonBy = By.id("checkout");
    By firstNameFiledBy = By.id("first-name");
    By lastNameFiledBy = By.id("last-name");
    By zipFiledBy = By.id("postal-code");
    By continueBy = By.id("continue");
    By summaryTotalBy = By.className("summary_total_label");
    By finishByttonBy = By.id("finish");
    By completeHeaderBy = By.className("complete-header");
    By itemNameInCartBy = By.className("inventory_item_name");

    public ShoppingPage removeItemFromCart (){
        click(addToCartButton1By);
        click(cartIconBy);
        click(removeButton1By);
        click(checkoutButtonBy);
        writeText(firstNameFiledBy, DataCreation.fakeFirstName());
        writeText(lastNameFiledBy, DataCreation.fakeLastName());
        writeText(zipFiledBy, DataCreation.fakeZip());
        click(continueBy);
        return this;
    }
    public ShoppingPage verifyRemoveItem (String expectedValue){
        String total = readText(summaryTotalBy);
        assertStringEquals(total, expectedValue);
        return this;
    }
    public ShoppingPage navigateToFinish (){
        click(addToCartButton1By);
        click(cartIconBy);
        click(checkoutButtonBy);
        writeText(firstNameFiledBy, DataCreation.fakeFirstName());
        writeText(lastNameFiledBy, DataCreation.fakeLastName());
        writeText(zipFiledBy, DataCreation.fakeZip());
        click(continueBy);
        click(finishByttonBy);
        return this;
    }
    public ShoppingPage verifyPurchase (String expectedText){
        String text = readText(completeHeaderBy);
        assertStringEquals(text, expectedText);
        return this;
    }
    public ShoppingPage navigateToCart (){
        click(addToCartButton1By);
        click(cartIconBy);
        return this;
    }
    public ShoppingPage verifyItemName (String itemName){
        String item = readText(itemNameInCartBy);
        assertStringEquals(item, itemName);
        return this;
    }
}
