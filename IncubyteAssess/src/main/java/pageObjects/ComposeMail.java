package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComposeMail {

	public WebDriver driver = null;
	public ComposeMail(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement composeBtn() {
	    return driver.findElement(By.xpath("//div[contains(text(),'Compose')]"));
		
	}
	public WebElement recipent_TextBox() {
	    return driver.findElement(By.xpath(".//textarea[contains(@aria-label, 'To')]"));
		
	}
	public WebElement subject_textBox() {
	    return driver.findElement(By.name("subjectbox"));
		
	}
	
	public WebElement emailBody_TextBox() {
	    return driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]"));
		
	}
	
	public WebElement sendMail_Btn() {
	    return driver.findElement(By.xpath("//*[text()='Send']"));
		
	}
	
}
