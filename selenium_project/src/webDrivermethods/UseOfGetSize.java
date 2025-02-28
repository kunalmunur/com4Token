package webDrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetSize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight()+" "+size.getWidth());
	}

}
