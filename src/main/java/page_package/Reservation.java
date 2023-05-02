package page_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Reservation extends Base_class {
	@Test 
	public void home_res() throws InterruptedException {
		Thread.sleep(20000);
		WebElement activity = driver.findElement(By.id("selectActivity"));
		activity.click();
	}

}
