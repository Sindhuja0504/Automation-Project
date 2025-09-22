Feature: Validate a Review page

  Scenario: validate a review page with positive case
    Given launch browser and url
    When Verify user is able to download a pdf
    And verify the finish button
    Then Verify that the page navigate to my application page
