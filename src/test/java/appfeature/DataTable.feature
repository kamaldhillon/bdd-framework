Feature: Amazon search

  Scenario: Search a product
    Given I have search field on amazon page
    When I search for any product
    | abc | 26 | MCA
    | xyz  | 28 | MCA
    | pgr | 23 | BCA

    Then submit the response