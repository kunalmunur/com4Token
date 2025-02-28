package webElementMethods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPlaceHolderAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement emailtextfield = driver.findElement(By.id("email"));
		@Nullable
		String attributevalue = emailtextfield.getAttribute("placeholder");
		if(attributevalue.contains("Email ")) {
			System.out.println(attributevalue);
		}
		else {
			System.out.println("placeholder is not correct");
		}
		
	}

}
