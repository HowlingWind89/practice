Feature: Betsson Main Page

  @Betsson
  Scenario: Log in to Betsson
    When I click 'Login' button
    And Login modal is opened
    And I enter betsson username
    And I enter betsson password
    Then I click login submit button