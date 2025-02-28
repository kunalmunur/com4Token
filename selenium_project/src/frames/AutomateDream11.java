package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDream11 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		/* Way1
		driver.switchTo().frame(0);
		*/
		
		/* Way 2
		driver.switchTo().frame("send-sms-iframe");
		*/
		
		// Way 3
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));
		driver.findElement(By.id("regEmail")).sendKeys("8092721965");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("hamburger")).click();
	}

}
