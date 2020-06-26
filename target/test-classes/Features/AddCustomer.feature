#Author: your.email@your.domain.com
Feature: Add Customer
  User creating new account

  Scenario: Hardcoded
    Given User launches telecom application
    And User navigates into add customer page
    When User enters all the fields
    And User click on submit button
    Then User should be displayed customer id is generated

  Scenario: one dimensional list
    Given User launches telecom application
    And User navigates into add customer page
    When User enters all the fields by using 1dim list
      | jai | ganesh | jai@gmail.com | chennai | 9876543210 |
    And User click on submit button
    Then User should be displayed customer id is generated

  Scenario: one dimensional map
    Given User launches telecom application
    And User navigates into add customer page
    When User enters all the fields by using 1dim map
      | fname | jai           |
      | lname | ganesh        |
      | mail  | jai@gmail.com |
      | add   | chennai       |
      | phno  |    9876543210 |
    And User click on submit button
    Then User should be displayed customer id is generated