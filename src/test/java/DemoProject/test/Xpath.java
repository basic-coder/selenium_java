package DemoProject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//open url
		driver.get("http://www.saucedemo.com");
		
		//locate username using single attribute
		//driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		
		//locate username using text
		//*[text()='Accepted usernames are:']
		
		//locate username using contains
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
		
		//locate password using contains
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("secret_sauce");
		
		
		//locate password using multiple attribute
		//driver.findElement(By.xpath("//input[@id='password'][@name='password']")).sendKeys("secret_sauce");

		//locate login button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		//switch to product page
		String currentPageHandle = driver.getWindowHandle();
		
		driver.switchTo().window(currentPageHandle);
		
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack' and @id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light' or @id='add-to-cart-sauce-labs-bike-light']")).click();

		// only-testing-blog.blogspot.com/2014/09/temp.html
		
		//div[@class='form_group'][position()=1]
	}

}
