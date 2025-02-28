package assignments;

import java.util.HashSet;
import java.util.*;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentToPrintUniqueOptions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/Animal.html");
		WebElement dropDown = driver.findElement(By.id("dropdown"));
		Select s=new Select(dropDown);
		s.selectByValue("1");
		//System.out.println(s.isMultiple());
		List<WebElement> allOptions = s.getOptions();
		Set uniqueOptions=new LinkedHashSet();
		for(WebElement options:allOptions) {
			String opt1 = options.getText();
			uniqueOptions.add(opt1);
		}
		for(Object op1:uniqueOptions) {
			System.out.println(op1);
		}
		
	}

}
