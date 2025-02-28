package assignments;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentToPrintTilteUrlOfPaytmWebPage {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://paytm.com/");
			@Nullable
			String title = driver.getTitle();
			System.out.println("Title of the Page is:"+title);
			@Nullable
			String url = driver.getCurrentUrl();
			System.out.println("Url of the Page is:"+url);

}
}
