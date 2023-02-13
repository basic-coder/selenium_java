package DemoProject.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplictWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//maximize browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.ebay.in/");
		
		//10 seconds implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Stopwatch watch = null;
		try {
		//find webelement
			watch = Stopwatch.createStarted();
		driver.findElement(By.linkText("START SELLING.")).click();
		}catch(Exception e) {
			watch.stop();
			System.out.println(watch.elapsed(TimeUnit.SECONDS));
			System.out.println(e);
		}

	}

}
