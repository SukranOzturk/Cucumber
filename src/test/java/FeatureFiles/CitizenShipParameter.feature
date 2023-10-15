Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship

  Scenario: Create a Citizenship
    When Create a Citizenship name as "sukr23" short name as "advg1"
    Then Success message should be displayed

    When Create a Citizenship name as "sukr23" short name as "advg1"
    Then Already exist message should be displayed