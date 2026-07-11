Feature: Checking Customer Registration for Internet Banking Application

Scenario: Test Case 1: Verify Customer Registration

Given User should open Chrome Browser
When Enter Banking Application URL in browser
Then User should click on Register Now button
Then Type Rahul Sharma into Customer Name Edit field
Then Type rahul@test.com into Email Edit field
Then Type 9876543210 into Mobile Number Edit field
Then Type CUST1001 into Customer ID Edit field
Then Type Test@123 into Password Text field
Then User should click on Register button
Then User should Verify Customer account is created successfully
