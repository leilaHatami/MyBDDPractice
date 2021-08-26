package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(xpath = "//input[@name='username']")
    WebElement userName;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    @FindBy(id = "gridCheck")
    WebElement RememberMeChk;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement continueBtn;

    public  LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public WebElement getUsername()
    {
        return userName;
    }
    public WebElement getPassword()
    {
        return password;
    }
    public WebElement getContinueBtn()
    {
        return continueBtn;
    }
}
