Feature: Inventory Module Access
  Agile Story: User should be able to access to all 16 modules

  Scenario: As an Inventory manager, I should be able to access to the main modules.

    Given user is on the login page
    When user uses valid credentials
    Then user will have access to the 16 modules

