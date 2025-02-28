package webDrivermethods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetTitleMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		String title = driver.getTitle();
		System.out.println("Title of the web page is:"+title);
		if(title.contains("selenium")) {
			System.out.println("verified");
		}
		else {
			System.out.println("Not verified!!");
		}
	}

}
