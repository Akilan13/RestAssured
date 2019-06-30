package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.support.Color;



public class Fieldvalidation {
	
	public static void firldvalidation(WebDriver driver) {
		String Expected = "This field is required.";
		String Expectedcolor = "#ffffff";
		String FirstnameActual = driver.findElement(By.xpath("//input[@id='SFirstName']//following-sibling::label")).getText();
		Assert.assertEquals(FirstnameActual, Expected);
		String FirstnamecolorActual = driver.findElement(By.xpath("//input[@id='SFirstName']//following-sibling::label")).getCssValue("color");
		String hex = Color.fromString(FirstnamecolorActual).asHex();
		Assert.assertEquals(hex, Expectedcolor);
		
		String FirstnameActual1 = driver.findElement(By.xpath("//input[@id='SLastName']//following-sibling::label")).getText();
		Assert.assertEquals(FirstnameActual1, Expected);
		String FirstnamecolorActual1 = driver.findElement(By.xpath("//input[@id='SLastName']//following-sibling::label")).getCssValue("color");
		String hex1 = Color.fromString(FirstnamecolorActual1).asHex();
		Assert.assertEquals(hex1, Expectedcolor);
		
		String FirstnameActual2 = driver.findElement(By.xpath("//input[@id='SAddress1']//following-sibling::label")).getText();
		Assert.assertEquals(FirstnameActual2, Expected);
		String FirstnamecolorActual2 = driver.findElement(By.xpath("//input[@id='SAddress1']//following-sibling::label")).getCssValue("color");
		String hex2 = Color.fromString(FirstnamecolorActual2).asHex();
		Assert.assertEquals(hex2, Expectedcolor);
		
		String FirstnameActual3 = driver.findElement(By.xpath("//input[@id='SCity']//following-sibling::label")).getText();
		Assert.assertEquals(FirstnameActual3, Expected);
		String FirstnamecolorActual3 = driver.findElement(By.xpath("//input[@id='SCity']//following-sibling::label")).getCssValue("color");
		String hex3 = Color.fromString(FirstnamecolorActual3).asHex();
		Assert.assertEquals(hex3, Expectedcolor);
		
		String FirstnameActual4 = driver.findElement(By.xpath("//input[@id='SZip']//following-sibling::label")).getText();
		Assert.assertEquals(FirstnameActual4, Expected);
		String FirstnamecolorActual4 = driver.findElement(By.xpath("//input[@id='SZip']//following-sibling::label")).getCssValue("color");
		String hex4 = Color.fromString(FirstnamecolorActual4).asHex();
		Assert.assertEquals(hex4, Expectedcolor);
		
		String FirstnameActual5 = driver.findElement(By.xpath("//input[@id='ShippingPhone']//following-sibling::label")).getText();
		Assert.assertEquals(FirstnameActual5, Expected);
		String FirstnamecolorActual5 = driver.findElement(By.xpath("//input[@id='ShippingPhone']//following-sibling::label")).getCssValue("color");
		String hex5 = Color.fromString(FirstnamecolorActual5).asHex();
		Assert.assertEquals(hex5, Expectedcolor);
		

		
		
		driver.findElement(By.xpath("//*[@title='Shopping Cart']")).click();
		
	}

}
