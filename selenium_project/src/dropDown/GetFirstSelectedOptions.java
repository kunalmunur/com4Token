package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement multiDropDown = driver.findElement(By.id("select-multiple-native"));
		Select s =new Select(multiDropDown);
		System.out.println(s.isMultiple());
		List<WebElement> allOptins = s.getOptions();
		for(int i=0;i<3;i++) {
			s.selectByIndex(i);
		}
		System.out.println(s.getFirstSelectedOption().getText());
	}

}
