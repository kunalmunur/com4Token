package assignments;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeFirefoxEdgeBrowser {
	public static void main(String[] args) {
		WebDriver driver;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name:");
		String br=sc.nextLine();
		if(br.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(br .equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
