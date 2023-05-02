package Listeners_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import page_package.Base_class;

public class Sign_up extends Base_class
{
	
	@Test
	public void Register_user() throws InterruptedException 
	{
		Thread.sleep(5000);
		//Prerequisite: Must have to click on the Register Button on the login page
		WebElement register =driver.findElement(By.xpath("//button[@class='btn btn-outline-light me-3']"));
		register.click();
		Thread.sleep(1000);
		
		//Registered a new user
		WebElement Fname =driver.findElement(By.id("fname"));
		Fname.sendKeys("Test");
		Thread.sleep(1000);
		
		WebElement Email =driver.findElement(By.id("email"));
		Email.sendKeys("Marke@mailinator.com");
		Thread.sleep(1000);
		
		WebElement Username =driver.findElement(By.id("username"));
		Username.sendKeys("TestMark");
		Thread.sleep(1000);
		
		WebElement Pass =driver.findElement(By.id("password"));
		Pass.sendKeys("Secret123");
		Thread.sleep(1000);
		
		
		WebElement ConfPass =driver.findElement(By.id("pconfirmation"));
		ConfPass.sendKeys("Secret123");
		Thread.sleep(1000);
		
		//Submit button
		WebElement Submit =driver.findElement(By.xpath("//div[@class='col text-center mt-3']"));
		Submit.click();
		
		// Verification Email
		//WebElement Ver_code = driver.findElement(By.id("token"));
		//Ver_code.sendKeys("")
	}
}
