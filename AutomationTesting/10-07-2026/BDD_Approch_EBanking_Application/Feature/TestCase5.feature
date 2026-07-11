Feature: Checking Fund Transfer for Internet Banking Application

Scenario: Test Case 5: Verify Fund Transfer

Given User should login into Internet Banking Application
When User should click on Fund Transfer menu
Then User should select Beneficiary Account
Then Type 5000 into Amount Edit field
Then User should click on Continue button
Then Type 123456 into OTP Edit field
Then User should click on Confirm button
Then User should Verify Fund Transfer is completed successfully
