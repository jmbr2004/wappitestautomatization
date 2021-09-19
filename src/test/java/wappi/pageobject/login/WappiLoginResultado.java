package wappi.pageobject.login;

import net.serenitybdd.core.pages.PageObject;

public class WappiLoginResultado extends PageObject {

    public static final String TITULO_RESULTADO = "//a[normalize-space()='Cerrar Sesión']";
    public static final int OK = 1;
    public static final int FAIL = 0;

    public int obtenerTextoDeTituloIngreso(String tituloDeResultado) {
    	return (TITULO_RESULTADO.equals(tituloDeResultado)) ? OK : FAIL;
    }
}
