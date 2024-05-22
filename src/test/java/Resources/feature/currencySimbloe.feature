Feature: Currency symbol

  @currencySymbol
  Scenario: As a user, when I select Euro from currency drop bar all product on home page should have euro symbol to price
    Given I am on the homepage
    When I select Euro from currency drop menu bar
    Then All products on home page should have € symbol to price