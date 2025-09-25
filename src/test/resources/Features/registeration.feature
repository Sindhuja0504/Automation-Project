Feature: Create Account for pre-registeration

  Scenario Outline: Register with valid inputs
    Given launch browser and load url
    When verify the name field "<Name>"
    And verify the surname field "<Surname>"
    And verify the phone number field "<Number>"
    And verify the national id field "<ID>"
    And veriify the email address field "<Email>"
    And verify the password field "<Password>"
    And verify the sendotp button
    And verify the otp field
    Then verify the submit button

    Examples: 
      | Name     | Surname | Number | ID       | Email                 | Password    |
      | sindhuja | sindhu  | 347897654 | 1234BBBB | mspteam0707@gmail.com | Testing@123 |
      |mahendran|mahe|111111111|0000000|mspteam0707@gmail.com | Testing@123 |
