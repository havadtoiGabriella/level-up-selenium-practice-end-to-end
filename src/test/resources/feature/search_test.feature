Feature: Search test

  Background: User navigates to the home page and accepts pop-ups
    Given I navigate to the home page
    And I accept the age verification pop-up
    And I accept the data handling dialog box

  Scenario Outline: Search for "<product name>"
    Given I search for "<search target>"
    And on the search result page I click on the Next page button
    When I click on the "<product name>" product
    Then I should be redirected to the "<product name>" product page
    And  'Alkoholtartalom' field should be displayed
    Examples:
      | search target | product name   |
      | brewing       | Just Slip Away |
