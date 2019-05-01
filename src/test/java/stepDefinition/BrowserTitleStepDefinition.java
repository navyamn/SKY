package stepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Then;

@RunWith(Cucumber.class)
public class BrowserTitleStepDefinition extends CommonBrowserStepDefinition {
	WebDriver driver = getDriver();

	@Then("^I should verify the browser title$")
	public void i_should_verify_the_browser_title() throws Throwable {
		String title = driver.getTitle();
		if (title.contains("The Latest News from the UK and Around the World | Sky News")) {
			System.out.println("Browser title is verified");
			System.out.println(title);
		} else {
			System.out.println("Browser title is not matching");
		}
		System.out.println("-------------------------------------------------------------");
	}
}
