Feature: Checking Transaction History for Internet Banking Application

Scenario: Test Case 8: Verify Transaction History

Given User should login into Internet Banking Application
When User should click on Transaction History menu
Then User should select From Date as 01-07-2026
Then User should select To Date as 10-07-2026
Then User should click on Search button
Then User should Verify Transaction History is displayed successfully
