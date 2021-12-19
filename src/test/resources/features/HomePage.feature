#Author: Tek School - Ramez Hassan
#Keywords Summary : Capstone Final Project Scenarios 
#Feature: List of scenarios 2
#Scenario: Business rule through list of steps with arguments.
Feature: Home Page
@Smoke2
Scenario: User verify currency values change
Given User is on Retail website
When User click on Currency
And User Chose Euro from dropdown
Then currency value should change to Euro
@Smoke2
Scenario: User empty Shopping cart message displays
Given User is on Retail website
When User click on shopping cart
Then “Your shopping cart is empty!” message should display