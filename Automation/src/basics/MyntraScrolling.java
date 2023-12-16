package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraScrolling {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.myntra.com/");
List<WebElement> navmenu = driver.findElements(By.className("desktop-main"));

Actions a = new Actions(driver);
for (int i =0; i<navmenu.size();i++) {
	a.moveToElement(navmenu.get(i)).pause(500).perform();
	
}
for(int i=navmenu.size()-1; i>=0; i++) {
	a.moveToElement(navmenu.get(i)).pause(500).perform();	
}
	}

}
