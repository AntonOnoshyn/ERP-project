Feature: User is able to see correct information on the Documentation page

  Agile Story: As a user, I want to have access to different modules

  @doc
  Scenario: Verify user sees "Odoo Documentation" display message
    Given user uses valid credentials
    When user is able to click username tab and select Documentation from dropdown
    Then user is on the Documentation page and user sees "Odoo Documentation" displayed in header