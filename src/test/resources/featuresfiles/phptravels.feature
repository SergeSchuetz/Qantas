Feature: Smoke test Phptravels page
  As an employee of the company
  I want to access the phptravels page
  In order to smoke test booking hotels, flights or tours

  @AccessPhpTravels
  Scenario: Smoke test phptravels by booking hotels, flights or tours
    When I access the phptravels page
    Then book hotels
    And book flights