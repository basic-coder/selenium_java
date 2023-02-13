package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class GoogleParameterSearch {

	@Test
	@Parameters({"keyword"})
	public void googleSearch(String searchData) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(searchData);
		
		Assert.assertEquals(searchData, searchbox.getAttribute("value"));
		
		driver.quit();
	}
}
