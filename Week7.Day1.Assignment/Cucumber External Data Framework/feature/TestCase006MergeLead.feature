Feature: Functionality for Merge Lead Module

Scenario Outline: Merge Lead

Given Enter the Username as 'DemoSalesManager'
Given Enter the Password as 'crmsfa'
When Click on the Login button
Then Welcome Page is displayed
When Click CRMSFA for Merge
When Click lead for Merge
When Click MergeLead for Merge
When Merge Lead using External data sheetname "<SheetName>" and rownumber <RowNumber>
When Enter lead id for merge
Then Get the lead and check the if merch

Examples:
|SheetName|RowNumber|
|MeargeLead|0|