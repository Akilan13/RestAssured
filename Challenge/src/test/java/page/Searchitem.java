package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchitem {
	
	public static void search(String s, WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("haQuickSearchBox")).sendKeys(s);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-mini search-bar-btn']")).click();
	}

}
