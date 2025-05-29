Feature: Add LAPTOPS and make empty cart
  Can quickly remove all LAPTOP in the cart page

  @RegressionTesting @DemoTesting @DemoCart02
  Scenario Outline: Add laptops and remove all in the cart page
    Given Go to the home page
    When Search a product by the product name "<firstLaptopModel>"
    And View the product details "<firstLaptopModel>"
    And Add the product to the cart
    And View the cart details
#    Then Remove all product in the cart page
    And Verify the cart is empty

    Examples:
      |firstLaptopModel                       |
      |MSI Modern 15 F13MG i5 1335U (082VN)   |