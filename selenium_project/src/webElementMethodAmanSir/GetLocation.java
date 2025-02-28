package webElementMethodAmanSir;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		System.out.println(logo.getCssValue("color"));
		System.out.println(logo.getCssValue("font-size"));
		System.out.println(logo.getCssValue("font-family"));
		System.out.println(logo.getAttribute("src"));
		//tagName
		System.out.println(logo.getTagName());
		//getSize
		Dimension hw = logo.getSize();
		System.out.println(hw);
		Point xy = logo.getLocation();
		System.out.println(xy);
	}

}
