package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class Login{
	public WebDriver driver = null;
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement enterEmail() {
		return driver.findElement(By.xpath("//input[@id='identifierId']"));
	}
	
	public void emailNext_Btn() {
		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button")).click();
	}
	
	public WebElement enterPassword() {
		return driver.findElement(By.xpath("//input[@name='password']"));
	}
	
	public void passwordNext_Btn() {
		driver.findElement(By.xpath("//*[@id='passwordNext']/div/button")).click();
	}
	
	
	
}