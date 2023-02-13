package DemoProject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		

	}

}
