package DemoProject.test;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadFile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		//maximize window
		driver.manage().window().maximize();
				
		//get url
		driver.get("https://demoqa.com/upload-download");
		
		//find webelement choose file
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\Windows\\Downloads\\test.pdf");
		
		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		Robot rb = new Robot();
		
		rb.delay(2000);
		
		//copy to clipboard
		StringSelection ss = new StringSelection("C:\\Users\\Windows\\Downloads\\test.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//perform ctrl +v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	
	}

}
