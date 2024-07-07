@GraphPage
Feature: Graph page validation ds_Algo

  Scenario: User navigating to Graph page.
    Given User is in DsAlgo home Page of Graph page
    When The user logs in with username "AkshitaA" and password "Test@123" of Graph Page
    And The user navigates to the Graph page by clicking Get start button
    Then The user is in the Graph home page

  Scenario: Implementation of Graph in Python
    Given The user is in Graph page
    When The user clicks Graph link
    And Click Try Here button of Graph Page
    Then The user directed to editor input page of Graph

  Scenario Outline: Verify editor input scenarios of Graph Page
    Given The user is in  editor input page of Graph
    When The user checks correct output for various <Input> and <code> of Graph page
    And The user runs the code by clicking Run button of Graph page
    Then The output should be expected <expectedOutput> of Graph page

    Examples: 
      | Input         | code                        | expectedOutput                     |
      | Valid Input   | "print(\\"hello world\\")"  | "hello world"                      |
      | Empty Input   | ""                          | ""                                 |
      | Invalid Input | "print(\\"hello world\\"):" | "SyntaxError: bad input on line 1" |

  Scenario: Implementation using Graph Representations
    Given The user redirected to Graph home page
    When The user clicks  Graph Representations link
    And Click Try Here button of Graph Representations page
    Then The user directed to python editor input page of Graph Representations

  Scenario Outline: Validate editor input scenarios Graph reprensentation
    Given The user is in python editor input page  Graph Representations link
    When The user checks correct output for various <Input> and <code> of Graph Representations
    And The user click Run button to validate the codes of Graph Representations link
    Then The output should  be expected <expectedOutput> of  Graph Representations

    Examples: 
      | Input         | code                        | expectedOutput                     |
      | Valid Input   | "print(\\"hello world\\")"  | "hello world"                      |
      | Empty Input   | ""                          | ""                                 |
      | Invalid Input | "print(\\"hello world\\"):" | "SyntaxError: bad input on line 1" |

  Scenario: Practice Question Link of Graph
    Given The user redirected to Practice Question Link of Graph page
    When The user clicks  Practice Question Link of Graph Page
    Then The user directed to blank page of Graph

  Scenario: Graph Navigation to home page
    Given The user redirected to Graph page from blank page
    When The user clicks on back button from Graph Page
    Then The user directed to home page of Numpy Ninja from Graph
