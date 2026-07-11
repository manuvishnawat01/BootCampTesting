Feature: Checking Login test for Flipkart

Scenario: Test case 2: Verify Customer Login

Given User should open Chrome Browser
When Enter url in browser
Then User should click on Login button
Then Type Registered Customer Email into Email Edit field
Then Type Valid Password into Password Text field
Then User should click on Login button
Then User should Verify Home page is displayed
Then User should Verify Login successful
