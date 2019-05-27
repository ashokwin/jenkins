@reg 
Feature: Add tariff plan
  I want to use this template for my feature file
  
 Background:
 Given The user is in an telecom Homepage
    And The user click on add tariff plan
    

 @smoke @functional @karthi
  Scenario: To test add tariff plan message
   
    When The user is filling all the field
    |100|200|300|400|501|600|700|
    |101|201|301|401|502|601|701|
    |102|202|302|402|503|602|702|
    |103|203|303|403|504|603|703|
    And The user clicks submit button
    Then The user should see the Congratulation you add Tariff Plan message
  
    @smoke @functional 
  Scenario: To test add tariff plan message
    
    When The user is filling all the field
    |100|200|300|400|501|600|700|
    |201|201|301|401|502|601|701|
    |302|202|302|402|503|602|702|
    |403|203|303|403|504|603|703|
   And The user clicks submit button
    Then The user should see the Congratulation you add Tariff Plan message
       
       @smoke @functional
  Scenario: To test add tariff plan message
    
    When The user is filling all the field
    |500|200|300|400|501|600|700|
    |601|201|301|401|502|601|701|
    |702|202|302|402|503|602|702|
    |603|203|303|403|504|603|703|
    And The user clicks submit button
    Then The user should see the Congratulation you add Tariff Plan message