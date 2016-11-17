Feature: Search for a Product on Amazon.com
  Scenario: Search result check
    Given I opened www.amazon.com website
    When I search for a product Playstation
    Then Playstation searches are displayed
    And 12 results are displayed

  Scenario: Go into Details of First Listed Product
    Given I opened www.amazon.com website
    When I search for a product Playstation
    Then Select first product
