package webDriverMethodsAmanSir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramWithNameId {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("kunal@12");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123455");
		WebElement login = driver.findElement(By.className("_acap"));
		login.click();
		
	}

}
