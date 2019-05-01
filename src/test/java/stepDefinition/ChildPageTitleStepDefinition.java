package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChildPageTitleStepDefinition extends CommonBrowserStepDefinition {
	WebDriver driver = getDriver();

	@When("^I select a article in the Homepage$")
	public void i_select_a_article_in_the_Homepage() throws Throwable {
		WebElement headline = driver.findElement(By.xpath("//a[@class='sdc-site-tile__headline-link']"));
		headline.click();
		System.out.println("User selected an article");
	}

	@Then("^I should see that given word \"([^\"]*)\" is available in the child page title$")
	public void i_should_see_that_given_word_is_available_in_the_child_page_title(String arg1) throws Throwable {
		String articletitle = driver.getTitle();
		if (articletitle.contains(arg1)) {
			System.out.println("Child browser title is verified");
			
		} else {
			System.out.println("Browser title is not matching");
		}
		System.out.println("-------------------------------------------------------------");
	}
	
}
