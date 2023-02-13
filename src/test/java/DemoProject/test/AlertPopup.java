package DemoProject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
								
		//maximize window
		driver.manage().window().maximize();
		
		driver.get("http://uitestpractice.com/Students/Switchto");
		
		//find alert button and perform click action
		//driver.findElement(By.xpath("//button[@id='alert']")).click();
		
		//switch to alert window and accept the alert
		//driver.switchTo().alert().accept(); //ok button click
		
		
		// confirm 
		
		//find alert button and perform click action
		//driver.findElement(By.xpath("//button[@id='confirm']")).click();
				
		//switch to alert window and accept the alert
		//driver.switchTo().alert().accept(); //ok button click
		
		//switch to alert window and dismiss the alert
		//driver.switchTo().alert().dismiss(); //cancel button click
		
		// prompt
		
		//find alert button and perform click action
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		
		//enter value in input
		driver.switchTo().alert().sendKeys("bhavesh");
		
		//switch to alert window and accept the alert
		driver.switchTo().alert().accept(); //ok button click
		
		
	}

}
