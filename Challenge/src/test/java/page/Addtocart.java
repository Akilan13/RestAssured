package page;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utility.ExcelUtils;

public class Addtocart {
	
	public static void addtocart(int i,WebDriver driver) throws Exception {
		
		boolean flags = false;
		Thread.sleep(1500);
		String Expected = ExcelUtils.Readcelldata(i, 2);
		String Actual1 = driver.findElement(By.xpath("(//*[contains(@class,'price-main-product')])//following-sibling::li/strong")).getText();
		String Actual2 = driver.findElement(By.xpath("(//*[contains(@class,'price-main-product')])//following-sibling::li/sup")).getText();
		String Actuals=Actual1.concat(Actual2);

		
		Assert.assertEquals("$"+Actuals, Expected);
		
		try {
			
			driver.findElement(By.xpath("//*[contains(text(),'ADD TO CART')]/ancestor::button[@class='btn btn-primary btn-wide']")).click();
			flags = true;
			
		} catch (Exception e) {
			
			
			System.out.println("Item not available");
		}
		
		
		if (!flags) {
			
			driver.findElement(By.xpath("(//a[@href='https://www.newegg.com/'])[2]")).click();
		}
		
	}

}
