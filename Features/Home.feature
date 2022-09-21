@tag
Feature: To Validate Home page functionality

  @tag1 @tag2
  Scenario: To search for Trains
    Given Open makemytrip website
    When Click on trains tab
    And Select from and to city
    And Click search button
    Then Validate available filters on trains results page
    And close the browser

  @tag2
  Scenario Outline: 
    Given Open makemytrip website
    When Click on trains tab
    And Select from city "<FromCity>" and to city "<ToCity>"
    And Click search button
    Then Validate available filters "<Filters>" on trains results page
    And close the browser

    Examples: 
      | FromCity | ToCity | Filters              |
      | Mumbai   | Nagpur | Departure after 6 PM |
      | Pune     | Nanded | Sleeper              |
      | Mumbai   | Nanded | Departure after 6 PM |
      | Pune     | Nagpur | Sleeper              |
