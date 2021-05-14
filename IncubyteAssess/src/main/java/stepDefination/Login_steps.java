package stepDefination;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

import javax.security.auth.login.LoginContext;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.Login;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login_steps
{
	public static WebDriver driver;
	Login login;
	@Before public void setup() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 login = new Login(driver);
				}
	
	
	@Given("^I am on gmail sign-in page")
	public void goToGmail() {
	
		driver.get("http://www.gmail.com");
	}
	
	@When("^User enters the gmail id")
	public void clickusername() throws InterruptedException {
	
		login.enterEmail().sendKeys("incubyteassess@gmail.com");
	}
	
	@When("^User click on next button for password screen")
	public void emailNext_Btn() {
		
		login.emailNext_Btn();
	}
	
	@When("^User clicks on password textbox")
	public void clickPassword() throws InterruptedException {
		Login login = new Login(driver);
		login.enterPassword().click();
		Thread.sleep(2000);
	}
	
	
	@When("^User enters the password")
	public void enterpassword() throws InterruptedException {
		
		login.enterPassword().sendKeys("Gourav@123");
		Thread.sleep(2000);
	}
	
	@When("^User click on next button for login")
	public void passwordNext_Btn() {
		
		login.passwordNext_Btn();
	}
	
}

