package Testcases;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DriverInteractions extends  BaseTest {
    @Test
    public void Test1() {

        driver.get("http://amazon.com");
        driver.navigate().refresh();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        String urlToVerify = driver.getCurrentUrl();
        System.out.println(urlToVerify);
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

    }

    @Test
    public void Test2() {
        driver.get("http://amazon.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        List<String> tabHandler = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabHandler.size());
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.TAB);
        tabHandler = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabHandler.size());
        driver.switchTo().window(tabHandler.get(0));
        driver.switchTo().window(tabHandler.get(4));
        driver.navigate().to("https://test.my-fork.com");
    }

    @Test
    public void Test2A() {
        driver.get("http://amazon.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("http://bestbuy.com");
        homePage.WindowHandling(0);
    }

    @Test
    public void Test3() {
        driver.get("http://amazon.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)","");
        js.executeScript("window.scrollBy(0,-2500)","");
    }

    @Test
    public void Test3A() {
        driver.get("http://amazon.com");
        homePage.ScrollingThePage(3000);
        homePage.ScrollingThePage(-1000);
    }
}
