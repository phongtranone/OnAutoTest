Feature: Filter HEAD PHONE by the branch
  Can quickly find a HEAD PHONE and view the product specification

  @RegressionTesting @RegressionTestingGroup1 @RegressionTestingGroup4
  Scenario Outline: Filter the head phone by branch name and view the product specification
    Given Go to the home page
    And Go to the "accessoriesMenu" menu
    And Select accessory category "headPhone"
    And Select accessory head phone brand name "sony"
    When View the product details "<headPhoneModel>"
    Then Verify head phone charge port "<chargePort>"
    And Verify head phone connection "<connection>"
    And Verify head phone sound technique "<sound>"

    Examples:
      |headPhoneModel            |chargePort |connection    |sound             |
      |Tai nghe TWS Sony WF-L910 |Type-C     |Bluetooth 5.3 |360 Reality Audio |