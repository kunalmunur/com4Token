package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AssignmentSwiggyBiryaniElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.swiggy.com/");
		WebElement element = driver.findElement(By.xpath("//a[@class='sc-jBeBSR iBzwEP']/descendant::img[@alt='restaurants curated for biryani']"));
		File src=element.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenShot/Biryaniimage.png");
		Files.copy(src, dest);
		

}
}
