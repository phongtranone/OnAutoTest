Feature: Change quantity of PRINTER in the cart
  Can quickly update quantity of PRINTER in the cart page

  @FunctionalTesting @FuncUpdateQuantity014
  Scenario Outline: Add printer and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<printerModel>"
    And View the product details "<printerModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |printerModel                                 |updatedQuantity|
      |Máy in laser trắng đen Canon LBP6030W Wifi   |3              |