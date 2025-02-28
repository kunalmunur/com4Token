package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSizeMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	WebElement mobileemail = driver.findElement(By.name("reg_email__"));
	 Dimension mobileemailsize = mobileemail.getSize();
	 int mobileemailheight = mobileemailsize.getHeight();
	 int mobileemailwidth = mobileemailsize.getWidth();
	 System.out.println("mobileemail height="+mobileemailheight);
	 System.out.println("mobileemailwidth="+mobileemailwidth);
	 
	 WebElement pwd = driver.findElement(By.name("reg_passwd__"));
	 Dimension pwdsize = pwd.getSize();
	 int pwdheight = pwdsize.getHeight();
	 int pwdwidth = pwdsize.getWidth();
	 System.out.println("password text field height="+pwdheight);
	 System.out.println("password text field width="+pwdwidth);
	 
	 if(mobileemailheight==pwdheight && mobileemailwidth== pwdwidth) {
		 System.out.println("both text field having same size");
	 }
	 else {
		 System.out.println("both text field are not of same size");
	 }
}
}
