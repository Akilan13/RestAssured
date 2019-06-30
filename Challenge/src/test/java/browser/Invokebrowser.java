package browser;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import dataproviders.ConfigFileReader;
import ennums.DriverType;
import browser.FileReaderManager;



public class Invokebrowser {
	
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	public static DriverType drivertype;
	public WebDriver driver;
	
	
	public Invokebrowser() throws IOException {
		
		
		 drivertype = FileReaderManager.getInstance().getConfigReader().getBrowser();
		
	}
	
	public WebDriver getWebDriver() throws IOException {
		
		if(driver==null) driver=Createdriver();
		return driver;
}

	public WebDriver Createdriver() throws IOException {
		switch (drivertype) {
		case CHROME:
			System.setProperty(CHROME_DRIVER_PROPERTY,FileReaderManager.getInstance().getConfigReader().getDriverpath());
        	driver = new ChromeDriver();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		case INTERNETEXPLORER:
			driver = new InternetExplorerDriver();
			break;
		}
		return driver;
	}

}
