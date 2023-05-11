Feature: Verifying Login with Multiple Users

  Scenario Outline: verify multiple data
    Given user navigates the browser url
    When user enters the username "<username>" and "<password>"
    Then user clicks the login button

    Examples: 
      | username          | password |
      | oranium@gmail.com | ora@123  |
      | manager@gmail.com | man@123  |
      | hr@gmail.com      | hr@1223  |
