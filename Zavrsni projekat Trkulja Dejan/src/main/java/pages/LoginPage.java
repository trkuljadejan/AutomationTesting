package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    String baseURL = PropertyManager.getInstance().getUrl();

    By usernameFieldBy = By.id("user-name");
    By passwordFieldBy = By.id("password");
    By loginButtonBy = By.id("login-button");

    public LoginPage basePage (){
        driver.get(baseURL);
        return this;
    }
    public LoginPage login (String username, String password){
        writeText(usernameFieldBy, username);
        writeText(passwordFieldBy, password);
        click(loginButtonBy);
        return this;
    }
}
