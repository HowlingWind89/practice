Feature: Currency

  Background: Open login page
    And I click Country menu
    And I select Estonia as Country in the list
    And I click Continue button
    And I check that Log in page is opened

  @TEST
  Scenario: Get Currency
    And I enter username
    And I enter password
    And I click Login button
    And I get Currency