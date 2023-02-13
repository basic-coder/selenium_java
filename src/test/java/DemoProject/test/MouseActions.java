package DemoProject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		//maximize window
		driver.manage().window().maximize();
		
		//open url
		//driver.get("https://demoqa.com/buttons");
		
		// for right click
		//find element
		//WebElement btn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		//Actions act = new Actions(driver);
		//act.contextClick(btn).perform();
		
		
		//for double click
		
		//find element
		//WebElement btn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		//Actions act = new Actions(driver);
		//act.doubleClick(btn).perform();
		
		
		//open url
		driver.get("https://www.ebay.in");
		
		//find element
		WebElement element = driver.findElement(By.linkText("Shipping"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
		//close
		//driver.close();
		
		
	}

}
