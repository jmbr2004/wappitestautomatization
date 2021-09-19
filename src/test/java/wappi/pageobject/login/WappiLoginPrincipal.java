package wappi.pageobject.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://automation-wappi.vercel.app/login")
public class WappiLoginPrincipal extends PageObject {

	@FindBy(xpath = "//input[@id='username']")
	WebElementFacade campoUsername;

	@FindBy(xpath = "//input[@id='password']")
	WebElementFacade campoPassword;

	@FindBy(xpath = "//button[normalize-space()='Ingresar']")
	WebElementFacade botonIngresar;
	
	public void ingresarUsername(String username) {
		campoUsername.type(username);
	}

	public void ingresarPassword(String password) {
		campoPassword.type(password);
	}

	public void realizarLogin() {
		botonIngresar.click();
	}
}
