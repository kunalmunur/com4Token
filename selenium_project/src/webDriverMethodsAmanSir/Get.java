package webDriverMethodsAmanSir;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
	public static void main(String[] args) {
		// To Launch The Browser
		
		WebDriver driver=new ChromeDriver();
		// To Maximize The Browser
		driver.manage().window().maximize();
		// To Launch The Application
		driver.get("https://www.flipkart.com");
		// To Print The Title
		
		String actual_Title = driver.getTitle();
		String expected_Title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	    if(actual_Title.equals(expected_Title)) {
	    	System.out.println("Welcome Page is Displayed");
	    }
	    else {
	    	System.out.println("Welcome Page is not Displayed");
	    }
	    // To Return The Url
		String url = driver.getCurrentUrl();
		System.out.println(url);
	    // To Return the PageSource
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	
	}

}
