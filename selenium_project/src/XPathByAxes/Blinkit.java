package XPathByAxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Blinkit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://blinkit.com");
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
	    driver.findElement(By.xpath("//div[@id='animationText-1']")).click();
	   WebElement searchBox1 = driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']"));
	   searchBox1.sendKeys("vegetables");
	  // Thread.sleep(2000);
	   WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
	   w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Lady Finger (Bhindi)']/ancestor::div[contains(@class,'Product__UpdatedContentCo')]/descendant::div[text()='ADD']")));
	    driver.findElement(By.xpath("//div[text()='Lady Finger (Bhindi)']/ancestor::div[contains(@class,'Product__UpdatedContentCo')]/descendant::div[text()='ADD']")).click();
	   
	
	}

}
