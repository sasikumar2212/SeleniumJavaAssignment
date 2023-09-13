Feature: Functionality of Duplicate lead module

Scenario Outline: Duplicate Lead

Given Enter the Username as 'DemoSalesManager'
Given Enter the Password as 'crmsfa'
When Click on the Login button
Then Welcome Page is displayed
When Click CRMSFA for Dup
When Click lead for Dup
When Click FindLead for Dup
When Click Phone tab for Dup
When Create Duplecate Lead using External Data sheetname "<SheetName>" and rownumber <RowNumber>
Then Click Submit Button for Dup

Examples:
|SheetName|RowNumber|
|DuplicateLead|0|