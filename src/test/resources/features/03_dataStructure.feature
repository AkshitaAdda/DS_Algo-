Feature: Data Structure page validation ds_Algo

  Scenario: User navigates to DataStructure page
    Given User is in DsAlgo home page
    When The user logs in with username "AkshitaA" and password "Test@123" of DsAlgo
    And The user navigates to Data Structure Introduction by clicking Get Started button
    Then The user is in  Data Structure Introduction home page

  Scenario: Implementation of Data Structure in python
    Given The user is in  Data Structure Introduction page
    When The user clicks in Time complexity link
    And The user clicks on Try here button
    Then The user redirected to editor input page of Time complexity

  Scenario Outline: Verify editor input scenarios of Time complexity
    Given The user is in DS editor input page of Time complexity
    When The user checks correct output for various <Input> and <code> of Time complexity
    And The user runs the code by clicking Run button of Time complexity
    Then The output should be expected <expectedOutput> of Time complexity

    Examples: 
      | Input         | code                        | expectedOutput                     |
      | Valid Input   | "print(\\"hello world\\")"  | "hello world"                      |
      | Empty Input   | ""                          | ""                                 |
      | Invalid Input | "print(\\"hello world\\"):" | "SyntaxError: bad input on line 1" |

  Scenario: Practice Question Link
    Given The user redirected to Practice Question Link page of Data Structures-Introduction
    When The user clicks  Practice Question Link of Data Structures-Introduction
    Then The user directed to blank page of Data Structures-Introductio

  Scenario: Datastructure Navigation to Home page
    Given The user redirects to data Structured page from blank page
    When The user clicks the back button
    Then The user directed to home page of Numpy Ninja in dsAlgo
