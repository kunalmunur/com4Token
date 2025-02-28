package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class UsageOfGetText {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String exp_result = "Facebook helps you connect and share with the people in your life.";
		
		WebElement imagetext = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String act_result = imagetext.getText();
		System.out.println(act_result);
		if(act_result.equals(exp_result)) {
			System.out.println("passed");
			
			
		}
		else {
			System.out.println("failed");
		}
		
		
	}

}
