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
Feature: Login to daraz

  Scenario Outline: Login to Daraz.pk
    Given browser window is open
    Given I have arrived at daraz.pk
    And I clicked at login button.
    And I have given username and password
    And I click at login button
    And I should arrive at daraz.pk
    And I Have clicked on manage account.
    And I have clicked on add address book.
    And I have given full name.
    And I have given phone number.
    And I have choosed province
    And I have choosed city
    And I have choosed area.
    And I have given Adress.
    And I have clicked Home.
    Then I have clicked save button.
    Then It should save my address.
