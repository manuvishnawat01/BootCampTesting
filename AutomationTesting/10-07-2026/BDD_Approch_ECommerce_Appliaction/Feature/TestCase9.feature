Feature: Checking Checkout test for Flipkart

Scenario: Test case 9: Verify Checkout

Given User should open Chrome Browser
When Enter url in browser
Then User should Login into application
Then User should open Shopping Cart
Then User should click on Checkout button
Then Type Greater Noida, Uttar Pradesh into Shipping Address field
Then User should Verify Order Summary page is displayed
Then User should Verify Checkout page opened successfully
