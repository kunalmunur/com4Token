package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopTricentis {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register = driver.findElement(By.linkText("Register"));
		register.click();
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("kunal");
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("sinha");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("lucky21@gmail.com");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("123456");
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys("123456");
		WebElement register1 = driver.findElement(By.id("register-button"));
		register1.click();
		driver.close();
	}

}
