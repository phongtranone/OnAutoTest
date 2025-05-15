Feature: Change quantity of SPEAKER in the cart
  Can quickly update quantity of SPEAKER in the cart page

  @FunctionalTesting @FuncUpdateQuantity004
  Scenario Outline: Add speaker and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<speakerModel>"
    And View the product details "<speakerModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |speakerModel                        |updatedQuantity|
      |Loa Bluetooth Xiaomi Sound Pocket   |4              |