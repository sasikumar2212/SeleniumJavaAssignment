Feature: Functionality of Create Leaf Module

Scenario Outline: Create Lead

Given Enter the Username as 'DemoSalesManager'
Given Enter the Password as 'crmsfa'
When Click on the Login button
Then Welcome Page is displayed
When Click on CRM SFA click create 
When Click on Leads for Create
When Click Create Lead
When Enter Company Name as <companyName>
When Enter FristName as <firstName>
When Enter LastName as <lastName>
When Click Create Button
Then Result Page is displayed

Examples:
|companyName|firstName|lastName|
|'TestLeaf'|'Vidya'|'R'|
|'Sactech'|'Sasi'|'B'|