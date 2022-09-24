Feature: Login Invalid 

  Scenario Outline: Login invalid
    When Browser open Web DemoQA login
    And User login invalid <username> and <password> 
    And button remember me click
    And button login click
    Then System check error login

#6 data
    Examples: 
      | username | password   |
      | adit     | adit2120   |
      | Aditya   | aditya112  |
      | Adits    | adits9911  |
      | adith    | adith8889  |
      | krisna   | krisna8765 |
     