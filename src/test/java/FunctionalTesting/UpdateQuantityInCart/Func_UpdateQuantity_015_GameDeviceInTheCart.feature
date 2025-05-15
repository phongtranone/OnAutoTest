Feature: Change quantity of GAME DEVICE in the cart
  Can quickly update quantity of GAME DEVICE in the cart page

  @FunctionalTesting @FuncUpdateQuantity015
  Scenario Outline: Add game device and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<gameDeviceModel>"
    And View the product details "<gameDeviceModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |gameDeviceModel                                    |updatedQuantity|
      |Máy chơi game Sony PlayStation 5 Slim ASIA-00479   |4              |