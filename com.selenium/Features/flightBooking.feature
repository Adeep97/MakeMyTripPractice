#Author: Adeep
@FlightBooking
Feature: MakeMyTrip Flight Booking

  @ValidFlightBooking
  Scenario: 
    Given I navigate to MakeMyTrip page
    And I select trip type
    And I select from city
    And I select to city
    And I select departure date
    And I select return date
    And I select travellers
    And I select special fare
    Then I search for my flight