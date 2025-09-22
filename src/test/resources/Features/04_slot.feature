Feature: Validate slot booking page

  Scenario Outline: Book a slot on an avaliable date
    Given launch a browser and url
    When validate can able to select avaiable slots
    And Validate user can able to select time slot
    And Validate user can navigate using next and previous arrow
    Then Validate a back and book later and continue
    And Validate  a continue button should be enabled after selecting a slot
