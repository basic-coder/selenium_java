package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngExample {
	
	@Test
	public void verifyPageTitle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.google.com");
		
		//actual title
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Google";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.quit();
	}
}
