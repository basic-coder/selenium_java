package DemoProject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
						
		//maximize browser
		driver.manage().window().maximize();
	
		//open url
		driver.get("http://uitestpractice.com/Students/Index");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//search text in search box 
		js.executeScript("document.getElementById('Search_Data').value='Aliya'");
		
		//click on find
		//js.executeScript("document.querySelector('[value=\"Find\"]').click()");
		
		// OR 
		WebElement element = driver.findElement(By.xpath("//input[@value='Find']"));
		//js.executeScript("arguments[0].click()",element);
		
		//refresh page
		//driver.navigate().refresh(); //using selinium
		//js.executeScript("history.go(0)");
		
		//fetch domain 
		//String domain = js.executeScript("return document.domain;").toString();
		//System.out.println(domain);
		
		//fetch title
		//String title = js.executeScript("return document.title;").toString();
		//System.out.println(title);
				
		//fetch domain 
		//String url = js.executeScript("return document.URL;").toString();
		//System.out.println(url);
		
		//draw border around web element
		//js.executeScript("arguments[0].style.border='3px solid red'", element);
		
		//to zoom page
		//js.executeScript("document.body.style.zoom = '50%'");
		
		//to get height and weight of web page
		//String height = js.executeScript("return window.innerHeight;").toString();
		//String width = js.executeScript("return window.innerWidth;").toString();
		//System.out.println("height : "+ height +"\n"+ "width : " + width);
		
		//to perform scroll to end
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//to perform scroll to top
		//js.executeScript("window.scrollBy(document.body.scrollHeight,0)");
		
		//to generate alert popup
		//js.executeScript("alert('this is an alert message')");
		
		// to navigate to url
		//js.executeScript("window.location='https://www.google.com'");
		
		//to flash web element
		
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0;i<50;i++) {
			js.executeScript("arguments[0].style.backgroundColor='#000'", element);
			
			
			try {
				Thread.sleep(20); //20ms
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		js.executeScript("arguments[0].style.backgroundColor='"+ bgcolor + "'", element);
		
		//fetch title by creating utility
		String title = JavascriptUtility.getTitleByJS(driver);
		System.out.println(title);
		
		
	}
}
