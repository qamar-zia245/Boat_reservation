package page_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base_class
{	
	@Test (priority = 1)
	public void Login_Page() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("username"));
	 	username.sendKeys("samuela");
	 	Thread.sleep(2000);
	 	WebElement Pass = driver.findElement(By.id("password"));
	 	Pass.sendKeys("secret123");
	 	Thread.sleep(2000);
	 	WebElement Login_btn = driver.findElement(By.xpath("//body/br-root[1]/br-login[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]"));
	 	Login_btn.click();
	}
}
