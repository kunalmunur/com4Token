package webDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetPageSourceMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String pageSource = driver.getPageSource();
		System.out.println("Page Source of the webPage is:"+pageSource);
		if(pageSource.contains("meta_referrer")) {
			System.out.println("Verified");
		}
		else {
			System.out.println("Not Verified");
		}
	}

}
