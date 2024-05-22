Feature: nopCommerce new release comment

  @NewReleaseComment
  Scenario: As a user, when I comment on new relase news it should be at the bottom of the list
    Given I am on the homepage
    When I select DETAILS from news section of nopCommerce new release
    When I type Title
    And I type comment
    And Click on NEW COMMENT button
    Then News comment is successfully added. message should display as title
    And My comment should be at the bottom of the list