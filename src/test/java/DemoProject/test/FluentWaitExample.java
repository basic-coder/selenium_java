package DemoProject.test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Stopwatch;

public class FluentWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
								
		//maximize browser
		driver.manage().window().maximize();
						
		//open url
		driver.get("https://www.ebay.in/");
						
		//Fluent wait of 10 seconds
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		
		Stopwatch watch = null;
		try {
		//find webelement
		watch = Stopwatch.createStarted();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
		driver.findElement(By.linkText("START SELLING")).click();
		}catch(Exception e) {
		watch.stop();
		System.out.println(watch.elapsed(TimeUnit.SECONDS));
		System.out.println(e);
		}

	}

}
