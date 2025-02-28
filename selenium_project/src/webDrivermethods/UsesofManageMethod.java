package webDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesofManageMethod {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
	//	driver.manage().window().maximize(); // maximize the browser
		 
	//	driver.manage().window().fullscreen(); // get full screen of the webpage
		driver.manage().window().minimize();
	}

}
