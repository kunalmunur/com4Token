package practice_sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithPlaceholder {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement name=driver.findElement(By.xpath("//input[@placeholder='Enter your name']"));
	 name.sendKeys("kunal");
	WebElement email=driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']"));
		 email.sendKeys("kunal@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
	     password.sendKeys("123456");
	     driver.findElement(By.xpath("//button[@type='submit']")).submit();
	     
	}

}
