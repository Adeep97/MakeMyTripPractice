#Author: Adeep
@Login
Feature: MakeMyTrip Login

  @ValidLogin
  Scenario: 
    Given I navigate to MakeMyTrip page
    Then I validate the page

  @InvalidLogin
  Scenario: 
    Given I navigate to MakeMyTrip page
    Then I validate the page for invalid scenario
