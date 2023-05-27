package GmailObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUserPage {
    WebDriver cnap_driver;

    public LoginUserPage(WebDriver mdriver)
    {
        this.cnap_driver=mdriver;
        PageFactory.initElements(mdriver,this);
    }

    @FindBy(id="identifierId")
    WebElement userEmailOrMobilePhone;


    public void setUserEmailOrMobilePhone(String emailOrPhone) {
        userEmailOrMobilePhone.sendKeys(emailOrPhone);
    }
    public WebElement getUserEmailOrMobilePhone() {
        return userEmailOrMobilePhone;
    }
}
