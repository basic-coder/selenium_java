package DemoProject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("http://www.saucedemo.com");
		
		//locate user name - tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//locate password - tag(attribute)
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		
		//locate button - tag and classname
		driver.findElement(By.cssSelector("input.submit-button")).click();

		//switch to product page
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		
		//tag.valueClass[attribute=value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
	
		//tag[attribute$=substring]
		driver.findElement(By.cssSelector("button[name$=light]")).click();
	}

}
