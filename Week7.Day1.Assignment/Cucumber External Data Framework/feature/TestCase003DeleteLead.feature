Feature: Functionality for Delete Lead Module

Scenario Outline: Delete Lead

Given Enter the Username as 'DemoSalesManager'
Given Enter the Password as 'crmsfa'
When Click on the Login button
Then Welcome Page is displayed
When Click on CRM_SFA click delete
When Click on Leads for Delete
When Click Find Lead
When Click Phone 
When Delete the lead using external data sheetname "<SheetName>" and rownumber <RowNumber>
When Click Find Again
When Click Phone Again
When Enter Phone Number Again
When Click Find Lead Button Again
Then Result Message

Examples:
|SheetName|RowNumber|
|DeleteLead|0|
