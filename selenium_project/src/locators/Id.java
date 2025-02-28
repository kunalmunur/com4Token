package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// identify the username and pass the value
        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys("kunal@123");
        
        // identify the password and pass the value
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("123345");
        
        //identify the login button
        WebElement login = driver.findElement(By.className("_6lti"));
        login.click();
	}

}
