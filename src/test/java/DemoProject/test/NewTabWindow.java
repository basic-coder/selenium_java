package DemoProject.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.google.com");
		System.out.println("first Tab" + driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/");
		System.out.println("second Tab" + driver.getTitle());
		
		//get window handles of windows
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		
		driver.close();
		driver.switchTo().window(handles.get(0)); //switch to google.com
	}

}
