@reg @reg1
Feature: To add the tariff Plan
  I want to use this template for my feature file

@smoke @sanity 
  Scenario Outline: To test the add tariff plan messages
    Given The user is in an telecom website
    And The user click on add the tariff plan
    When The user is filling all the data"<monthlyrental>","<freelocalmin>","<freeinternataionalmin>","<freesmspack>","<localperminschrge>","<internatinalpermin>","<smscharge>"
    And The user click the submit Button
    Then The user should see the Congratulation you Add Tariff Plan message

    Examples: 
      | monthlyrental | freelocalmin | freeinternataionalmin | freesmspack | localperminschrge | internatinalpermin | smscharge |
      |           100 |          200 |                   300 |         400 |               504 |                600 |      700 |
      |           102 |          205 |                   301 |         405 |               506 |                601 |      704 |
      |           101 |          204 |                   305 |         409 |               508 |                608 |      709 |
      