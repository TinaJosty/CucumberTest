Feature: Calculator
  In order to avoid silly mistakes As a math idiot I want to be told the sum of two numbers

  Scenario: Add two numbers
    Given I have entered <first> into the calculator
    And I have also entered <second> into the calculator
    When I press add
    Then the result should be <result> on the screen