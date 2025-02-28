package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElements2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		WebElement paytmcursor = driver.findElement(By.xpath("//a[text()='Paytm for Consumer']"));
		WebElement ticketBooking = driver.findElement(By.xpath("//a[text()='Ticket booking']"));
		WebElement flightBook = driver.findElement(By.xpath("//a[text()='Flight Tickets']"));
		Actions act=new Actions(driver);
		act.moveToElement(paytmcursor).moveToElement(ticketBooking).moveToElement(flightBook).click().perform();

}
}
