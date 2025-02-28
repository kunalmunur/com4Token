package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkarToSearchPoha {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search grocery products']"));
		search.sendKeys("poha");
		
	}

}
