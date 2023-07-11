package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.HomePage;
import pageobjects.LoginPage;


public class BaseTest {

    public ChromeDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/kirylmarkau/Desktop/HundredKProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

}

    @AfterMethod
    public void tearDown(){
        driver.quit();

    }

}