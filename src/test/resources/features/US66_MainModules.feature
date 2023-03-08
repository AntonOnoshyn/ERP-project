Feature:POS manager should be able to access the main modules.
  User Story: As a POS manager, I should be able to access the main modules.
  Background: For all scenarios user is on the login page

  Scenario: As a POS manager, I should be able to access the main modules.
    Given user put valid username
    When user put valid password
    And user login on the page
    Then user should be able to access to the 22 modules

