package DemoProject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//maximize browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.calculator.net");
		driver.get("https://www.album.alexflueras.ro/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		try {
			Thread.sleep(3000);		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		// scroll 500px
		//js.executeScript("window.scrollBy(0,500)");
		
		//scroll till element visibility
		//WebElement element = driver.findElement(By.linkText("BMI Calculator"));
		//js.executeScript("arguments[0].scrollIntoView()",element);
		
		//scroll till bottom
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		 //horizontal scroll
		WebElement Element = driver.findElement(By.id("a7"));
		js.executeScript("arguments[0].scrollIntoView()",Element);
		

	}

}
