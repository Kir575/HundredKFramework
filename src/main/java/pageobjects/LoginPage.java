package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LoginPage extends BaseMain {

        public LoginPage(ChromeDriver driver) {
            super(driver);
        }

        private String inputId = "//input[@id='email']";
        private String inputPass = "//input[@id='password']";
        private String clickSubmit_Btn = "//button[@type='submit']";
        private static final String email = "email@gmail.com";
        private static final String password = "password";
        private String loginErrors = "//div[@class='test-login-errors']";
        private String inputIDselectedByDefault = "//input[@id='auth-page-remember-me']";
        private String signUpButton = "//a[@href='https://test.my-fork.com/register']";

        boolean checkBox;


        public void EmailPassLoginFieldsValidation() throws InterruptedException {

//            Thread.sleep(2000);
//            System.out.println(driver.findElement(By.xpath(inputId)).isDisplayed());
//            Thread.sleep(2000);
//            System.out.println(driver.findElement(By.xpath(inputPass)).isDisplayed());
//            Thread.sleep(2000);
//            System.out.println(driver.findElement(By.xpath(clickSubmit_Btn)).isDisplayed());

            WebDriverWait waitToInputId = new WebDriverWait(driver, Duration.ofSeconds(20));
            waitToInputId.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputId)));
            System.out.println(driver.findElement(By.xpath(inputId)).isDisplayed());

            WebDriverWait waitToInputPass = new WebDriverWait(driver,Duration.ofSeconds(20));
            waitToInputPass.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputId)));
            System.out.println(driver.findElement(By.xpath(inputPass)).isDisplayed());

            WebDriverWait waitToClickSubmitBtn = new WebDriverWait(driver,Duration.ofSeconds(20));
            waitToClickSubmitBtn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickSubmit_Btn)));
            System.out.println(driver.findElement(By.xpath(clickSubmit_Btn)).isDisplayed());

        }

        public void fillUpCredentials() throws InterruptedException {

            driver.findElement(By.xpath(inputId)).sendKeys(email);
            driver.findElement(By.xpath(inputPass)).sendKeys(password);

        }

        public void submitButtonClickOnLoginPage() throws InterruptedException {
            WebDriverWait waitSubmitBtn = new WebDriverWait(driver,Duration.ofSeconds(5));
            waitSubmitBtn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickSubmit_Btn)));
            driver.findElement(By.xpath(clickSubmit_Btn)).click();
        }

        public void errorMessagePopUpValidation() throws InterruptedException {
            fillUpCredentials();
            submitButtonClickOnLoginPage();
            WebDriverWait waitErrorMessagePopUp = new WebDriverWait(driver,Duration.ofSeconds(15));
            waitErrorMessagePopUp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginErrors)));
            System.out.println(driver.findElement(By.xpath(loginErrors)).isDisplayed());
        }

        public void checkIfCheckboxIsSelected() throws InterruptedException {
            System.out.println(driver.findElement(By.xpath(inputIDselectedByDefault)).isSelected());

        }

        public void clickSignUpButton() throws InterruptedException {
            driver.findElement(By.xpath(signUpButton)).click();

        }

        public  void jobTitleDropDownArray() throws InterruptedException {
            WebElement dropDownElement = driver.findElement(By.id("job-title"));
            Select dropDown = new Select(dropDownElement);
            List<WebElement> options = new ArrayList<>();
            options = dropDown.getOptions();
            for (int i = 0; i < options.size(); i++){
                System.out.println(options.get(i).getText());
            }
        }


    }

