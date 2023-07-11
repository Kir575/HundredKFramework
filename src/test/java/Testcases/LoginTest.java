package Testcases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

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


}
