package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonBrowserStepDefinition {
protected static WebDriver driver;
	
	protected WebDriver getDriver() {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeep.local\\eclipse-workspace\\SKY_Assignment\\src\\main\\java\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
				}
		return driver;
}
}
