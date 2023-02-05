package DemoProject.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open https://www.opencart.com/index.php?route=account/register
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement element = driver.findElement(By.id("input-country"));
		
		Select dropdown = new Select(element);
		
		//by text
		//dropdown.selectByVisibleText("Iceland");
		
		//by value
		//dropdown.selectByValue("98");
		
		//by index
		dropdown.selectByIndex(98);
		
		if(dropdown.isMultiple()==true) {
			System.out.println("is multiple");
		}else {
			System.out.println("is not multiple");
		}
		
		List <WebElement> allOptions = dropdown.getOptions();
	
		for(WebElement el : allOptions) {
			System.out.println(el.getText());
		}
	}

}
