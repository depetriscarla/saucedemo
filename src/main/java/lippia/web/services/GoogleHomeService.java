package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.GoogleConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class GoogleHomeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void ingresaUsuarioYContraseña(String usuario, String contraseña) {
        setInput(GoogleConstants.INPUT_USERNAME_XPATH,usuario);
        setInput(GoogleConstants.INPUT_PASSWORD_XPATH,contraseña);
    }

    public static void clickBotonLogin() {
        click(GoogleConstants.LOGIN_BUTTON_XPATH);
    }

    public static String obtenerMensajeError() {
        return getText(GoogleConstants.ERROR_MESSAGE_XPATH);
    }

    public static String obtenerCabecera() {
        return getText(GoogleConstants.PRODUCT_HEADER_XPATH);
    }
}
