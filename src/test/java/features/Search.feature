Feature: Search for product

  @sanity
  Scenario: Verify search results by searching some product on home page

    Given I navigate to url "https://demo.nopcommerce.com/"
    Then  I should be navigate to home page
    When  I enter  product name in the search text box
    And   I click on search button
    Then  I should see corresponding product details