package Testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class Lesson4 extends BaseTest{

    public String myForkURL = "https://test.my-fork.com/";
    private String inputId = "//input[@id='email']";
    private String inputPass = "//input[@id='password']";
    private String clickSubmit_Btn = "//button[@type='submit']";
    private String loginErrors = "//div[@class='test-login-errors']";
    private String inputIDselectedByDefault = "//input[@id='auth-page-remember-me']";
    private static final String email = "email@gmail.com";
    private static final String password = "password";

    public void openSignInPage() throws InterruptedException {
        driver.get(myForkURL);
        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
    }

    @Test
    public void EmailPassLoginFieldsValidation() throws InterruptedException {

        openSignInPage();

        //Thread.sleep(2000);
        WebDriverWait waitToInputId = new WebDriverWait(driver,Duration.ofSeconds(20));
        waitToInputId.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputId)));
        System.out.println(driver.findElement(By.xpath(inputId)).isDisplayed());

        //Thread.sleep(2000);
        WebDriverWait waitToInputPass = new WebDriverWait(driver,Duration.ofSeconds(20));
        waitToInputPass.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputId)));
        System.out.println(driver.findElement(By.xpath(inputPass)).isDisplayed());

        //Thread.sleep(2000);
        WebDriverWait waitToClickSubmitBtn = new WebDriverWait(driver,Duration.ofSeconds(20));
        waitToClickSubmitBtn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickSubmit_Btn)));
        System.out.println(driver.findElement(By.xpath(clickSubmit_Btn)).isDisplayed());
    }

    @Test
    public void TryToLoginUsingInvalidIDandPass() throws InterruptedException {

        openSignInPage();

        driver.findElement(By.xpath(inputId)).sendKeys(email);
        driver.findElement(By.xpath(inputPass)).sendKeys(password);
        //Thread.sleep(1000);

        WebDriverWait waitTryToLoginUsingInvalidIdAndPass = new WebDriverWait(driver,Duration.ofSeconds(20));
        waitTryToLoginUsingInvalidIdAndPass.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickSubmit_Btn)));
        driver.findElement(By.xpath(clickSubmit_Btn)).click();

    }

    @Test
    public void InvalidEmailandPasswordErrorMessageValidation() throws InterruptedException {

        openSignInPage();

        driver.findElement(By.xpath(inputId)).sendKeys(email);
        driver.findElement(By.xpath(inputPass)).sendKeys(password);
        //Thread.sleep(1000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebDriverWait waitToClickSubmitBtn = new WebDriverWait(driver,Duration.ofSeconds(20));
        waitToClickSubmitBtn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickSubmit_Btn)));
        driver.findElement(By.xpath(clickSubmit_Btn)).click();

        //Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        WebDriverWait waitLoginErrorsDisplayed = new WebDriverWait(driver,Duration.ofSeconds(20));
        waitLoginErrorsDisplayed.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickSubmit_Btn)));
        System.out.println(driver.findElement(By.xpath(loginErrors)).isDisplayed());
    }

    @Test
    public void RememberMeCheckboxValidation() throws InterruptedException {

        openSignInPage();

        System.out.println(driver.findElement(By.xpath(inputIDselectedByDefault)).isSelected());
    }

    @Test
    public void NewTabHandles() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        String myForkURL = "https://test.my-fork.com/";
        String singUp = "https://test.my-fork.com/register";
        driver.navigate().to(myForkURL);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(singUp);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }



}

