package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class CommonPageStepDefinition extends CommonBrowserStepDefinition {
	WebDriver driver = getDriver();

	@Given("^I navigate to SkyNews homepage$")
	public void i_navigate_to_SkyNews_homepage() throws Throwable {
		driver.get("https://news.sky.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@And("^I see that SkyNews homepage is loaded$")
	public void i_see_that_SkyNews_homepage_is_loaded() throws Throwable {
		int k = driver.findElements(By.xpath("//button[contains(text(),'Accept')]")).size();
		if (k > 0) {
			driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();

		}

	}

	@And("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		driver.close();
	}
}
