package utility;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Windowhandles {
	
	public static void windowhandles(WebDriver driver,String Window) throws InterruptedException {
		
		

		 Set<String> Window1 = new HashSet<String>();
		 Window1 = driver.getWindowHandles();
        // Loop through all handles
        for(String handle: Window1){
            if(handle.equals(Window1)){
            driver.switchTo().window(handle);
            Thread.sleep(1000);
	}

}

	}
	
}