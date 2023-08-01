package Testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class LoginTest extends BaseTest{

    String expectedPage = "Sign in";
    String expectedPage2 = "Signin";
    String existingPage;
    String list = "//div[@id='headInfoPopup']//div";
    int actualSizeList;
    int expectedSizeList = 2;
    int expectedSizeList2 = 23;
    String existingUrl;
    String expectedUrl = "https://test.my-fork.com/log-in";




    @Test
    public void EmailPassLoginFieldsValidation() throws InterruptedException {

        homePage.openSignInPage();

        // Hard Assert
        existingPage = driver.getTitle();
//        System.out.println(existingPage);
        Assert.assertEquals(existingPage, expectedPage);

        List<WebElement> elementList = driver.findElements(By.xpath(list));
        actualSizeList = elementList.size();
        Assert.assertEquals(actualSizeList, expectedSizeList, "Didn't match");

        WebElement actualBoolean = driver.findElement(By.xpath("//input[@id='auth-page-remember-me']"));
        if (driver.findElement(By.xpath("//input[@id='auth-page-remember-me']")).isSelected()) {
            Assert.assertTrue(true, String.valueOf(actualBoolean));
        }
        else {Assert.fail("Checkbox is not selected");}

        loginPage.EmailPassLoginFieldsValidation();

        existingUrl = driver.getCurrentUrl();
        //System.out.println(existingUrl);
        Assert.assertEquals(existingUrl, expectedUrl);


    }

    @Test
    public void TryToLoginUsingInvalidIDandPass() throws InterruptedException {

        // Soft Assert
        homePage.openSignInPage();

        SoftAssert softAssert = new SoftAssert();
        existingPage = driver.getTitle();
        softAssert.assertEquals(existingPage, expectedPage2, "Wrong title");

        List<WebElement> elementList = driver.findElements(By.xpath(list));
        actualSizeList = elementList.size();
        softAssert.assertEquals(actualSizeList, expectedSizeList2, "Didn't match");

        WebElement actualBoolean = driver.findElement(By.xpath("//input[@id='auth-page-remember-me']"));
        if (driver.findElement(By.xpath("//input[@id='auth-page-remember-me']")).isSelected()) {
            softAssert.assertTrue(true, String.valueOf(actualBoolean));
        }
        else {Assert.fail("Checkbox is not selected");}

        existingUrl = driver.getCurrentUrl();
        //System.out.println(existingUrl);
        softAssert.assertEquals(existingUrl, expectedUrl);

        softAssert.assertAll();

        loginPage.fillUpCredentials();
        loginPage.submitButtonClickOnLoginPage();
    }

    @Test
    public void InvalidEmailandPasswordErrorMessageValidation() throws InterruptedException {

        homePage.openSignInPage();
        loginPage.errorMessagePopUpValidation();
    }

    @Test
    public void RememberMeCheckboxValidation() throws InterruptedException {

        homePage.openSignInPage();
        loginPage.checkIfCheckboxIsSelected();

    }

    @Test
    public  void JobTitleDropdownSignUp() throws InterruptedException{
        homePage.openSignInPage();
        loginPage.clickSignUpButton();
        loginPage.jobTitleDropDownArray();

    }

}
