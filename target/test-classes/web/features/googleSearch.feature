Feature: As a potential client i need to search in google to find a web site

  @Smoke @Login
  Scenario: Login exitoso
    Given The client is on google page
    When The client search for word Crowdar Academy
    Then The client verify that results are shown properly

  @Smoke @Login
  Scenario: Login erroneo
    Given The client is on google page
    When The client search for word Calidad
    Then The client verify that results are shown properly
