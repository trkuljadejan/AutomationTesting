package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    By errorNotificationBy = By.xpath("//div[@class='error-message-container error']/h3");
    By slideMenuButtonBy = By.id("react-burger-menu-btn");
    By logoutButtonBy = By.id("logout_sidebar_link");

    public HomePage verifyFailedLogin (String expectedText){
        String alert = readText(errorNotificationBy);
        assertStringEquals(alert,expectedText);
        return this;
    }
    public HomePage verifyLogin (String expectedText){
        click(slideMenuButtonBy);
        String text = readText(logoutButtonBy);
        assertStringEquals(text, expectedText);
        return this;
    }
}
