package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class BaseMain {

    public ChromeDriver driver;

    public BaseMain(ChromeDriver driver){
        this.driver = driver;
        driver.manage().window().maximize();

    }
    public void WindowHandling(int tab){
        List<String> tabHandler = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabHandler.size());
        driver.switchTo().window(tabHandler.get(tab));
    }

    public void ScrollingThePage(int pixels){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+pixels+")", "");
    }





}
