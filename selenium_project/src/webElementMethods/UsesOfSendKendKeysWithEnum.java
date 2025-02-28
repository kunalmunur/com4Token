package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfSendKendKeysWithEnum {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement usernametextfield = driver.findElement(By.id("username"));
		usernametextfield.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		usernametextfield.sendKeys(Keys.DELETE);
		usernametextfield.sendKeys("admin");
		Thread.sleep(2000);
		WebElement passwordtextfield = driver.findElement(By.id("password"));
		passwordtextfield.sendKeys(Keys.CONTROL+"A");
		passwordtextfield.sendKeys(Keys.DELETE);
		passwordtextfield.sendKeys("admin",Keys.ENTER);
		
		
	}

}
