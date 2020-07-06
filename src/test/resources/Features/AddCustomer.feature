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

  Scenario: two dimensional list
    Given User launches telecom application
    And User navigates into add customer page
    When User enters all the fields by using 2dim list
      | jai   | ganesh   | jai@gmail.com   | chennai | 9876543210 |
      | akash | sundar   | akash@gmail.com | chennai | 8765432109 |
      | ravi  | chandran | ravi@gmail.com  | chennai | 7654321098 |
      | gopi  | madan    | gopi@gmail.com  | chennai | 6543210987 |
    And User click on submit button
    Then User should be displayed customer id is generated

  Scenario: two dimensional map
    Given User launches telecom application
    And User navigates into add customer page
    When User enters all the fields by using 2dim map
      | fname | lname    | mail            | add     | phno       |
      | jai   | ganesh   | jai@gmail.com   | chennai | 9876543210 |
      | akash | sundar   | akash@gmail.com | chennai | 8765432109 |
      | ravi  | chandran | ravi@gmail.com  | chennai | 7654321098 |
      | gopi  | madan    | gopi@gmail.com  | chennai | 6543210987 |
    And User click on submit button
    Then User should be displayed customer id is generated

  Scenario Outline: by using outline
    Given User launches telecom application
    And User navigates into add customer page
    When User enters all the fields "<Fname>","<Lname>","<Mail>","<Add>","<Phno>"
    And User click on submit button
    Then User should be displayed customer id is generated

    Examples: 
      | Fname | Lname    | Mail            | Add     | Phno       |
      | jai   | ganesh   | jai@gmail.com   | chennai | 9876543210 |
      | akash | sundar   | akash@gmail.com | chennai | 8765432109 |
      | ravi  | chandran | ravi@gmail.com  | chennai | 7654321098 |
      | gopi  | madan    | gopi@gmail.com  | chennai | 6543210987 |
