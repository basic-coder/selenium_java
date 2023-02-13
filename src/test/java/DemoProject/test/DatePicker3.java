package DemoProject.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedDay = "13";
		String expectedMonthYear = "April 2023";
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		//maximize window
		driver.manage().window().maximize();
				
		//open url
		driver.get("https://www.goibibo.com/");
		
		//switch to iframe
		//driver.switchTo().frame(0);
		
		//find datepicker web element
		WebElement datepicker =  driver.findElement(By.xpath("//body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]"));

		datepicker.click();
		
		while(true) {
			String calenderMonthYear = driver.findElement(By.xpath("//div[@class='sc-ikJyIC cLTzBM']")).toString();
			
			
			if(calenderMonthYear.equals(expectedMonthYear)) {
				List <WebElement> daysList = driver.findElements(By.xpath("//p[@class='fsw__date']"));
				for(WebElement e:daysList) {
					String calenderDay = e.getText();
					
					if(calenderDay.equals(expectedDay)) {
						e.click();
						driver.findElement(By.xpath("//td[@class='fswTrvl__done']")).click();	
						break;
					}
				}
				break;
			}else {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();			
			}
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
