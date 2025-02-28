package practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchDifferentBrowser {
	 
	public static void main(String[] args) {
		WebDriver driver;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name:");
        String a=sc.nextLine();
       if(a.equalsIgnoreCase("chrome")) {
    	   driver=new ChromeDriver();
       }
       else if(a.equalsIgnoreCase("firefox")) {
    	   driver=new FirefoxDriver();
       }
       else if(a.equalsIgnoreCase("edge")) {
    	   driver=new EdgeDriver();
       }
       else {
    	   System.out.println("invalid Result");
       }
	}

}
