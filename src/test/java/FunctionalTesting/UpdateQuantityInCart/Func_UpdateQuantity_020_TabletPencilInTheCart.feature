Feature: Change quantity of TABLET PENCIL in the cart
  Can quickly update quantity of TABLET PENCIL in the cart page

  @FunctionalTesting @FuncUpdateQuantity020
  Scenario Outline: Add tablet pencil and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<tabletPencilModel>"
    And View the product details "<tabletPencilModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |tabletPencilModel      |updatedQuantity|
      |Apple Pencil Pro       |2              |