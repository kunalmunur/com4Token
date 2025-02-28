package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AsssignmentOnGoogle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("phoebe buffay",Keys.ENTER);
		WebElement guitar = driver.findElement(By.xpath("//canvas[@class='lNPNe']"));
		guitar.click();
		
	}

}
