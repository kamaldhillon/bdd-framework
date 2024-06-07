Feature: Amazon search for open,closed orders
  Background:
    Given Registered user logs in
    Given  user is login page
    When user enter username
    And password
    Then click on login button
    Then navigates to order page

  Scenario: Previous order details
    Then user checks previous order details


  Scenario: Cancel order details
    Then user checks canceled order details

