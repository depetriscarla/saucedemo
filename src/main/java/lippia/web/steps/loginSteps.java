package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.GoogleHomeService;
import org.testng.Assert;

public class loginSteps extends PageSteps {

    @Given("^El cliente se encuentra en la pantalla de login$")
    public void home() {
        GoogleHomeService.navegarWeb();
    }

    @When("^Ingresa usuario (.*) y contraseña (.*)$")
    public void search(String usuario, String contraseña) {
        GoogleHomeService.ingresaUsuarioYContraseña(usuario,contraseña);
        GoogleHomeService.clickBotonLogin();
    }

    @Then("Se muestra el mensaje de error {string}")
    public void statVerification(String textoError) {
        String textoWeb = GoogleHomeService.obtenerMensajeError();
        Assert.assertTrue(textoWeb.equals(textoError));
    }

    @Then("Ingresa a la página de productos")
    public void ingresaALaPáginaDeProductos() {
       String header = GoogleHomeService.obtenerCabecera();
       Assert.assertTrue(header.contains("Products"));
    }
}
