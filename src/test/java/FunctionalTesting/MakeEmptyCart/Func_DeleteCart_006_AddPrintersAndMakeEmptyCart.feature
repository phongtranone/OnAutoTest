Feature: Add PRINTERS in the cart and make empty cart
  Can quickly remove all PRINTER in the cart page

  @FunctionalTesting @FuncCart006
  Scenario Outline: Add printers and remove all in the cart page
    Given Go to the home page
    When Search a product by the product name "<firstPrinterModel>"
    And View the product details "<firstPrinterModel>"
    And Add the product to the cart
    And View the cart details
    And Search a product by the product name "<secondPrinterModel>"
    And View the product details "<secondPrinterModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove all product in the cart page
    And Verify the cart is empty

    Examples:
      |firstPrinterModel                         |secondPrinterModel                               |
      |Máy in laser trắng đen Brother HL-L2321D  |Máy in laser trắng đen Brother DCP-B7640DW Wifi  |