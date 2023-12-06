Feature: Hotel Searching
    Can quickly search a hotel

    @RegressionTesting
    Scenario Outline: Search an intended hotel
        Given Go to the Snap search page
        And Enter the departure "<departure>"
        And Enter the destination "<destination>"
        And Enter flight date

        Examples:
            | departure | destination | hotelName         |
            | KUL       | LGK         | Dayang Bay |