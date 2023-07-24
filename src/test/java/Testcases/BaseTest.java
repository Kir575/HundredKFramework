package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.ConnectionType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.time.Duration;
import java.util.Optional;


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
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));


        //DevTools devTools = ((ChromeDriver) driver).getDevTools();
        //devTools.createSession();
       // devTools.send(Network.enable(Optional.of(1000000), Optional.empty(), Optional.empty()));
       // devTools.send(Network.emulateNetworkConditions(false, 1000, 10000, 10000, Optional.of(ConnectionType.CELLULAR3G)));

    }

    @AfterMethod
    public void tearDown(){
        //driver.quit();

    }

}