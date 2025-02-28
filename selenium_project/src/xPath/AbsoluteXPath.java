package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login = driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[2]/a"));
		login.click();
		driver.navigate().back();
		WebElement shoppingCart = driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[3]/a/span[1]"));
		shoppingCart.click();
	}

}
