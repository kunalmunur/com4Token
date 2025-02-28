package webDrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfSwitchToMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.selenium.dev/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.orangehrm.com/");
           Set<String> allwinid = driver.getWindowHandles();
           System.out.println(allwinid);
	}

}
