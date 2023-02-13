package DemoProject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
								
		//maximize window
		driver.manage().window().maximize();
				
		//open url
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//find source and target web element
		WebElement source = driver.findElement(By.id("box6"));
		WebElement target = driver.findElement(By.id("box106"));
		
		Actions act = new Actions(driver);
		
		//dragAndDrop(source, targetElement)
		act.dragAndDrop(source, target).perform();
		
	}

}
