package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getElement {
	
public static void getElements(String K,WebDriver driver) throws InterruptedException {
		

		boolean flag = false;
		int d=3;
		List<WebElement>Page = driver.findElements(By.xpath("//div[@class='btn-group-cell']"));
		while(d<Page.size()) {
			
			try {
			 
			driver.findElement(By.partialLinkText(K)).click();
			flag = true;
			break;
			} catch (StaleElementReferenceException j) {
			} catch (Exception e) {
				
			}
			if (!flag) {
			d++;


			driver.findElement(By.xpath("//*[@title='Next']")).click();
			Thread.sleep(500); 
			}	
		}
		

}

}

