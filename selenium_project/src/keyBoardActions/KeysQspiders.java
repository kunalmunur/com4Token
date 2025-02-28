package keyBoardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysQspiders {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		name.sendKeys("DEFG");
		email.sendKeys("def@gmail.com");
		Thread.sleep(2000);
		email.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
		email.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(2000);
		password.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(2000);
		password.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//h1[text()='Login']"));
		String text = login.getText();
		if(text.equals("Login")) {
			System.out.println("Registered sucessfully");
		}
		else {
			System.out.println("Registered unsucessfully");
		}
	}

}
