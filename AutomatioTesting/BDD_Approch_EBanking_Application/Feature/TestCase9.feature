Feature: Checking Change Password for Internet Banking Application

Scenario: Test Case 9: Verify Change Password

Given User should login into Internet Banking Application
When User should click on Change Password menu
Then Type Test@123 into Current Password Text field
Then Type Bank@456 into New Password Text field
Then Type Bank@456 into Confirm Password Text field
Then User should click on Submit button
Then User should Verify Password is changed successfully
