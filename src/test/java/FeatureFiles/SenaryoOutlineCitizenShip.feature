Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship

  Scenario Outline: Create a Citizenship
    When Create a Citizenship name as "<name>" short name as "<shortname>"
    Then Success message should be displayed

    When Create a Citizenship name as "<name>" short name as "<shortname>"
    Then Already exist message should be displayed

    Examples:
      | name     | shortname |
      | ism25cs1 | sh57is1   |
      | ism25cs2 | sh57is2   |
      | ism25cs3 | sh57is3   |
      | ism25cs4 | sh57is4   |
      | ism25cs5 | sh57is5   |