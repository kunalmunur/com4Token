package webBasedPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
	driver.findElement(By.id("buttonAlert5")).click();
	
	Thread.sleep(2000);
	Alert a=driver.switchTo().alert();
	// click on ok
	//a.accept();
	
	// click on cancel
	a.dismiss();
}
}
