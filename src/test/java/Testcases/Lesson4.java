package Testcases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

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

        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath(inputId)).isDisplayed());
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath(inputPass)).isDisplayed());
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath(clickSubmit_Btn)).isDisplayed());
    }

    @Test
    public void TryToLoginUsingInvalidIDandPass() throws InterruptedException {

        openSignInPage();

        //driver.findElement(By.xpath(inputId)).sendKeys("email@gmail.com");
        driver.findElement(By.xpath(inputId)).sendKeys(email);
        driver.findElement(By.xpath(inputPass)).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.xpath(clickSubmit_Btn)).click();
    }

    @Test
    public void InvalidEmailandPasswordErrorMessageValidation() throws InterruptedException {

        openSignInPage();

        driver.findElement(By.xpath(inputId)).sendKeys(email);
        driver.findElement(By.xpath(inputPass)).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.xpath(clickSubmit_Btn)).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath(loginErrors)).isDisplayed());
    }

    @Test
    public void RememberMeCheckboxValidation() throws InterruptedException {

        openSignInPage();

        System.out.println(driver.findElement(By.xpath(inputIDselectedByDefault)).isSelected());
    }


}

