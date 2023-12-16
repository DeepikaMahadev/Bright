package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronizationmethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.id("username)).sendKeys("admin");"
		driver.findElement()

	}

}
