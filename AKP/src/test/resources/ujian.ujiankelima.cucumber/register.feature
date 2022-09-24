Feature: Register Invalid 

  Scenario Outline: Register invalid 
    When Open Web DemoQA register
    And User register invalid <username> <email> and <password>  
    And button regsiter click
    Then System check error register

#6 data
    Examples: 
      | username |     email				|	password    |
      | adit     | adit@gmail.com		|	adsjajuqe87238  |
      | Aditya   | aditya@gmail.com	|	jadja89139dflkan  |
      | Adits    | adits@gmail.com	|	jaofjqaf9814638  |
     
     