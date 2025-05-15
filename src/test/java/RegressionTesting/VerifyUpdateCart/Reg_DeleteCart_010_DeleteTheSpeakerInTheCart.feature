Feature: Delete a SPEAKER in the cart
  Can quickly remove a SPEAKER in the cart page

  @RegressionTesting @Reg_Delete_Cart_010
  Scenario Outline: Delete a speaker in the cart page
    Given Go to the home page
    When Search a product by the product name "<speakerModel>"
    And View the product details "<speakerModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove the product in the cart page
    And Verify the cart is empty

    Examples:
      |speakerModel                              |
      |Loa Bluetooth Marshall Emberton III       |