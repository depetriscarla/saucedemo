Feature: Login

  @Smoke @Login
  Scenario: Login con usuario correcto
    Given El cliente se encuentra en la pantalla de login
    When Ingresa usuario standard_user y contraseña secret_sauce
    Then Ingresa a la página de productos

  @Smoke @Login
  Scenario: Login erroneo
    Given El cliente se encuentra en la pantalla de login
    When Ingresa usuario locked_out_user y contraseña secret_sauce
    Then Se muestra el mensaje de error "Epic sadface: Sorry, this user has been locked out."

