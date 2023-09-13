Feature: Functionality for Merge Lead Module

Scenario: Merge Lead

Given Enter the Username as 'DemoSalesManager'
Given Enter the Password as 'crmsfa'
When Click on the Login button
Then Welcome Page is displayed
When Click CRMSFA for Merge
When Click lead for Merge
When Click MergeLead for Merge
When Click the lookup image for Merge
When Enter firstname on new window for Merge as 'sasikumar'
When Click Findlead Button for Merge
When Select First result for Merge
When Click the second lookup image for Merge
When Enter firstname on second new window for Merge as 'kayal'
When Click Findlead Button on second new window for Merge
When Select First result on second window for Merge
When Click Merge button for Merge
When Click Findlead Button for Merge
When Enter lead id for merge
Then Get the lead and check the if merch