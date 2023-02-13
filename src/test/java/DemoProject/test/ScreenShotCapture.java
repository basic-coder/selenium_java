package DemoProject.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotCapture {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
								
		//maximize window
		driver.manage().window().maximize();
		
		//open url
		driver.get("http://uitestpractice.com/");
		
		//full page screenshot capture
		//step one convert webdriver object to take screenshot interface
		//TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//step two get aScreenshotAs method to create a image
		//File src= screenshot.getScreenshotAs(OutputType.FILE);
		
		//File dest = new File("C:\\test\\workspace\\test\\Screenshot\\fullpage.png");
		
		//step 3 copy image file to destination
		
		//FileUtils.copyFile(src, dest);
		
		
		// particular section screenshot
		
		//step one convert webdriver object to take screenshot interface
		
		//WebElement section = driver.findElement(By.xpath("//div[@class='container red']"));
		WebElement section = driver.findElement(By.xpath("//button[@name='dblClick']"));
		
		//step two get aScreenshotAs method to create a image
		File src= section.getScreenshotAs(OutputType.FILE);
				
		//File dest = new File("C:\\test\\workspace\\test\\Screenshot\\section.png");
		File dest = new File("C:\\test\\workspace\\test\\Screenshot\\doubleclick.png");
	
		//step 3 copy image file to destination
				
		FileUtils.copyFile(src, dest);
		
		
		
	}

}
