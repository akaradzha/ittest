Feature: get chameleon session

  Background:
    * configure headers = read('classpath:headers.js')
    * header Content-Type = 'application/json'
    * def reqBody = "{ \"subsystemId\": \"4\" }"

  Scenario:   retrieve chameleon session
    Given url chameleonUrl
    And request reqBody
    When method post
    Then status 200
    And def session = response.session