package DemoProject.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//to maximize window
		driver.manage().window().maximize();
						
		//open url
		driver.get("https://www.calculator.net/");
		
		List <WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		System.out.println("all links : "+ linkElements.size());
		
		for(WebElement el : linkElements) {
			System.out.println(el.getText());
		}
		
		driver.close();

	}

}
