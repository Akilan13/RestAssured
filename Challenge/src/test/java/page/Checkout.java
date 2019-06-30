package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
	
	public static void checkout(WebDriver driver) {
		
		driver.findElement(By.xpath("//*[@title='Secure Checkout']")).click();
	}

}
