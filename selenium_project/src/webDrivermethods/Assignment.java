package webDrivermethods;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.orangehrm.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		Set<String> allwinid = driver.getWindowHandles();
		for(String winid:allwinid) {
			String title = driver.switchTo().window(winid).getTitle();	
		
		if(title.contains("Facebook – log in or sign up")) {
			int height = driver.manage().window().getSize().getHeight();
			System.out.println("Height of first application is:"+height);
		}
		else if(title.contains("Human Resources Management")) {
			int width = driver.manage().window().getSize().getWidth();
			System.out.println("Width of the second application is:"+width);
		}
		else{
			Dimension size = driver.manage().window().getSize();
			System.out.println("height and width of third application is:"+size.getHeight()+" "+size.getWidth());
			
		}
			
		}
	}

}
