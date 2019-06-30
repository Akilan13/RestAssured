package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Continueshopping  {
	
	public void continueshopping(WebDriver driver) {
		
		try {
		
	driver.findElement(By.xpath("//button[@title='Continue Shopping']")).click();
	
		}catch (Exception e) {
			e.getMessage();
		}
	}

}
