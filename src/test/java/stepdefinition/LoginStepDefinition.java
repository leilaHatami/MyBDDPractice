package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;
//import org.testng.Assert;


public class LoginStepDefinition {
    WebDriver driver=null;
    LoginPage loginPage;
    @Before
    public void cucumberSetup()
    {
        String projectDir=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectDir+"\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

    @Given("^shipcarte login page is launched$")
    public void shipcarte_login_page_is_launched() throws Throwable {
       /* System.setProperty("webdriver.chrome.driver","D:\\Driver\\win\\chromedriver.exe");
        driver=new ChromeDriver();*/
        loginPage=new LoginPage(driver);
        driver.get("http://shipcarte.pragralms.com:3000/#/signin");
    }

    @When("{string} is entered")
    public void is_entered(String string) {
        loginPage.getUsername().sendKeys(string);
    }

    @When("^password is entered$")
    public void password_is_entered() throws Throwable {
        loginPage.getPassword().sendKeys("Pragr@1234");

    }

    @Then("^validate if it land on dashboard page$")
    public void validate_if_it_land_on_dashboard_page() throws Throwable {
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"http://shipcarte.pragralms.com:3000/#/dashboard");
    }

    @And("^click on login button$")
    public void click_on_login_button() throws Throwable {
        loginPage.getContinueBtn().submit();
    }

    @After
    public void tearDown()
    {
        driver.close();
    }
}
