package DemoProject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		//maximize window
		driver.manage().window().maximize();
		
		//open url external
		driver.get("http://testautomationpractice.blogspot.com");
				
		//expected tooltip
		String expectedToolTip = "We ask for your age only for statistical purposes.";
		
		//find web element
		String actualToolTip = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");
		
		//System.out.println(actualToolTip);
		//System.out.println(expectedToolTip);
		if(actualToolTip.equals(expectedToolTip)) {
			System.out.println("test passed");
		}else {
			System.out.println("test failed");
		}
	}

}
