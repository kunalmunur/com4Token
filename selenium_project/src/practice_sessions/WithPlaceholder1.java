package practice_sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithPlaceholder1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   WebElement name=driver.findElement(By.id("name"));
	   name.sendKeys("shivam");
	   WebElement email=driver.findElement(By.id("email"));
	   WebElement password=driver.findElement(By.id("password"));
	   password.sendKeys("shivam@gmail.com");
	}

}
