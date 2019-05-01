package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FocusPageStepDefinition extends CommonBrowserStepDefinition {
	WebDriver driver = getDriver();

	@Then("^I should see focus point is Home Page$")
	public void i_should_see_focus_point_is_Home_Page() throws Throwable {
		Boolean focus = driver.findElement(By.xpath("//span[contains(text(),'Top Stories')]")).isDisplayed();
			if (focus==true)	{
				System.out.println("Focus is homepage");
			}
	}

	@When("^I click on the Ocean Rescue link$")
	public void i_click_on_the_Ocean_Rescue_link() throws Throwable {
		driver.findElement(By.linkText("Ocean Rescue")).click();
					}

	@Then("^I should see the Ocean Rescue as the focus point$")
	public void i_should_see_the_Ocean_Rescue_as_the_focus_point() throws Throwable {
		Boolean focus1=driver.findElement(By.xpath("//span[contains(text(),'Ocean Rescue')]")).isDisplayed();
		if (focus1==true)	{
			System.out.println("Focus is Ocean Rescue");
		}
		System.out.println("-------------------------------------------------------------");
	}

}
