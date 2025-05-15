Feature: Delete a SMART WATCH in the cart
  Can quickly remove a SMART WATCH in the cart page

  @RegressionTesting @Reg_Delete_Cart_003
  Scenario Outline: Delete a smart watch in the cart page
    Given Go to the home page
    When Search a product by the product name "<smartWatchModel>"
    And View the product details "<smartWatchModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove the product in the cart page
    And Verify the cart is empty

    Examples:
      |smartWatchModel                                |
      |Apple Watch Series 10 42mm viền nhôm dây vải   |