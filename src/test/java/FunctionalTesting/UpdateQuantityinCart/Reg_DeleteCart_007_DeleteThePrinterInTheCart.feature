Feature: Delete a PRINTER in the cart
  Can quickly remove a PRINTER in the cart page

  @RegressionTesting @Reg_Delete_Cart_007
  Scenario Outline: Delete a printer in the cart page
    Given Go to the home page
    When Search a product by the product name "<printerModel>"
    And View the product details "<printerModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove the product in the cart page
    And Verify the cart is empty

    Examples:
      |printerModel                               |
      |Máy in laser trắng đen Brother HL-L2321D   |