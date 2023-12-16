package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleSrolling {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.linkText("Instagram"));
	Actions a = new Actions(driver);
	//scrollByAmount(x,y) will scroll the webpage for the mentioned value
	//a.scrollByAmount(0,500).perform();
	//scrollToElement(Webele ele) will scroll the webpage untill the element is present
	a.scrollToElement(ele).perform();

	}

}
