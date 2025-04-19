Feature: Sort list of CAMERA by Descending price
  Can quickly sort descending price to view easily the product list

  @RegressionTesting @Reg_Sort_002
  Scenario: Sort the list of CAMERA by Descending Price
    Given Go to the home page
    And Go to the "accessoriesMenu" menu
    And Select accessory category "camera"
    And Select accessory camera brand name "imou"
    When Sort the product by descending order
    Then Verify list prices of the products after sorting by order type descending
