#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login to daraz application

  Scenario Outline: Login to Daraz.pk app
    Given I have opened daraz app
    And I Skipp to the app
    And I click at account app
    And I click to login button app
    And I click at login with password button app
    And I have given email and password in App
    And I click at login button app
    And I click at settings icon
    And I click at addressBook
    And I Verify the AdressDetail
