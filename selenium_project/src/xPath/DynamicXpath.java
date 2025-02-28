package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicXpath {
	public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.worldometers.info/coronavirus/");
	  WebElement casesCount = driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/ancestor::div[@id='maincounter-wrap']/descendant::span[@style='color:#aaa']"));
	  System.out.println(casesCount.getText());
	  
	 WebElement deaths = driver.findElement(By.xpath("//h1[text()='Deaths:']/ancestor::div[@id='maincounter-wrap']/descendant::span[text()='7,010,681']"));
	 System.out.println(deaths.getText());
	 WebElement recovered = driver.findElement(By.xpath("//h1[text()='Recovered:']/ancestor::div[@id='maincounter-wrap']/descendant::span[text()='675,619,811']"));
	 System.out.println(recovered.getText());
	}

}
