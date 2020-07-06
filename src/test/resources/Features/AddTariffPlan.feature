#Author: your.email@your.domain.com
Feature: Add Tariff Plan
  User creating new tariff plan

  Scenario: Hardcoded Info
    Given User launch telecom application
    And User navigates into tariff plan page
    When User fills all the fields
    And User click on Tariff submit button
    Then User is displayed with the message tariff plan created

  Scenario: one dim list
    Given User launch telecom application
    And User navigates into tariff plan page
    When User fills all the fields by using 1dim list
      | 1000 | 5000 | 200 | 100 | 2 | 50 | 1 |
    And User click on Tariff submit button
    Then User is displayed with the message tariff plan created

  Scenario: one dim map
    Given User launch telecom application
    And User navigates into tariff plan page
    When User fills all the fields by using 1dim map
      | rental          | 1000 |
      | local_minutes   | 5000 |
      | inter_minutes   |  200 |
      | sms_pack        |  100 |
      | minutes_charges |    2 |
      | inter_charges   |   50 |
      | sms_charges     |    1 |
    And User click on Tariff submit button
    Then User is displayed with the message tariff plan created

  Scenario: two dim list
    Given User launch telecom application
    And User navigates into tariff plan page
    When User fills all the fields by using 2dim list
      | 1000 | 5000 | 200 | 100 | 2 | 50 | 1 |
      |  900 | 4500 | 300 | 200 | 3 | 40 | 2 |
      |  800 | 4000 | 400 | 300 | 4 | 30 | 3 |
      |  700 | 3500 | 500 | 400 | 5 | 20 | 4 |
    And User click on Tariff submit button
    Then User is displayed with the message tariff plan created

  Scenario: two dim map
    Given User launch telecom application
    And User navigates into tariff plan page
    When User fills all the fields by using 2dim map
      | rental | local_minutes | inter_minutes | sms_pack | minutes_charges | inter_charges | sms_charges |
      |   1000 |          5000 |           200 |      100 |               2 |            50 |           1 |
      |    900 |          4500 |           300 |      200 |               3 |            40 |           2 |
      |    800 |          4000 |           400 |      300 |               4 |            30 |           3 |
      |    700 |          3500 |           500 |      400 |               5 |            20 |           4 |
    And User click on Tariff submit button
    Then User is displayed with the message tariff plan created

  Scenario Outline: using outline
    Given User launch telecom application
    And User navigates into tariff plan page
    When User fills all the fields "<rental>","<local_minutes>","<inter_minutes>","<sms_pack>","<minutes_charges>","<inter_charges>","<sms_charges>",
    And User click on Tariff submit button
    Then User is displayed with the message tariff plan created

    Examples: 
      | rental | local_minutes | inter_minutes | sms_pack | minutes_charges | inter_charges | sms_charges |
      |   1000 |          5000 |           200 |      100 |               2 |            50 |           1 |
      |    900 |          4500 |           300 |      200 |               3 |            40 |           2 |
      |    800 |          4000 |           400 |      300 |               4 |            30 |           3 |
      |    700 |          3500 |           500 |      400 |               5 |            20 |           4 |
