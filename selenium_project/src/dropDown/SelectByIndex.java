package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(2000);
		WebElement phone = driver.findElement(By.id("select1"));
		Select s1=new Select(phone);
		s1.selectByIndex(3);
		WebElement phonetext = driver.findElement(By.id("phone"));
		phonetext.sendKeys("80921721964");
	}

}
