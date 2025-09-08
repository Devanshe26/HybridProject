Feature: Login Functionality
Scenario: Verify OrangeHRM Login Functionality
    Given Open the firfox browser
    Given navigate the app URL
    When Enter the username  into the username field
    When Enter the password  into the password field
    When click on the login button
    Then verify welcome page