package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByContainsAttribute {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https//www.flipkart.com");
		WebElement search = driver.findElement(By.xpath("//input[contains(@title,'Se')]"));
		search.sendKeys("shirt");
	}
}
