Feature: Amazon search
  @Smoke
  Scenario: Search a product
    Given I have search field on amazon page
    When I search for any product with name "apple macbook pro" and price 1000
    Then Product with Name "Apple macbook pro" should be displayed

    @regression
  Scenario: Search a product
    Given I have search field on amazon page
    When I search for any product with name "apple macbook pro" and price 1000
    Then Product with Name "Apple macbook pro" should be displayed

