package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGet {

	public static void main(String[] args) {
		
	 ChromeDriver driver = new ChromeDriver();
	 //get() is used to trigger the URL of the application
	 //URL should consist of protocol application name and domain name
	 driver.get("https://secure.indeed.com");
	 //close() is used to close the current browser and will not close in background
	 driver.findElement(By.id("apple-signin-button")).click();
	 //driver.close()
	 //quit() is used to close all the browsers and also in the background
	// driver.quit();
	}

}
//completed