package Testing;

import GmailObject.LoginUserPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailTest {

    String homePageAddress = "http://accounts.google.com/";
    String driverPath="C:/Selenium drivers/chromedriver.exe";
    WebDriver driver;
    ChromeOptions options;
    LoginUserPage objLoginUserPage;


    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Safari/537.36");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(homePageAddress);
    }
    @Test(priority=1)
    public void canLoginWithCorrectCredential(){
        objLoginUserPage=new LoginUserPage(driver);
        objLoginUserPage.setUserEmailOrMobilePhone("sdasdas@interia.pl");
    }
}
