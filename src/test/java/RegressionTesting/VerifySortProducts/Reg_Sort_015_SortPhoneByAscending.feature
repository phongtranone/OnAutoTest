Feature: Sort list of PHONE by Ascending price
  Can quickly sort ascending price to view easily the product list

  @RegressionTesting @Reg_Sort_015
  Scenario: Sort the list of PHONE by Ascending Price
    Given Go to the home page
    And Go to the "phoneMenu" menu
    And Select the category "iphone"
    When Sort the product by ascending order
    Then Verify list prices of the products after sorting by order type ascending
