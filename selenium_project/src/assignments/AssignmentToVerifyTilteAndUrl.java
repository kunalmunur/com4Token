package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentToVerifyTilteAndUrl {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");
		//To Verify The Title 
		String actual_Title = driver.getTitle();
		String expected_Title = "Order Food Online from India's Best Food Delivery Service | Swiggy";
		if(actual_Title.equals(expected_Title)) {
			System.out.println("Welecome Page is Displayed");
		}
		else {
			System.out.println("Welcome page is Not Displayed");
		}
		//To Verify The Url
		String actual_Url = driver.getCurrentUrl();
		System.out.println(actual_Url);
		String expected_Url = "https://www.swiggy.com/";
		if(actual_Url.equals(expected_Url)) {
			System.out.println("Url is Verified");
		}
		else {
			System.out.println("Url is not Verified");
		}

}
}
