Feature: Validate search functionality
  Scenario: search functionality
    Given amazon webpage is launch
    When user enter product name
    And user click on search button
    Then product should be displayed

