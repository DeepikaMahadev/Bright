package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class carein {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Select s = new Select(month);
		s.selectByIndex(0);
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select s1 = new Select(year);
		s1.selectByVisibleText("2003");
		driver.findElement(By.linkText("1")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	}

}
