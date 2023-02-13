package DemoProject.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//maximize window
		driver.manage().window().maximize();
		
		//get url
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		
		//find radio buttons
		List <WebElement> radioElementList = driver.findElements(By.xpath("//input[@type='radio']"));
		
		//print total number of radio buttons
		System.out.println("Total no of radio on web page: " + radioElementList.size());
		
		driver.close();

	}

}
