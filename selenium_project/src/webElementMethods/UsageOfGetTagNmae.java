package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTagNmae {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		String dropDownTagName=dayDropDown.getTagName();
		System.out.println(dropDownTagName);
		if(dropDownTagName.equalsIgnoreCase("select")) {
			dayDropDown.click();
		}
		else {
			System.out.println("This element is not created by using select tag ");
		}
		
	}

}
