Feature: Change quantity of CAMERA in the cart
  Can quickly update quantity of CAMERA in the cart page

  @FunctionalTesting @FuncUpdateQuantity006
  Scenario Outline: Add camera and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<cameraModel>"
    And View the product details "<cameraModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |cameraModel                          |updatedQuantity|
      |Camera IP 360 Độ 3MP IMOU TA32CP-L   |5              |