Feature: Amazon search

  Scenario Outline: Search a product
    Given I have search field on amazon page
    When I search for any product <check> And <new> name
    Then submit the response
    Examples:
      | check | new
    | you | two