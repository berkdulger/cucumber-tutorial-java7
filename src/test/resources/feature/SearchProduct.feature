Feature: Search for a Product
  Scenario: Search result check
    Given I opened www.amazon.com website
    When I search for a product Playstation 4 Pro
    Then Playstation 4 Pro searches are displayed

  Scenario: Number of results check
    Given I opened www.amazon.com website
    When I search for a product Playstation 4 Pro
    Then 12 results are displayed
