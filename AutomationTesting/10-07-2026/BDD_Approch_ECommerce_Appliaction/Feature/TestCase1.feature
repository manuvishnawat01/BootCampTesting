Feature: Checking Customer Registration test for Flipkart

Scenario: Test case 1: Verify Customer Registration

Given User should open Chrome Browser
When Enter url in browser
Then User should click on Sign Up button
Then Type Rahul Sharma into Name Edit field
Then Type rahul.test.mail into Email Edit field
Then Type 9876543210 into Mobile Number Edit field
Then Type Test@123 into Password Text field
Then User should click on Register button
Then User should Verify Customer account is created successfully
