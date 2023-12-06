Feature: Hotel Searching
    Can quickly search a hotel

    @SmokeTesting
    Scenario Outline: Search an intended hotel
        Given Go to the Snap search page
        And Enter the departure "<departure>"
        And Enter the destination "<destination>"
        And Enter flight date
        And Click on the search button
        When Enter a hotel in the search box "<hotelName>"
        Then The hotel should be displayed in your search result

        Examples:
            | departure | destination | hotelName         |
            | KUL       | LGK         | Dayang Bay |