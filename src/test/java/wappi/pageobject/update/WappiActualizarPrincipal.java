package wappi.pageobject.update;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WappiActualizarPrincipal extends PageObject {
	
	@FindBy(xpath = "//input[@id='name']")
	WebElementFacade campoNombre;
	
	@FindBy(xpath = "//input[@id='lastName']")
	WebElementFacade campoApellido;
	
	@FindBy(xpath = "//input[@id='bornDate']")
	WebElementFacade fechaNacimiento;
	
	@FindBy(css = "select ng-valid ng-touched ng-dirty")
	WebElementFacade listaPais;
	
	@FindBy(css = "radio-container")
	WebElementFacade genero;
	
	@FindBy(xpath = "//input[@id='image']")
	WebElementFacade selFoto;
	
	@FindBy(css = "#save-profile")
	WebElementFacade botonGuardar;
	
	@FindBy(linkText = "Información personal")
	WebElementFacade linkActualizar;

	public void darrClicActualizacion() {
		
		linkActualizar.click();
	}

	public void ingresarDatosActualizacion(String nombre, String apellido, String fecha, String pais, String pgenero, String foto) {
		
		campoNombre.type(nombre);
		campoApellido.type(apellido);
		fechaNacimiento.type(fecha);
		upload("gato_4.jpg").to(selFoto);
	}
	
	public void realizarActualizacion() {
		botonGuardar.click();
	}
}
