package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public ChromeOptions chromeOptions;
    public FirefoxOptions firefoxOptions;

    @Before

    public void setup (){

        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    //    WebDriverManager.firefoxdriver().setup();
    //    firefoxOptions = new FirefoxOptions();
    //    driver = new FirefoxDriver(firefoxOptions);
    //    driver.manage().window().maximize();

    }

    @After

    public void  closeBrowser (){
        driver.quit();
    }
}
