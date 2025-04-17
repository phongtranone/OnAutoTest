Feature: Search HEAD PHONE by the head phone model
  Can quickly search a HEAD PHONE and view the product specification

  @RegressionTesting @Reg_Search_002
  Scenario Outline: Search the head phone by the head phone model and view the product specification
    Given Go to the home page
    When Search a product by the product name "<headPhoneModel>"
    And Ensure that find only one product
    Then View the product details "<headPhoneModel>"
    And Verify head phone charge port "<chargePort>"
    And Verify head phone connection "<connection>"
    And Verify head phone sound technique "<sound>"

    Examples:
      |headPhoneModel            |chargePort |connection    |sound             |
      |Tai nghe TWS Sony WF-L910 |Type-C     |Bluetooth 5.3 |360 Reality Audio |