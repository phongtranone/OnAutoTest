Feature: Sort list of PHONE by Descending price
  Can quickly sort descending price to view easily the product list

  @RegressionTesting @Reg_Sort_016
  Scenario: Sort the list of PHONE by Descending Price
    Given Go to the home page
    And Go to the "phoneMenu" menu
    And Select the category "iphone"
    When Sort the product by descending order
    Then Verify list prices of the products after sorting by order type descending
