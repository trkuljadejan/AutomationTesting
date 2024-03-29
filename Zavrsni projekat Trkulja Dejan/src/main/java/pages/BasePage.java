package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }
    public void waitWisibility (By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
    public void click(By elementBy){
        waitWisibility(elementBy);
        driver.findElement(elementBy).click();
    }
    public void writeText (By elementBy, String text){
        waitWisibility(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }
    public String readText (By elementBy){
        waitWisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }
    public String readText2 (By elementBy){
        waitWisibility(elementBy);
        return driver.findElement(elementBy).getAttribute("value");
    }
    public void assertStringEquals (String string, String expectedText){
        Assert.assertEquals(string, expectedText);
    }
}
