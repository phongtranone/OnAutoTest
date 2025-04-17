Feature: Search TABLET by the tablet model
  Can quickly search a TABLET and view the product specification

  @RegressionTesting @Reg_Search_008
  Scenario Outline: Search the tablet by the model and view the product specification
    Given Go to the home page
    When Search a product by the product name "<tabletModel>"
    And Ensure that find only one product
    Then View the product details "<tabletModel>"
    And Verify tablet display "<display>"
    And Verify tablet resolution "<resolution>"
    And Verify tablet screen size "<screenSize>"

    Examples:
      |tabletModel                       |display |resolution        |screenSize |
      |Samsung Galaxy Tab A9 4G 4GB/64GB |TFT LCD |800 x 1340 Pixels |8.7        |