Feature: Filter WATCH by the branch
  Can quickly find a WATCH and view the product specification

  @RegressionTesting @RegressionTestingGroup2
  Scenario Outline: Filter the watch by branch name and view the product specification
    Given Go to the home page
    And Go to the "watchMenu" menu
    And Select watch brand name "casio"
    When View the product details "<watchModel>"
    Then Verify watch strap material "<strapMaterial>"
    And Verify watch strap width "<strapWidth>"
    And Verify watch thickness "<thickness>"
    And Verify watch glass material "<glassMaterial>"

    Examples:
      |watchModel                      |strapMaterial |strapWidth |thickness |glassMaterial       |
      |CASIO 34 mm Nam MTP-M305D-1AVDF |Thép không gỉ |20 mm      |9.3 mm    |Kính khoáng Mineral |