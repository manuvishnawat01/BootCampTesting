Feature: Checking Add Beneficiary for Internet Banking Application

Scenario: Test Case 6: Verify Add Beneficiary

Given User should login into Internet Banking Application
When User should click on Add Beneficiary menu
Then Type Amit Kumar into Beneficiary Name Edit field
Then Type 123456789012 into Account Number Edit field
Then Type ABCD0001234 into IFSC Code Edit field
Then User should click on Add button
Then Type 123456 into OTP Edit field
Then User should click on Confirm button
Then User should Verify Beneficiary is added successfully
