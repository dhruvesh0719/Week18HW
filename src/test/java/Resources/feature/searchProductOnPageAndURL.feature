Feature: Searched product should dispalay on page and product name should be at the end of URL

  @SearchProductNameAndURL
  Scenario: As a user, when I search a product, that product name should display with all products name and product name should display at the end of URL
    Given I am on the homepage
    When I type product name in search bar
    And I click on search button
    Then All products on home page should have product name on display
    And Product name should be at the end of URL