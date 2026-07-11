Feature: Checking Order Confirmation test for Flipkart

Scenario: Test case 11: Verify Order Confirmation

Given User should open Chrome Browser
When Enter url in browser
Then User should Login into application
Then User should complete Payment successfully
Then User should click on Confirm Order button
Then User should wait for Order Processing
Then User should Verify Order Confirmation page is displayed
Then User should Verify Order ID is generated successfully
