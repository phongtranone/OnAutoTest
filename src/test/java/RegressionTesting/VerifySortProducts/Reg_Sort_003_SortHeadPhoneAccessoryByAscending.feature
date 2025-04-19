Feature: Sort list of HEADPHONE by Ascending price
  Can quickly sort ascending price to view easily the product list

  @RegressionTesting @Reg_Sort_003
  Scenario: Sort the list of HEADPHONE by Ascending Price
    Given Go to the home page
    And Go to the "accessoriesMenu" menu
    And Select accessory category "headPhone"
    And Select accessory head phone brand name "samsung"
    When Sort the product by ascending order
    Then Verify list prices of the products after sorting by order type ascending
