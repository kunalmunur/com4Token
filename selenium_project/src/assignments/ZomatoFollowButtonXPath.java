package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZomatoFollowButtonXPath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
		searchBox.sendKeys("roti");
		searchBox.click();
        Thread.sleep(2000);
        WebElement searchRoti = driver.findElement(By.xpath("//p[text()='Roti - Delivery']"));
        searchRoti.click();
        WebElement chaap = driver.findElement(By.xpath("//h4[text()='Sardar G Malai Chaap Junction']"));
        chaap.click();
       WebElement review = driver.findElement(By.xpath("//a[text()='Reviews']"));
       review.click();
       WebElement follow = driver.findElement(By.xpath("//p[text()='Abhishek Sharma']/ancestor::section[@class='sc-leGWhw dsGFFl']/descendant::span[text()='Follow']"));
       follow.click();
      /* WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
       w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='sc-iGgWBj elhLRJ']")));*/
	}

}
