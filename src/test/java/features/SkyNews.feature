Feature: SkyNews homepage

Scenario: To verify the browser title
Given I navigate to SkyNews homepage
And I see that SkyNews homepage is loaded
Then I should verify the browser title

Scenario: to verify the available catergories in the homepage
Given I navigate to SkyNews homepage
And I see that SkyNews homepage is loaded
Then I should see the different catergories and their names in the homepage

Scenario: To verify the default focus page
Given I navigate to SkyNews homepage
And I see that SkyNews homepage is loaded
Then I should see focus point is Home Page
When I click on the Ocean Rescue link
Then I should see the Ocean Rescue as the focus point

Scenario: To verify the child tab title
Given I navigate to SkyNews homepage
And I select a article in the Homepage
Then I should see that given word "PM told" is available in the child page title
And I close the browser




