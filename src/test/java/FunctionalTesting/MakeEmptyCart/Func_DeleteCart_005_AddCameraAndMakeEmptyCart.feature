Feature: Add CAMERA in the cart and make empty cart
  Can quickly remove all CAMERA in the cart page

  @FunctionalTesting @FuncCart005
  Scenario Outline: Add camera and remove all in the cart page
    Given Go to the home page
    When Search a product by the product name "<firstCameraModel>"
    And View the product details "<firstCameraModel>"
    And Add the product to the cart
    And View the cart details
    And Search a product by the product name "<secondCameraModel>"
    And View the product details "<secondCameraModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove all product in the cart page
    And Verify the cart is empty

    Examples:
      |firstCameraModel                 |secondCameraModel                           |
      |Camera IP 360 Độ 2MP Ezviz C6N   |Camera IP Ngoài Trời 3MP TP-Link Tapo TC65  |