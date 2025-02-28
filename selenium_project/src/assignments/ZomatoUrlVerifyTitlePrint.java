package assignments;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoUrlVerifyTitlePrint {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		String title = driver.getTitle();
		System.out.println("Title of the zomato:"+title);
		String actual_Url = driver.getCurrentUrl();
		String expected_Result = "https://www.zomato.com/";
		if(actual_Url.equals(expected_Result)) {
			System.out.println("Url is verified");
		}
		else {
			System.out.println("Url is not Verified");
		}
		driver.quit();
	}

}
