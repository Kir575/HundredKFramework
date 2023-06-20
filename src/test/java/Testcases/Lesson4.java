package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Lesson4 {

    @Test
    public void OpenWebPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/kirylmarkau/Desktop/HundredKProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");

    }

    @Test
    public void OpenSignInPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kirylmarkau/Desktop/HundredKProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");

        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();

    }

    @Test
    public void EmailPassLoginFieldsValidation() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kirylmarkau/Desktop/HundredKProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");

        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();

        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//input[@id='password']")).isDisplayed());
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed());

    }

    @Test
    public void TryToLoginUsingInvalidIDandPass() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kirylmarkau/Desktop/HundredKProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");

        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Test
    public void InvalidEmailandPasswordErrorMessageValidation() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kirylmarkau/Desktop/HundredKProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");

        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//div[@class='test-login-errors']")).isDisplayed());

    }

    @Test
    public void RememberMeCheckboxValidation() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kirylmarkau/Desktop/HundredKProject/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/");

        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='auth-page-remember-me']")).isSelected());

    }
}

