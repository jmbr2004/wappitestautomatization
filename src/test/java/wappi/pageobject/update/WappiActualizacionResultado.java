package wappi.pageobject.update;

import net.serenitybdd.core.pages.PageObject;

public class WappiActualizacionResultado extends PageObject {
	
    public static final String TITULO_ACTUALIZACION = "confirmation-modal-info";
    public static final int OK = 1;
    public static final int FAIL = 0;

    public int obtenerPopupActualizacion(String cadena) {
    	return (TITULO_ACTUALIZACION.equals(cadena)) ? OK : FAIL;
    }
}
  