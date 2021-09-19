package wappi.pageobject.cupon;

import net.serenitybdd.core.pages.PageObject;

public class WappiOrdenCuponResultado extends PageObject {

    public static final String TITULO_RESULTADO = "//*[@id=\"confirmation-modal\"]/div/p";
    public static final int OK = 1;
    public static final int FAIL = 0;
    
    public int validarExitosoCompra(String mensaje) {
    	return (TITULO_RESULTADO.equals(mensaje)) ? OK : FAIL;
    }
}
