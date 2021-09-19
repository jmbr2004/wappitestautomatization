package wappi.pageobject.cupon;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WappiOrdenSinCupon extends PageObject {

	@FindBy(css = "div.home:nth-child(4) div.home-content table.app-table.offers-table tbody:nth-child(2) tr:nth-child(2) td.align-center:nth-child(7) > button.button.success.offers-table-block-button")
	WebElementFacade botonPedir;
	
	@FindBy(css = "#order-confirm")
	WebElementFacade botonConfirmar;

	public void pedirCompra() {
		
		botonPedir.click();
	}

	public void confirmarCompra() {
		
		botonConfirmar.click();
	}

}
