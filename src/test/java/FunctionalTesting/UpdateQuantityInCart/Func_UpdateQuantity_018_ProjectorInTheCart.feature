Feature: Change quantity of PROJECTOR in the cart
  Can quickly update quantity of PROJECTOR in the cart page

  @FunctionalTesting @FuncUpdateQuantity018
  Scenario Outline: Add projector and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<projectorModel>"
    And View the product details "<projectorModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |projectorModel                        |updatedQuantity|
      |Máy Chiếu Xiaomi Smart Projector L1   |3              |