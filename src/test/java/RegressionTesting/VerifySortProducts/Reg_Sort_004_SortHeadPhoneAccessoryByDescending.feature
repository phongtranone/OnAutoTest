Feature: Sort list of HEADPHONE by Descending price
  Can quickly sort descending price to view easily the product list

  @RegressionTesting @Reg_Sort_004
  Scenario: Sort the list of HEADPHONE by Descending Price
    Given Go to the home page
    And Go to the "accessoriesMenu" menu
    And Select accessory category "headPhone"
    And Select accessory head phone brand name "apple"
    When Sort the product by descending order
    Then Verify list prices of the products after sorting by order type descending
