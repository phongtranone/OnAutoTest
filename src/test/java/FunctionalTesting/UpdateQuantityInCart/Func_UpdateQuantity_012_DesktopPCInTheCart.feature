Feature: Change quantity of PC in the cart
  Can quickly update quantity of PC in the cart page

  @FunctionalTesting @FuncUpdateQuantity012
  Scenario Outline: Add PC and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<pcModel>"
    And View the product details "<pcModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |pcModel                         |updatedQuantity|
      |SingPC i713H695SF-W i7 13620H   |3              |