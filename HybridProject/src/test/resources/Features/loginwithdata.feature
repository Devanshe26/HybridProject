Feature: OrangeHRM Login
  Scenario Outline: Retest on OrangeHRM Login
    Given open the firefox browser
    Given navigate to app url
    When enter  username data into the username field
     | Rihansh  |
    When enter  password data into password field
     | Rihansh  |
    When click on login button
    Then verify login success
   
    