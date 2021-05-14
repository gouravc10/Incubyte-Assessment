package stepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageObjects.ComposeMail;
import pageObjects.Login;


public class ComposeMail_Steps {
	Login_steps loginsteps=new Login_steps();
	ComposeMail compose=new ComposeMail(Login_steps.driver);
	
	
	
	
	
	@When("^User clicks on composeBtn")
	public void click_ComposeBtn() throws InterruptedException {
		
		compose.composeBtn().click();
	}
	
	@When("^User clicks on Recipent TextBox")
	public void click_Recipent_TextBox() throws InterruptedException {
		
		compose.recipent_TextBox().click();
	}
	
	@When("^User enters Email in Recipent TextBox")
	public void enter_Recipent_TextBox() throws InterruptedException {
		
		compose.recipent_TextBox().sendKeys("abcd@gmail.com");
	}


	@When("^User enters Subject in subject TextBox")
	public void enter_subject_textBox() throws InterruptedException {
		
		compose.subject_textBox().sendKeys("Incubyte");
	}
	
	
	@When("^User clicks on body TextBox")
	public void click_emailBody_TextBox() throws InterruptedException {
		
		compose.emailBody_TextBox().click();
	}
	
	@When("^User enters Email body in Body TextBox")
	public void enter_emailBody_TextBox() throws InterruptedException {
		
		compose.emailBody_TextBox().sendKeys("Automation QA test for Incubyte");
	}
	
	
	@When("^User clicks on send mail button")
	public void click_sendMail_Btn() throws InterruptedException {
		
		compose.sendMail_Btn().click();
	}
	
	
	
}
