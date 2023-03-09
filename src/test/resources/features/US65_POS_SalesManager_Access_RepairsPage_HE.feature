Feature: Repairs function access
  US-  As a POS & sales manager, I want to access the Repairs page.

  Background: User is on log in page

  @wipH
  Scenario Outline: POS and sales manager see six columns on the Repairs page
    Given user enters POS manager or Sales manager "<username>" and "<password>"
    When user clicks on Repairs tab and lands on Repairs page
    Then POS manager should see the below columns
      | Repair Reference    |
      | Product to Repair   |
      | Customer            |
      | Delivery Address    |
      | Warranty Expiration |
      | Status              |

    Examples:
      | username               | password     |
      | posmanager155@info.com | posmanager   |
      | salesmanager6@info.com | salesmanager |