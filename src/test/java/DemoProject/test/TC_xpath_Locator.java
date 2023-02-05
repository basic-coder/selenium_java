package DemoProject.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_xpath_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.saucedemo.com");
		
		//locate username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//locate password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//login button	
		driver.findElement(By.className("submit-button")).click();
		
		
		// switch to product page link
		String currentWindowHandle =driver.getWindowHandle();
		
		driver.switchTo().window(currentWindowHandle);
		
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		
		// for all element with sauce
		
		List <WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
		
		System.out.println("Elements size : "+elementList.size());
		
		
	}

}
