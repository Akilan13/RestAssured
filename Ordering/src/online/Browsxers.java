package online;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Browsxers {
	
	
	public WebDriver browse(WebDriver driver) throws IOException {
	
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\kselvaraj\\eclipse-workspace\\Ordering\\Configure.properties");
prop.load(fis);

if (prop.getProperty("browser").contains("Chrome")) {
	
	System.setProperty("webdriver.chrome.driver",Constant.Chromedriver);
	driver = new ChromeDriver();
	
	
}
return driver;
	}

}
