Feature: Veriff Welcome Page

  @Veriff
  Scenario: Check that entered data is stored in the fields
    When Veriff welcome page is opened and title text Welcome to our Veriff Demo is visible
    And I enter username User in Full Name field
    And I select English language in Session Language field
    And I select Estonia as document country
    And I select document ID Card in Document type field
    And I select radio button InContext
    Then I check that every field data is correctly applied in the fields