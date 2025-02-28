package webDriverMethodsAmanSir;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
public static void main(String[] args) {
	//To Launch the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	// get the size of the browser return type of  getsize() is Dimension class
	 Dimension size = driver.manage().window().getSize();
	 System.out.println(size);
	 
	 // to get the position of browser and return type of getPosition() is Point class
	 Point position = driver.manage().window().getPosition();
	 System.out.println(position);
	 
	 
	 
	 
	 
	 
}
}
