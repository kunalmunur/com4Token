package windowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFlipkart {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 128 GB)']")).click();
		String parentSessionId = driver.getWindowHandle();
		System.out.println(parentSessionId);
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		for(String id:allId) {
			driver.switchTo().window(id);
			if(driver.getTitle().equals("APPLE iPhone 15 (Green, 128 GB)")) {
				break;
			}
		}

	

}
}