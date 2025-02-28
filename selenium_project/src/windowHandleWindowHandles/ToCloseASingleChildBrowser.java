package windowHandleWindowHandles;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseASingleChildBrowser {
	  public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(2000);
		WebElement multipleWin = driver.findElement(By.id("browserButton2"));
		multipleWin.click();
	/*	Set<String> allIds = driver.getWindowHandles();
		for(String id:allIds) {
			driver.switchTo().window(id);
			@Nullable
			String url = driver.getCurrentUrl();
			System.out.println(url);
		/*	String title = driver.getTitle();
			if(title.equals("DemoApps | Qspiders | Browser Windows")) {
				driver.close();
				break;
			}*/
			
		
	}
}
