package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Forgotpassword {
	
	
	
	public static void forgotpassword(WebDriver driver) {
		
		driver.findElement(By.linkText("Log in or Register")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.name("loginname")).sendKeys("Test");
		driver.findElement(By.id("btn_forgot_pwd")).click();
	}

}
