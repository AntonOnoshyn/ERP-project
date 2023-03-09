Feature: Expenses Manager Access Different Modules

  Agile Story: As a user i should be able to access the different modules

  Scenario: As an Expenses manager, I should be able to access the different modules.

    Given user is on the log in page
    When user enter the valid credentials
    And user click log in
    Then user will have access to the 12 different modules