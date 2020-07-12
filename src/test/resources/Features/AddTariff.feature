#Author: your.email@your.domain.com
Feature: Add Tariff
  User create new tariff plan

  Background: 
    And User navigate into tariff plan page

  @sanity @jai
  Scenario: two dimen list
    When User fills all the fields by using 2dimen list
      | 1000 | 5000 | 200 | 100 | 2 | 50 | 1 |
      |  900 | 4500 | 300 | 200 | 3 | 40 | 2 |
      |  800 | 4000 | 400 | 300 | 4 | 30 | 3 |
      |  700 | 3500 | 500 | 400 | 5 | 20 | 4 |
    And User clicks on Tariff submit button
    Then User is displayed with message tariff plan created

  @sanity @jai
  Scenario: two dimen map
    When User fills all the fields by using 2dimen map
      | rental | local_minutes | inter_minutes | sms_pack | minutes_charges | inter_charges | sms_charges |
      |   1000 |          5000 |           200 |      100 |               2 |            50 |           1 |
      |    900 |          4500 |           300 |      200 |               3 |            40 |           2 |
      |    800 |          4000 |           400 |      300 |               4 |            30 |           3 |
      |    700 |          3500 |           500 |      400 |               5 |            20 |           4 |
    And User clicks on Tariff submit button
    Then User is displayed with message tariff plan created

  Scenario Outline: using outline
    When User fills all of the fields "<rental>","<local_minutes>","<inter_minutes>","<sms_pack>","<minutes_charges>","<inter_charges>","<sms_charges>",
    And User click on Tariff submit button
    Then User is displayed with message tariff plan created

    Examples: 
      | rental | local_minutes | inter_minutes | sms_pack | minutes_charges | inter_charges | sms_charges |
      |   1000 |          5000 |           200 |      100 |               2 |            50 |           1 |
      |    900 |          4500 |           300 |      200 |               3 |            40 |           2 |
      |    800 |          4000 |           400 |      300 |               4 |            30 |           3 |
      |    700 |          3500 |           500 |      400 |               5 |            20 |           4 |
