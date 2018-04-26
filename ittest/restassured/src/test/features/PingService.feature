Feature: Test ping service

  Scenario: User gets chameleon session then gets client session by calling ping service
    Given chameleon session
    When user calls ping service
    Then the status code is 200
    And client session is returned

