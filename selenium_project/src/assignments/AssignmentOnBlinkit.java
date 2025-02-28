package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnBlinkit {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://blinkit.com/");
		
		WebElement location = driver.findElement(By.xpath("//button[text()='Detect my location']"));
		location.click();
		driver.findElement(By.xpath("//div[@id='animationText-1']")).click();
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']"));
		searchBox.sendKeys("vegetable",Keys.ENTER);
		WebElement ladyFinger = driver.findElement(By.xpath("//div[text()='Lady Finger (Bhindi)']"));
		ladyFinger.click();
		WebElement addButton = driver.findElement(By.xpath("//div[text()='ADD']"));
		addButton.click();
		//Pull
		
		driver.close();
	}

}
