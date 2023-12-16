package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usageofNavigate {

	public static void main(String[] args)  {
		 //ChromeDriver driver = new ChromeDriver();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 //to() is also
		 //used to trigger the Url of an application(internally to() calls get())
		 driver.manage().deleteAllCookies();
		 driver.navigate().to("https://qspiders.com/");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
	}
}
