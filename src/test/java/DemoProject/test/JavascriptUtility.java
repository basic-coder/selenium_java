package DemoProject.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascriptUtility {
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
}
