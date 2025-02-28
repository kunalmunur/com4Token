package webBasedPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode {
	public static void main(String[] args) {
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(o);
		
		driver.get("https://www.facebook.com");
	}

}
