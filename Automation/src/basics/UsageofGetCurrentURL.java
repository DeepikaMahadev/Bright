package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetCurrentURL {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//getCurrentURL() is used to fetch the current URL of the webpage
		//and will return it in String form
		String url =driver.getCurrentUrl();
		System.out.println(url);
		//getTitle() is used to fetch the current Title of the webpage 
		//and will return it in String form
		String title = driver.getTitle();
		System.out.println(title);
	}

}
//completed