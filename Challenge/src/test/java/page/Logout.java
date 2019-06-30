package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Logout {
	
	public static void logout(WebDriver driver) {
		
		 WebElement element = driver.findElement(By.linkText("My Account"));
		 
	        Actions action = new Actions(driver);
	 
	        action.moveToElement(element).build().perform();
	 
	        driver.findElement(By.linkText("Logout")).click();
	 
		
		
	}

}
