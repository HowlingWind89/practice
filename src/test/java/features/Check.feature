Feature: Check

  Background: Check
    Given I open a browser

  @TEST
  Scenario: Just check
    And I click confirmation dialogue accept button
    And I type search text

  @ABC
  Scenario: check test
    And I click confirmation dialogue accept button
    And I type search text