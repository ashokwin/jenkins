@reg @reg1
Feature: To Add tariff plan
  I want to use this template for my feature file

@smoke @sanity @functional
  Scenario: To test add tariff plan messages
    Given The user is in an telecom page
    And The user click the add tariff plan
    When The user is filling all the datas
      | monthy rental | Free loc min | Free Intern min | Free sms | local per min | Intern per min | sms per charges |
      |           100 |          200 |             300 |      400 |           501 |            600 |             700 |
      |           101 |          201 |             301 |      401 |           502 |            601 |             701 |
      |           102 |          202 |             302 |      402 |           503 |            602 |             702 |
      |           103 |          203 |             303 |      403 |           504 |            603 |             703 |
    And The user click the submit button
    Then The user should see the Congratulation you add Tariff Plan messages
