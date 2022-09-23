Feature: Login User

  Scenario: User invalid login
    When User go to Web NOPC
    And User input invalid username and password 
    And Click button invalid
    Then User invalid 

  Scenario: User valid login
  	When User input valid
    And Click button valid 
    Then User valid