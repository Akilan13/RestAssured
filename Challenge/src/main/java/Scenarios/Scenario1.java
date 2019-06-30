package Scenarios;

import java.io.IOException;
import java.util.concurrent.TimeUnit;



import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import page.Addtocart;
import page.Checkout;
import page.Continueshopping;
import page.ContinuetoBilling;
import page.Fieldvalidation;
import page.Logout;
import page.NeweggLogin;
import page.Removeitem;
import page.Searchitem;
import page.ViewCart;
import page.getElement;
import utility.Constant;
import utility.ExcelUtils;
import browser.FileReaderManager;
import browser.Invokebrowser;


//@Listeners(listenerstest.Listener.class)

public class Scenario1 {
	
	public static WebDriver driver;
	static String URL = "https://www.newegg.com";
	
	@BeforeTest
	public static void scenario1() throws IOException {
		
		Invokebrowser invokebrowser = new Invokebrowser();
		driver = invokebrowser.Createdriver();
		driver.get(URL);
		if (FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) {
		driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
	}
		
	@Test
	
	public void Test() throws Exception {
		

	//Open and run the excel sheet
		ExcelUtils.Openexcel(Constant.Path_TestData, "Sheet1");
	//Login function to login into newegg.com	
		NeweggLogin.NeweggLogins(driver);
	//Q is to remove which element in the cart
		int q=1;
		
		for (int i =1;i<=ExcelUtils.rowcount();i++) {
			
				String s=ExcelUtils.Readcelldata(i, 0);
				String K =ExcelUtils.Readcelldata(i, 1);;
		//search the item and tap on search	
				Searchitem.search(s, driver);
		//search for a particular item and tap on it		
				getElement.getElements(K, driver);
		// Add to cart function		
				Addtocart.addtocart(i,driver);
		//Click on Continue shopping button	
				Continueshopping a = new Continueshopping();
				a.continueshopping(driver);
		
		}
		//Tap on the cart
		ViewCart.viewcart(driver);
		//Remove item from the cart
		Removeitem.removefromcart(q, driver);
		//Tap on checkout
		Checkout.checkout(driver);
		//Tap on continue to billing
		ContinuetoBilling.Billing(driver);
		//Field validation
		Fieldvalidation.firldvalidation(driver);
		//Logout from the application
		Logout.logout(driver);
		}
	
	@AfterTest
	
	public static void aftertest() throws Exception {
		
		if (driver!=null) {
			driver.close();
			driver.quit();
			ExcelUtils.Closeexcel();
			}
	}

}
