Feature: Betsson Main Page

  @Betsson
  Scenario: Log in to Betsson
    When I click 'Login' button
    And Login modal is opened
    And I enter gx.obga@gmail.com as username
    And I enter Qwer1234 as password
    Then I click login submit button