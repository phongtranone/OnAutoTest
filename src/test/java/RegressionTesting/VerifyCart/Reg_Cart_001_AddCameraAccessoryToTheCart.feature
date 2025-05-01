Feature: Add CAMERA to the cart
  Can quickly add a CAMERA to the cart and view the cart page

  @RegressionTesting @Reg_Cart_001
  Scenario Outline: Add a camera to the cart and view the cart page
    Given Go to the home page
    When Search a product by the product name "<cameraModel>"
    And View the product details "<cameraModel>"
    And Add the product to the cart
    Then Verify number of product in the cart is "1"
    And View the cart details
    And Verify that the cart contains product name "<cameraModel>"
    And Verify that the cart display original price "<productPrice>"

    Examples:
      |cameraModel                        |productPrice |
      |Camera IP Ngoài Trời 2MP Ezviz H3C | 850.000đ      |