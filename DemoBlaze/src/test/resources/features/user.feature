Feature:As a customer of the demoblaze page,
  I need to register on the page to make a purchase decision.

  Scenario: Successfull login
    Given The user is on the main page of the DemoBlaze page
    When The user enters the registration module and enters his username and password.
    Then The Sign up successful alert will be validated
    And The name at the top.