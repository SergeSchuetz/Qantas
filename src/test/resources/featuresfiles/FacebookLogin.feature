Feature: Login to Facebook page
  As an employee of the company
  I want to login my employee profile using my credentials
  In order to collaborate with my colleagues

  @LoginFacebook
  Scenario: Login to the Facebook Page using email and password
    When I successfully login to Facebook with email "Serge_Schuetz@hotmail.com" and password "B33tl369Sharks16"
    Then the Facebook Welcome Page is successfully displayed

  Scenario: Login to the Facebook Page using default credentials
    When I successfully login to Facebook with default credentials
    Then the Facebook Welcome Page is successfully displayed
