Feature: Register new user

  Background: navigate to url and goto register page

    Given I navigate to url "https://demo.nopcommerce.com/"
    Then  I should be navigate to home page
    When  I click on register link from the navbar
    Then  I should be navigated to register page

  @regression
  Scenario: Verify new user registration by providing data in all mandatory fields

    When  I select gender as male
    And   I enter firstName lastName email password confirmPassword

      | firstName | lastName | email           | password | confirmPassword |
      | user3     | qa3      | userqa3@nop.com | Testing  | Testing         |

    And I click on register button
    Then I should be able to register successfully


  @regression
  Scenario: Verify error messages for user registration when data is not entered in mandatory fields

    And I click on register button
    Then I should see error messages

