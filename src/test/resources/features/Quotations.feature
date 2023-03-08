Feature: Sales or POS manager should see correct information on quotations page
  Agile Story: As a POS & sales manager, I should be able to get correct information on the Sales page.

@first
Scenario Outline: POS and sales manager see six columns on the quotations page
Given user enters POS manager or Sales manager "<username>" and "<password>"
When user clicks on sales tab and lands on quotation page
Then user sees column one named "Quotation Number"
And user sees column two named "Quotation Date"
And user sees column three named "Customer"
And user sees column four named "Salesperson"
And user sees column five named "Total"
And user sees column six named "Status"
  Examples:
    | username | password |
  | posmanager155@info.com|posmanager|
  |salesmanager6@info.com |salesmanager|