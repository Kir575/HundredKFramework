package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FirstTestCase {

@Test
    public void startBrowser(){
    System.setProperty("webdriver.chrome.driver","/Users/kirylmarkau/Desktop/HundredKProject/src/test/resources/chromedriver");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    ChromeDriver driver = new ChromeDriver(options);

    driver.get("https://tides4fishing.com/");
    }
}
