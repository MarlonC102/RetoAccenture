Feature: Me as a customer of the demoblaze warehouse
  I need to view the prices of products from any category
  To buy a product

  Scenario Outline: Buy product
    Given The user is on the main page of the DemoBlaze page to purchase
    When Enter the category and buy the product
      | Category   | Product   |
      | <category> | <product> |
    Then validate that the purchase is successful
    And the name are the input data
    And the purchase alert message
    Examples:
      | category | product      |
      | Phones  | Samsung galaxy s6 |