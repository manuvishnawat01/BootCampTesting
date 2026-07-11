Feature: Checking Payment test for Flipkart

Scenario: Test case 10: Verify Payment

Given User should open Chrome Browser
When Enter url in browser
Then User should Login into application
Then User should open Payment page
Then User should select UPI payment method
Then Type Valid UPI Account into UPI Edit field
Then User should click on Pay Now button
Then User should Verify Payment completed successfully
