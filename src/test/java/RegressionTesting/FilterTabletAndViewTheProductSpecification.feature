Feature: Filter TABLET by the branch
  Can quickly find a TABLET and view the product specification

  @RegressionTesting @RegressionTestingGroup2
  Scenario Outline: Filter the tablet by branch name and view the product specification
    Given Go to the home page
    And Go to the "tabletMenu" menu
    And Select tablet brand name "samsung"
    When View the product details "<tabletModel>"
    Then Verify tablet display "<display>"
    And Verify tablet resolution "<resolution>"
    And Verify tablet screen size "<screenSize>"

    Examples:
      |tabletModel                       |display |resolution        |screenSize |
      |Samsung Galaxy Tab A9 4G 4GB/64GB |TFT LCD |800 x 1340 Pixels |8.7        |