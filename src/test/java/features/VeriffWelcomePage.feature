Feature: Veriff Welcome Page

  Background: Fill the fields with data
    When Veriff welcome page is opened and title text Welcome to our Veriff Demo is visible
    And I enter username User in Full Name field
    And I select English language in Session Language field
    And I select Estonia as document country
    And I select document ID Card in Document type field
    And I select radio button InContext

  @Veriff
  Scenario: Check that entered data is stored in the fields
    Then I check that every field data is correctly applied in the fields

  @Veriff
  Scenario: User is able to proceed with verification
    And I click Veriff Me button
    Then Veriff notification dialogue is displayed and text Let's get you verified is presented

  @Veriff
  Scenario Outline: User is able to cancel verification process with option <optionName>
    And I select radio button <optionName>
    And I click Veriff Me button
    And I click on verification dialogue close button when option is <optionName>
    And Question dialogue is opened and title Leaving so soon? is displayed
    And I click question dialogue Exit button when option is <optionName>
    Then Question dialogue is closed and title Leaving so soon? is not displayed

    Examples:
      | optionName |
      | InContext  |
      | Redirect   |

  @Veriff
  Scenario: Get veriff authorization token
    And I click Veriff Me button
    And I get veriff authorization token