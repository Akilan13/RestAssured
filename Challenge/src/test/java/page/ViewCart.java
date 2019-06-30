package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewCart {
	
	public static void viewcart(WebDriver driver) {
		
		driver.findElement(By.xpath("//a[@title='Shopping Cart with Items']")).click();
	}

}
