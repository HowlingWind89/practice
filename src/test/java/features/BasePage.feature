Feature: Base Page

  Background:
    Given I open Fitekin base page

  @TEST
  Scenario: Fitekin base page language and country selection
    And I click Country menu
    And I select Estonia as Country in the list