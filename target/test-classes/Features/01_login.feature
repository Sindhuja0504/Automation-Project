Feature: Login and form page
Scenario: Validate successful login with valid inputs


Given Launch the browser and url
When Provide valid inputs and  then hit submit
Then Validate if the user logged in successfully
 
 

Scenario: Validating a forms with valid inputs 

Given  Launch the passport application portal
When Provide a  service details
And Provide a  personal details 
And Provide a  permanent address details 
And Select the same as present address option or enter present details  
And Accept the terms and conditions and Click next 
Then Verify the user is navigated to the next page


