Feature: Search WATCH by the model
  Can quickly search a WATCH and view the product specification

  @RegressionTesting @Reg_Search_010
  Scenario Outline: Search the watch by the watch model and view the product specification
    Given Go to the home page
    When Search a product by the product name "<watchModel>"
    And Ensure that find only one product
    Then View the product details "<watchModel>"
    And Verify watch strap material "<strapMaterial>"
    And Verify watch strap width "<strapWidth>"
    And Verify watch thickness "<thickness>"
    And Verify watch glass material "<glassMaterial>"

    Examples:
      |watchModel                      |strapMaterial |strapWidth |thickness |glassMaterial       |
      |CASIO 34 mm Nam MTP-M305D-1AVDF |Thép không gỉ |20 mm      |9.3 mm    |Kính khoáng Mineral |