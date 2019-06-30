package page;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser.FileReaderManager;



public class NeweggLogin {
	
	public static void NeweggLogins(WebDriver driver) throws IOException {
		
		driver.findElement(By.linkText("Log in or Register")).click();
	    String UN=FileReaderManager.getInstance().getConfigReader().getprops("Username");
	    String PWD=FileReaderManager.getInstance().getConfigReader().getprops("Password");

		driver.findElement(By.cssSelector("input#UserName")).sendKeys(UN);
		driver.findElement(By.cssSelector("input#UserPwd")).sendKeys(PWD);
		driver.findElement(By.id("submitLogin")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TBD: Auto-generated catch block.
			e.printStackTrace();
		}
	}
	
	

}
