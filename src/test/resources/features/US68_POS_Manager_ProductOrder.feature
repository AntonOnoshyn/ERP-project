@Anton
Feature: POS manager should be able to view product order
  Agile Story: As a Point of Sale manager (POS), I should be able to view product order

  Background: User logged in as POS manager
    When POS manager types username
    And POS manager types password
    Then POS manager Clicks login button


 Scenario: POS managers product order functionality
    Given    POS manager is on the Point Of Sale page
    When   POS manager checking Order Reference
    Then    All orders should be checked

 Scenario: POS manager Point of Sale page Action drop down functionality
   Given    POS manager is on the Point Of Sale page
   When   POS manager checking Order Reference
   Then    Action drop down should have 3 options: Import, Export, Delete