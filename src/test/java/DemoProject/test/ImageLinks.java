package DemoProject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//maximize window
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		//find web element image link
		driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
	
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
		driver.close();
		
		
		
	
	}

}
