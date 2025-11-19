package lippia.web.steps;

import com.crowdar.core.actions.ActionManager;
import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.CarritoService;
import lippia.web.services.GoogleHomeService;
import org.testng.Assert;

public class carritoSteps {
    @Given("El cliente se encuentra logueado")
    public void elClienteSeEncuentraLogueado() {
        GoogleHomeService.navegarWeb();
        GoogleHomeService.ingresaUsuarioYContraseña("standard_user","secret_sauce");
        GoogleHomeService.clickBotonLogin();
    }

    @When("Hace click en Add to cart del producto {string}")
    public void haceClickEnAddToCartDelProducto(String arg0) {
    CarritoService.agregarAlCarrito();
    }

    @Then("El contador del carrito muestra un producto agregado")
    public void elContadorDelCarritoMuestraUnProductoAgregado() {
       String cantidadCarrito = CarritoService.obtenerProductosAgregados();
        Assert.assertTrue(cantidadCarrito.contains("1"));
    }

    @Given("El cliente tiene el producto {string} en el carrito")
    public void elClienteTieneElProductoEnElCarrito(String producto) {
        CarritoService.agregarAlCarrito();
        elContadorDelCarritoMuestraUnProductoAgregado();
        String existeRemove = CarritoService.encontrarBotonRemove();
        Assert.assertTrue(existeRemove.contains("Remove"));
    }


    @When("Hace click en Remove")
    public void haceClickEnRemove() {
        CarritoService.clickBotonRemove();
    }

    @Then("El carrito se muestra en cero")
    public void elCarritoSeMuestraEnCero() {
        Assert.assertTrue(CarritoService.carritoVacio());
    }
}
