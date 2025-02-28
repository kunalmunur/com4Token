package webElementMethodAmanSir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledIsDisplayed {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		if(driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed()) {
			System.out.println("logo is displayed");
		}
		else {
			System.out.println("logo is not displayed");
		}
		WebElement userNameTextField = driver.findElement(By.id("email"));
		if(userNameTextField.isEnabled()) {
			userNameTextField.sendKeys("456677888");
		}
		else {
			System.out.println("text field is disabled");
		}
	}

}
