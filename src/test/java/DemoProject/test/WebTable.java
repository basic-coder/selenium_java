package DemoProject.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
								
		//maximize window
		driver.manage().window().maximize();
		
		//open url local
		//driver.get("C:\\test\\workspace\\test\\table.html");
		
		//find second cell in web table
		//String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText(); 
	
		//System.out.println(text);
		
		// number of rows
		//List <WebElement> rowList = driver.findElements(By.xpath("//table/tbody/tr"));
		
		//System.out.println("total number of : " + rowList.size());
		
		//number of column
		//List <WebElement> colList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		
		//System.out.println("total number of columns : " + colList.size());
	
		//for(int r = 2; r <= rowList.size(); r++) {
			//for(int c=1;c <= colList.size(); c++) {
				//String data = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]")).getText();
				
				//System.out.println(data);
			//}
		//}
		
		//open url external
		driver.get("http://testautomationpractice.blogspot.com");
		
		//find 
		List <WebElement> rowList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		
		System.out.println("total number of : " + rowList.size());
		
		//number of column
		List <WebElement> colList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
				
		System.out.println("total number of columns : " + colList.size());
		
		for(int r = 2; r <= rowList.size(); r++) {
		for(int c=1;c <= colList.size(); c++) {
			String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
			
			System.out.println(data);
			}
		}
	}

}
