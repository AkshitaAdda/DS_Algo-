Feature: User Sign in

  Scenario: Starting the Ds Algo portal  home page
    Given User should open the Ds algo potal link
    When User should click on "Get Started Page" link
    Then User should land on home page

  Scenario: Redirect to register page
    Given The user is on home page
    When The user should click on Register link
    Then The user is redirected to Register page

  Scenario: To Verify Sign with Empty fields
    Given The user is on  Sign in page
    When User clicks on login button with all empty fields
    Then User should see the message at username as "Please fill out this field."

  Scenario: To verify Sign in with Username only
    Given The user is on DS Algo Sign in page
    When User enters Username as "Akshitaa"
    When User clicks on login button with empty password
    Then User should see the message at Password as "Please fill out this field."

  Scenario: To verify Sign in with password only
    Given The user is on DS Algo Sign in page
    When User enters password as "Test@123"
    When User clicks on login button without Username
    Then User should see the message at username "Please fill out this field."

  Scenario Outline: Unsuccessful Login with invalid credentials
    Given The user is on DS Algo Sign in page
    When The user enters the "<Username>" in text box and "<Password>" in text box
    And User clicks login button
    Then The user should see the error message "Invalid Username and Password"

    Examples: 
      | Username | Password    |
      | Akshita1 | Test@123    |
      | AkshitaA | Test@321    |
      | AkshitaA | Dsalgo@2024 |

  Scenario: Successful Login with valid credentials
    Given The user is on DS Algo Sign in page
    When User Enters Email as "AkshitaA"
    And Password as "Test@123"
    And Clicks on Login link
    Then User should see the msg "you are logged in" in Ds Algo homepage

  Scenario: Successful LogOut
    When User clicks on sign out link
    Then User should see the message "Logged out Successfully"
