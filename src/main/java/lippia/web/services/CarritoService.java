package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.CarritoConstants;


public class CarritoService extends ActionManager {


    public static void agregarAlCarrito() {
        click(CarritoConstants.ADD_TO_CART_BUTTON_XPATH);
    }

    public static String obtenerProductosAgregados() {
        return getText(CarritoConstants.CART_NUMBER_XPATH);
    }

    public static String encontrarBotonRemove() {
        return getText(CarritoConstants.REMOVE_FROM_CART_BUTTON_XPATH);
    }

    public static void clickBotonRemove() {
        click(CarritoConstants.REMOVE_FROM_CART_BUTTON_XPATH);
    }

    public static boolean carritoVacio() {
       boolean existe = ActionManager.isPresent(CarritoConstants.CART_NUMBER_XPATH);
        return !existe;
    }
}
