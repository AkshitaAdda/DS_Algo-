Feature: to verify and validate user Register Form

  Scenario: Starting the Ds Algo home page
    Given Use should open the dsAlgo portal Link
    When The user should click on "Get Started Page" link
    Then The user should land on home page

  Scenario: Redirect to register page
    Given The user is on  Ds Algo home page
    When The user clicks on Register link
    Then The the user is on register page

  Scenario: Th verify register with empty fields
    Given The user is on register page
    When The user clicks on register button with all empty fields
    Then User should see the message "Please fill out this field" at the username field

  Scenario: To verify register page with username only
    Given The user is on register page
    When User enters username as "AkshitaA"
    And User clicks the register button with empty password and empty confirm password
    Then User should see the message at password "Please fill out this field"

  Scenario: To verify register page with username and password only
    Given The user is on register page
    When User enter UserName "AkshitaA" and password "Test@123"
    And User clicks on register button with confirmpassword field empty
    Then User should see the message at Confirmpassword "Please fill out this field"

  Scenario Outline: Unsuccessful register with invalid credentials
    Given The user is on register page
    When The user enters the "<Username>" in user name field
    And The user enters the  "<Password>" in password field
    And The user enters the "<Confirmpassword>" in confirmpassword field
    And user clicks on register button
    Then The user should see the error message "password_mismatch:The two password fields didn’t match." in register page

    Examples: 
      | Username | Password  | Confirmpassword |
      | Akshita1 | Test@123  | Test@1234       |
      | @#$%%    | Test@123  | Test@123        |
      | Akshita1 | Test@1234 | Test@123        |

  Scenario: To verify register page with valid credentials
    Given The user is on register page
    When The user enters Username as "AkshitaA"
    And The user enters the password as "Test@123"
    And The user enters the confirmPassword as "Test@123"
    And The user clicks on the register button
    Then The user should see the message "New account created.You are loogedin "
    And  When The user logs in with username "AkshitaA" and password "Test@123" by clickinkg Siginbutton
    