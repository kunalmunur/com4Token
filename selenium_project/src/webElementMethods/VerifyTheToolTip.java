package webElementMethods;

import org.jspecify.annotations.Nullable;
import javax.swing.ToolTipManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheToolTip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement image = driver.findElement(By.xpath("//div[@class='_16ZfEv']//img"));
		@Nullable
		String ToolTip = image.getAttribute("title");
		System.out.println(ToolTip);
		
	}
	

}
