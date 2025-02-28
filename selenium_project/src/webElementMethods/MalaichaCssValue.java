package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MalaichaCssValue {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.malaicha.com/login");
		WebElement RegisterButton = driver.findElement(By.xpath("//button[text()='Register']"));
	    String BackGroundcolor = RegisterButton.getCssValue("background");
	    System.out.println(BackGroundcolor);
	    String Textcolor = RegisterButton.getCssValue("color");
	    System.out.println(Textcolor);
	    
	    
	    
	}

}
