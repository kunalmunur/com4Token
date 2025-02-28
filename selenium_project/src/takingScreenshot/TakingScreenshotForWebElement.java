package takingScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

import com.google.common.io.Files;

public class TakingScreenshotForWebElement {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.name("login"));
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest =new File("./screenShot/login.png");
		Files.copy(src, dest);
		
	}

}
