Feature: Carrito

   @Smoke @Carrito
  Scenario: Agregar producto al carrito
    Given El cliente se encuentra logueado
    When Hace click en Add to cart del producto "Sauce Labs Backpack"
    Then El contador del carrito muestra un producto agregado

  @Smoke @Carrito
  Scenario: Quitar producto al carrito
    Given El cliente se encuentra logueado
    And El cliente tiene el producto "Sauce Labs Backpack" en el carrito
    When Hace click en Remove
    Then El carrito se muestra en cero

