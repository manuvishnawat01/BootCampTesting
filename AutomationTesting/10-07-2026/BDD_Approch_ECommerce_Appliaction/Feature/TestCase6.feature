Feature: Checking Update Cart test for Flipkart

Scenario: Test case 6: Verify Update Cart

Given User should open Chrome Browser
When Enter url in browser
Then User should Login into application
Then User should open Shopping Cart
Then User should change Product Quantity to 2
Then User should click on Update Cart button
Then User should Verify updated quantity is displayed
Then User should Verify Cart total is updated
