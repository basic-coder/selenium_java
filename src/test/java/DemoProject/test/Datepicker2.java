package DemoProject.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String expectedDay = "13";
		String expectedMonthYear = "Apr 2023";
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		//maximize window
		driver.manage().window().maximize();
				
		//open url
		driver.get("https://www.redbus.in/");
		
		//switch to iframe
		//driver.switchTo().frame(0);
		
		//find datepicker web element
		WebElement datepicker =  driver.findElement(By.id("onward_cal"));

		datepicker.click();
		
		while(true) {
			String calenderMonthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			if(calenderMonthYear.equals(expectedMonthYear)) {
					 
				driver.findElement(By.xpath("//td[text()='"+ expectedDay +"']")).click();
						
				break;
								
			}else {
				driver.findElement(By.xpath("//td[@class='next']")).click();			
			}
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
