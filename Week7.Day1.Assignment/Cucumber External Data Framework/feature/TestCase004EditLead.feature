Feature: Functioality of Edit Lead Module

Scenario Outline: Edit Lead

Given Enter the Username as 'DemoSalesManager'
Given Enter the Password as 'crmsfa'
When Click on the Login button
Then Welcome Page is displayed
When Click CRMSFA for EditLead
When Click lead for EditLead
When Click FindLead for EditLead
When Click Phone tab for EditLead
When Edit Lead using external data sheetname "<SheetName>" and rownumber <RowNumber>
Then Click Submit Button for EditLead

Examples:
|SheetName|RowNumber|
|EditLead|0|