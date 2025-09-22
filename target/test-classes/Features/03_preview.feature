Feature: Validate a preview page

  Scenario: validate a preview page with positive case
    Given launch browser and url
    When validate   modify icon
    And validate  check box
    Then validate  continue button
