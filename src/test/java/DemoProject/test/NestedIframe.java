package DemoProject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1"); //parent frame
		driver.switchTo().frame("frame3"); //child frame
		
		//click on check box
		driver.findElement(By.id("a")).click();
		
		//to parent frame
		driver.switchTo().parentFrame(); 
		
		//find element input box
		driver.findElement(By.tagName("input")).sendKeys("this authomated");
		
		//switch to main page
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		//find webelement
		WebElement dropDownElement = driver.findElement(By.id("animals"));
		
		Select dropdown = new Select(dropDownElement);
		
		dropdown.selectByVisibleText("Avatar");
	}

}
