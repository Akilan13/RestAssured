package Scenarios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browser.FileReaderManager;
import browser.Invokebrowser;
import page.Forgotpassword;
import utility.Constant;
import utility.ExcelUtils;

public class Scenario2 {
	
	public static WebDriver driver;
	static String URL1 = "https://www.newegg.com";
	static String URL2 = "https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier";
	
	
	@BeforeTest
	
	public static void beforetest() throws IOException {
	
		Invokebrowser invokebrowser = new Invokebrowser();
		driver = invokebrowser.Createdriver();

		driver.get(URL1);
		if (FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) {
		driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
	}
	
	
	@Test
	
	public static void gmail() throws InterruptedException, IOException {
		

		Forgotpassword.forgotpassword(driver);

	    ((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.get(URL2);
	    String UN=FileReaderManager.getInstance().getConfigReader().getprops("Username");
	    String PWD=FileReaderManager.getInstance().getConfigReader().getprops("Password");
	    
        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(UN);
        driver.findElement(By.id("identifierNext")).click();
        driver.findElement(By.name("password")).sendKeys(PWD);
        Thread.sleep(1000);
        driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(1000);
		List<WebElement> a = driver.findElements(By.cssSelector("div.xT>div.y6>span>span"));
		//System.out.println(a.size());
		            for(int i=0;i<a.size();i++){
		                //System.out.println(a.get(i).getText());
		                if(a.get(i).getText().equals("Newegg Password Reset")){  
		                    a.get(i).click();
		                    break;
		                }
		            }
		
		driver.findElement(By.partialLinkText("Reset Password Link")).click();

		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs1.get(2));
		
		driver.findElement(By.id("newpassword")).sendKeys("Burger#01");
	
		driver.findElement(By.xpath("//button[contains(text(),'CREATE')]")).click();;
		
		String Message = driver.findElement(By.xpath("//*[@id='infoContent']/span/p[2]")).getText(); 

		
		Assert.assertEquals(Message, "Your password has been successfully updated!");
	}
	
	
@AfterTest

public void aftertest() {
	
	if (driver!=null) {
		driver.close();
		driver.quit();

		}
}

}
