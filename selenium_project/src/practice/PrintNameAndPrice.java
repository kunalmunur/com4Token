package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintNameAndPrice {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("iphone",Keys.ENTER);
		List<WebElement> allIphone = driver.findElements(By.className("KzDlHZ"));
		List<WebElement> allPrice = driver.findElements(By.xpath("//*[@class='Nx9bqj _4b5DiR']"));
		
		for(int i=0;i<allIphone.size();i++) {
			System.out.println("Title :"+i+"---"+allIphone.get(i).getText()+"-------"+allPrice.get(i).getText());
		}
	}

}
