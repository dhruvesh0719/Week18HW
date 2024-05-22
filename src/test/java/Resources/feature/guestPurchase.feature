Feature: Guest purchase

  @AsGuestPurchase
  Scenario: As a user, I should able to purchase product as a guest
    Given I am on the homepage
    When I select a product
    When I add to cart
    When I select Shopping cart
    When I accept Gift Wrapping and Terms and condition and click on CHECKOUT
    When I select Checkout as guest
    When I enter Billing details
    When I select shipping method
    When I select payment method
    When I entre payment details
    When I confirm the order
    Then I get Your order has been successfully processed!message

