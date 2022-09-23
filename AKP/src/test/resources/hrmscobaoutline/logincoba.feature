Feature: Login User

  Scenario: User invalid login
    When User go to Web HRMS
    And User input invalid <username> and <password> 
    And Click button invalid
    Then User invalid 

    Examples: 
      | username | password  |
      | Admin    | Admin1234 |
      | Admin    | adminn123 |
      | Adminn   | Addmin123 |
      | Admmin   | admin123  |
      | Admins   | minad921  |
      | Adminss  | admin1233 |