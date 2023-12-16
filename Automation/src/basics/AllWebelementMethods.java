package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWebelementMethods {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.fb.com/");
	driver.findElement(By.id("email")).sendKeys(Keys.SHIFT+"viratkohli");
	driver.findElement(By.name("email")).clear();
	WebElement link = driver.findElement(By.linkText("Forgotten password?"));
	
	Thread.sleep(2000);
	//getTagName() is used to fetch the tagName of the element
	String tag = link.getTagName();
	//getText() is used fetch the tagText of the element
	String TagText = link.getText();
	//getAttribute(String name) is used to fetch the attributeValue of the element
	//attribute name as parameter
	String attributeValue = link.getAttribute("href");
	//getCssValue(String propertyName) is used tp fetch the css value of an element
	//IT takes string as parameter where we should enter the propertyname to retrieve
	
	String color = link.getCssValue("color");
	String size = link.getCssValue("font-size");
	System.out.println("Tagname : " + tag);
	System.out.println("Tagtext : " + TagText);
	System.out.println("attribute Value " + attributeValue);
	System.out.println(color);
	System.out.println(size);
	WebElement emailTB = driver.findElement(By.id("email"));
	//It is used to get the size of an element in a webPage
	Point p = emailTB.getLocation();
	int xAxis = p.getX();
	int yAxis = p.getY();
	//It is used to get the size of an element in a webpage
	Dimension d = emailTB.getSize();
	int height = d.getHeight();
	int width = d.getWidth();
	//getrect() is a combinagion of both getLocation() and getSize()
	
	System.out.println("Height of the email box : " + height);
	System.out.println("width of the email box : " + width);
	System.out.println("xAxis of the email box : " + xAxis);
	System.out.println("yAxis of the email box : " + yAxis);
	
	WebElement image = driver.findElement(By.xpath("//img[contains(@class,'fb')]"));
	//isDisplayed() is used tio check whether th element is displayed or not
	boolean result = image.isDisplayed();
	if(result)
	{
		System.out.println("Pass: The image is displayed");
	}
	else
		System.out.println("Fail: The image is not displayed");
	
	WebElement loginBtn = driver.findElement(By.linkText("Log in"));
	//isEnabled() is used to check whether the element is enabled or disabled
			
	boolean result1 = loginBtn.isEnabled();
	if(result)
	{
		System.out.println("The login button is enabled");
	}
	else
		System.out.println("The login button is disabled");
	
	
	
	//isSelected() is used to check whether element is selected or not
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.xpath("//img[contains(@class, 'r img')]")).click();
	
	WebElement loginButton = driver.findElement(By.name("login"));
	//su
	
	loginButton.submit();
	driver.quit();		
	}
}
