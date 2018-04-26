Feature: call ping service and retrieve client session

  Background:
    * url baseUrl
    * configure headers = read('classpath:headers.js')
    * header Content-Type = 'application/json'
    * def chameleonSession = call read('classpath:chameleon/chameleon.feature')

  Scenario:   retrieve client session
    * def reqBody =
    """
    {
      "uid":"4cad7c391a301223",
      "chameleonSession": "#(chameleonSession.session)",
      "lang":"RU"
    }
"""
    Given path '/ping'
    And request reqBody
    When method post
    Then status 200
    And match response == { "session" : '#notnull' }
    * def hashHeader = responseHeaders['Hash'][0]
    * assert hashHeader!=null


