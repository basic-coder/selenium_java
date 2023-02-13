package DemoProject.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//open url
		//driver.get("http://www.rediff.com");
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//switch to iframe
		
		//by id
		//driver.switchTo().frame("moneyiframe")
		;
		//by index
		driver.switchTo().frame(0);
		
		//find element
		//String text = driver.findElement(By.id("nseindex")).getText();
		WebElement element = driver.findElement(By.linkText("org.openqa.selenium"));
		
		//System.out.println(text);
		
		element.click();
		
		//switch to main page
		driver.switchTo().defaultContent();
		
		//switch to other frame
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Alert")).click();
		
		//switch to main page
		driver.switchTo().defaultContent();
		
		List <WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of iframes"+iframes.size());		

	}

}
