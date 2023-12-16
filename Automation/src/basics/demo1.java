package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	public static void main(String[] args) throws InterruptedException 
	//Create an empty Chrome browser
	Thread.sleep(2000);
	{
		ChromeDriver driver = new ChromeDriver();
		//get() is used to trigger the Url of an application
		driver.get("https://secure.indeed.com");
		//getTile() is used to get the title of the current webpage
		//and will return it in string form
		String title = driver.getTitle()
	}

}
//incomplete
