Feature: Search SMART WATCH by the model name
  Can quickly search a SMART WATCH and view the product specification

  @RegressionTesting @Reg_Search_006
  Scenario Outline: Search the smart watch by the model and view the product specification
    Given Go to the home page
    When Search a product by the product name "<smartWatchModel>"
    And Ensure that find only one product
    Then View the product details "<smartWatchModel>"
    And Verify smart watch display "<display>"
    And Verify smart watch screen size "<screenSize>"
    And Verify smart watch resolution "<resolution>"
    And Verify smart watch dimension "<dimensions>"

    Examples:
      |smartWatchModel                                  |display       |screenSize |resolution       |dimensions |
      |Samsung Galaxy Watch Ultra LTE 47mm dây silicone |Super AMOLED  |1.47 inch  |480 x 480 pixels |47 mm      |