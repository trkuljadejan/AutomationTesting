package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage{
    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    By slideMenuButtonBy = By.id("react-burger-menu-btn");
    By logoutButtonBy = By.id("logout_sidebar_link");
    By loginButtonBy = By.id("login-button");

    public LogoutPage logout (){
        click(slideMenuButtonBy);
        click(logoutButtonBy);
        return this;
    }
    public LogoutPage verifyLogout (String expectedText){
        String login =readText2(loginButtonBy);
        assertStringEquals(login, expectedText);
        return this;
    }
}
