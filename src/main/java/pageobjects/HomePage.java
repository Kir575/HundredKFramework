package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BaseMain{

    public HomePage(ChromeDriver driver){
        super(driver);
    }

    public String myForkURL = "https://test.my-fork.com/";

    public void openSignInPage() throws InterruptedException {
        driver.get(myForkURL);
        driver.findElement(By.xpath("//div[@id='log-in-button']")).click();
    }
}
