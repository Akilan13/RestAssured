package online;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Signin {
	
	private static WebDriver driver;
	private static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
	
		Browsxers a = new Browsxers();
		try {
			driver = a.browse(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait = new WebDriverWait(driver, 40);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://wbdotcomqa.azurewebsites.net/home");
	 driver.findElement(By.xpath("//*[@id='navbar']/div/div[1]/div/div[2]/div/a/span[1]")).click();
	 Thread.sleep(1000);
	driver.findElement(By.id("username")).sendKeys("Whataburgerqa86+1112@gmail.com");
	driver.findElement(By.id("password")).sendKeys("burger01");
	
	 //Thread.sleep(1000);
	 //WebElement wb = driver.findElement(By.xpath("//button[@class='btn wb-btn-default center-block']"));
	WebElement wb = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='btn wb-btn-default center-block']")));
	wb.click();
	//JavascriptExecutor executor = (JavascriptExecutor)driver;
	//executor.executeScript("arguments[0].click();", wb);
	//driver.findElement(By.xpath("//form[@class='ng-dirty ng-touched ng-valid']/descendant::button[@class='btn wb-btn-default center-block']")).click();
	// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn wb-btn-default center-block']"))).click();
	
	//Thread.sleep(1500);
	try {
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='signout']")));
	
	} catch (Exception e) {
		
		System.out.println("oh");
	}
	
	//driver.findElement(By.xpath("//*[@class='signout']")).click();
	
	WebElement element = driver.findElement(By.xpath("//*[@class='signout']"));
	
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().build().perform();
	
	
	
	
	}
	//driver.findElement(By.xpath("//*[@class='signout']")).click();
	
	
	}


