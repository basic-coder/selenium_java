package DemoProject.test;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//wait 10 second
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open url
		driver.get("http://www.deadlinkcity.com");
		
		//find hyperlinks
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		int resCode = 200;
		int brokenLinkCount = 0;
		
		System.out.println("total links : " + linkList.size());
		
		for(WebElement el : linkList) {
			String url = el.getAttribute("href");
			
			try {
				URL urlLink = new URL(url);
				HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				resCode = huc.getResponseCode();
				
				if(resCode >= 400) {
					System.out.println(url+ " broken link");
					brokenLinkCount++;
					
				}
				
			}catch(MalformedURLException e){
				
			}
			catch(Exception e) {
				
			}
		}
		
		System.out.println("total broken link : " + brokenLinkCount);
		
		driver.close();
		

	}

}
