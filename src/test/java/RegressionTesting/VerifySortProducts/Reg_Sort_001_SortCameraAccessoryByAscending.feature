Feature: Sort list of CAMERA by Ascending price
  Can quickly sort ascending price to view easily the product list

  @RegressionTesting @Reg_Sort_001
  Scenario: Sort the list of CAMERA by Ascending Price
    Given Go to the home page
    And Go to the "accessoriesMenu" menu
    And Select accessory category "camera"
    And Select accessory camera brand name "imou"
    When Sort the product by ascending order
    Then Verify list prices of the products after sorting by order type ascending
