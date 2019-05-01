package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;

public class CatergoriesStepDefinition extends CommonBrowserStepDefinition {
	WebDriver driver = getDriver();

	@Then("^I should see the different catergories and their names in the homepage$")
	public void i_should_see_the_different_catergories_and_their_names_in_the_homepage() throws Throwable {
		List<WebElement> catergories=driver.findElements(By.xpath("//a[@class='sdc-site-header__menu-item-link']"));
		int size = catergories.size();
		for(int i=15; i<size; i++) {
			String text= catergories.get(i).getAttribute("innerText");
			System.out.println(text);
			
		}
				System.out.println("number of categories: " +size/2 );	
				
		System.out.println("-------------------------------------------------------------");
	}

}
