Feature: Change quantity of MONITOR in the cart
  Can quickly update quantity of MONITOR in the cart page

  @FunctionalTesting @FuncUpdateQuantity013
  Scenario Outline: Add monitor and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<monitorModel>"
    And View the product details "<monitorModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |monitorModel                 |updatedQuantity|
      |Xiaomi 27 inch Full HD A27i  |4              |