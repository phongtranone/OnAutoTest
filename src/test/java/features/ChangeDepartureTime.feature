Feature: Flight changing
  Can change the flight after landing on the hotel listing

  @SmokeTesting
  Scenario Outline: Change departure time
    Given Go to the Snap search page
    And Enter the departure "<departure>"
    And Enter the destination "<destination>"
    And Enter flight date
    And Click on the search button
    When Change flight with random any departure time
    Then New departure time should be updated on the hotel listing

    Examples:
      | departure | destination | departDate | returnDate |
      | KUL       | LGK         | 10/12/2023 | 15/12/2023 |