Feature: Delete a HEADPHONE in the cart
  Can quickly remove a HEADPHONE in the cart page

  @RegressionTesting @Reg_Delete_Cart_009
  Scenario Outline: Delete a headphone in the cart page
    Given Go to the home page
    When Search a product by the product name "<headphoneModel>"
    And View the product details "<headphoneModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove the product in the cart page
    And Verify the cart is empty

    Examples:
      |headphoneModel                                |
      |Tai nghe TWS Samsung Galaxy Buds3 R530N       |