Feature: Functionality of Create Leaf Module

Scenario Outline: Create Lead

Given Enter the Username as 'DemoSalesManager'
Given Enter the Password as 'crmsfa'
When Click on the Login button 
Then Welcome Page is displayed 
When Click on CRM SFA click create DataTable
When Click on Leads for Create DataTable
When Click Create Lead DataTable
When Enter User Detaile from given "<SheetName>" and rownumber <RowNumber>
When Click Create Button DataTable
Then Result Page is displayed DataTable

Examples:
|SheetName|RowNumber|
|CreateLead|0|
|CreateLead|1|