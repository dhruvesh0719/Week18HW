Feature: Refer a product to friend

  @referProductToFriend
  Scenario: As a registered user, I should able able to refer a product to friend
    Given I am a registered user
    When I select Electronics
    When Select Camera & photo
    When Select Leica T Mirrorless Digital Camera
    When Select email a friend
    When Enter Friend's email address
    And Entre my email address
    And Entre personal message
    And click on Send email button
    Then success message should display