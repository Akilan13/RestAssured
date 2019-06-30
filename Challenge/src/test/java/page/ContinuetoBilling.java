package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContinuetoBilling {
	
	public static void Billing(WebDriver driver) {
		
		driver.findElement(By.xpath("//*[@class='call-to-action call-to-action-checkout']/a")).click();
	}

}
