package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/button/buttonDoubleClick");
 WebElement ele =driver.findElement(By.id("btn20"));
 Actions a = new Actions(driver);
 a.doubleClick(ele).perform();
	}

}
