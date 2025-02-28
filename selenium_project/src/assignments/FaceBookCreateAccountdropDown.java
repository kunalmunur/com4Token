package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookCreateAccountdropDown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	     WebElement day = driver.findElement(By.id("day"));
	     Select s1=new Select(day);
	     s1.selectByValue("23");
	     WebElement month = driver.findElement(By.id("month"));
	     Select s2=new Select(month);
	     s2.selectByValue("9");
	     WebElement year = driver.findElement(By.id("year"));
	     Select s3=new Select(year);
	     s3.selectByVisibleText("1992");
	}

}
