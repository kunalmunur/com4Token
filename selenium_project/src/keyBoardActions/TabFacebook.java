package keyBoardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabFacebook {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_F);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_K);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		for(int i=0;i<=25;i++) {
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
