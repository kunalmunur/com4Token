package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentOnShoppersStack {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='PONDs Bright Beauty Serum Cream Anti Spot Fairness SPF']")).click();
	    // WebElement addCart = driver.findElement(By.xpath("//button[@id='Add To Cart']"));
	    // addCart.click();
	     driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("201301");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
		w.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		driver.findElement(By.id("Check")).click();
		// screenshot of ponds webelement
		
		
		
	}

}
