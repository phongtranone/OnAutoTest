Feature: Sort list of SPEAKER by Ascending price
  Can quickly sort ascending price to view easily the product list

  @RegressionTesting @Reg_Sort_013
  Scenario: Sort the list of SPEAKER by Ascending Price
    Given Go to the home page
    And Go to the "accessoriesMenu" menu
    And Select accessory category "speaker"
    And Select accessory speaker brand name "xiaomi"
    When Sort the product by ascending order
    Then Verify list prices of the products after sorting by order type ascending
