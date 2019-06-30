package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Removeitem {
	
	public static void removefromcart(int q,WebDriver driver) {
		
		driver.findElement(By.xpath("(//button[@class='btn btn-mini'])[" + q + "]")).click();
	}

}
