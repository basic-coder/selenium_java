package DemoProject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// launch chrome web browser
				
				//(key,location)
				//please check the chrome version and driver version while installing
		 		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
			
				WebDriver driver = new ChromeDriver();
				
				//launch google
				driver.navigate().to("http:\\www.google.com");
				
				//capture title from google.com
				
				String title = driver.getTitle();
				
				System.out.println("Page title : "+ title);
				
				//capture url of the webpage
				
				String testurl =  driver.getCurrentUrl();
				
				System.out.println("URL : "+ testurl);
				
				// output
				
//				Page title : Google
//				URL : https://www.google.com/?gws_rd=ssl
				
				// to get page source
				
				System.out.println("URL : "+ driver.getPageSource());

	}

}
