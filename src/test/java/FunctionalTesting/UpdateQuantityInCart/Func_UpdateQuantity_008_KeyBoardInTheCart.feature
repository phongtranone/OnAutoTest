Feature: Change quantity of KEY BOARD in the cart
  Can quickly update quantity of KEY BOARD in the cart page

  @FunctionalTesting @FuncUpdateQuantity008
  Scenario Outline: Add key board and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<keyboardModel>"
    And View the product details "<keyboardModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |keyboardModel                       |updatedQuantity|
      |Bàn Phím Bluetooth Logitech K380s   |3              |