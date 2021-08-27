Feature: eature validate login functionality
  @sanityFlow
  Scenario Outline: enter user and password and validate login
    Given shipcarte login page is launched
    When "<username>" is entered
    When password is entered
    And click on login button
    Then validate if it land on dashboard page
    Examples:
    |username|
    |hatami_l66@yahoo.com|
