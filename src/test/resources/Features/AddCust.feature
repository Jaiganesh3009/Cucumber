#Author: your.email@your.domain.com
Feature: Add Cust
  User creating new account

  Scenario Outline: by using outline
    Given User launch telecom app
    And User navigates to add customer page
    When User enter all the fields "<Fname>","<Lname>","<Mail>","<Add>","<Phno>"
    And User clicks on submit button
    Then User is displayed customer id is generated

    Examples: 
      | Fname | Lname    | Mail            | Add     | Phno       |
      | jai   | ganesh   | jai@gmail.com   | chennai | 9876543210 |
      | akash | sundar   | akash@gmail.com | chennai | 8765432109 |
      | ravi  | chandran | ravi@gmail.com  | chennai | 7654321098 |
      | gopi  | madan    | gopi@gmail.com  | chennai | 6543210987 |
