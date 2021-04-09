Feature: Login to nop commerce with valid credentials
  In order to login to application
  As a valid user
  I should provide valid email and password

  Scenario Outline: Verify login with valid credentials

    Given I navigate to url "https://demo.nopcommerce.com/"
    Then  I should be navigate to home page
    When  I click on login link from the navbar
    Then  I should be navigated to login page
    When  I enter email as "<email>"
    And   I enter password as "<password>"
    And   I click on login button
    Then  I should be logged in successfully

    Examples:
      | email       | password |
      | qa1@nop.com | Testing  |
      | qa2@nop.com | Testing  |
      | qa3@nop.com | Testing  |



