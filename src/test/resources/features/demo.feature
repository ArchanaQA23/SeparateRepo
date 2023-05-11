Feature: Verifying Login Functionality of Facebook

  Scenario: Verify Login with Valid Credentials
    Given User lands the browser url
    When user enters the username "oranium@gmail.com"
    And user enters the password "pass@123"
    Then user clicks the login button
    And user verifies the Home page
