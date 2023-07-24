package Testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LoginTest extends BaseTest{

    @Test
    public void EmailPassLoginFieldsValidation() throws InterruptedException {

        homePage.openSignInPage();
        loginPage.EmailPassLoginFieldsValidation();
    }

    @Test
    public void TryToLoginUsingInvalidIDandPass() throws InterruptedException {

        homePage.openSignInPage();
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
