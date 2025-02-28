package webElementMethodAmanSir;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
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
		
		Rectangle r = logo.getRect();
		System.out.println(r.getX());
		System.out.println(r.getY());
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
	}

}
