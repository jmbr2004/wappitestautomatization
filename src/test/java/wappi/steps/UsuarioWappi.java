package wappi.steps;

import static org.junit.Assert.assertFalse;

import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import wappi.pageobject.cupon.WappiOrdenCuponResultado;
import wappi.pageobject.cupon.WappiOrdenSinCupon;
import wappi.pageobject.login.WappiLoginPrincipal;
import wappi.pageobject.login.WappiLoginResultado;
import wappi.pageobject.update.WappiActualizacionResultado;
import wappi.pageobject.update.WappiActualizarPrincipal;
import wappi.steps.impl.IMensajesUsuarioWappi;

public class UsuarioWappi extends ScenarioActor {
	
    String actor;
    
    @Steps (shared = true)
	WappiLoginPrincipal paginaPrincipal;

	@Steps (shared = true)
	WappiLoginResultado paginaResultado;
	
	@Steps (shared = true)
	WappiActualizarPrincipal paginaActualizacion;
	
	@Steps (shared = true)
	WappiActualizacionResultado paginaActualizacionResultado;
	
	@Steps (shared = true)
	WappiOrdenSinCupon paginaSinCupon;
	
	@Steps (shared = true)
	WappiOrdenCuponResultado paginaCuponResultado;

	@Step("#actor ingresa a la pagina principal de Wappi")
    public void ingresaAWappi() {
        paginaPrincipal.setDefaultBaseUrl("https://automation-wappi.vercel.app/login");
        paginaPrincipal.open();
    }

	@Step("#Cuando el usuario ingresa el usuario : {0} y la contraseña : {1}")
	public void inicioSesion(String arg1, String arg2) {
		paginaPrincipal.ingresarUsername(arg1);
		paginaPrincipal.ingresarPassword(arg2);
		paginaPrincipal.realizarLogin();
	}

	@Step("#El usuario ingresa correctamente al menu principal de la aplicacion wappi se valida el texto : {0}")
	public void el_usuario_ingresa_correctamente_al_menu_principal_de_la_aplicacion_wappi_se_valida_el_texto(String arg1) {
		int resultado = paginaResultado.obtenerTextoDeTituloIngreso(arg1); 
		boolean esExitoso = false;
		if(resultado == 1) {
			esExitoso = true;
		}
		
		assertFalse("logueo exitoso", esExitoso); 
	}
	
	@Step("#actor accede a Información Personal")
	public void accederInfPer() {
		paginaActualizacion.darrClicActualizacion();
	}
	
	@Step("#actor ingresa a Información Personal : {0} : {1} : {2} : {3} : {4} : {5} ")
	public void da_clic_en_actualiacion_de_datos(String nombre, String apellido, String fechaNacimiento, String pais, String genero,  String foto) {
		paginaActualizacion.ingresarDatosActualizacion(nombre, apellido, fechaNacimiento, pais, genero, foto);
	}

	@Step("#actor guarda la Información Personal")
	public void guardarActua() {
		paginaActualizacion.realizarActualizacion();
	}
	
	@Step("#actor valida la actualizacion de sus datos con el mensaje : {0}")
	public void validarActualizaciDatos(String mensaje) {
		int resultado = paginaActualizacionResultado.obtenerPopupActualizacion(mensaje); 
		boolean esExitoso = false;
		if(resultado == 1) {
			esExitoso = true;
		}
		
		assertFalse(IMensajesUsuarioWappi.CONFIRMACION_PEDIDO, esExitoso); 
	}
	
	@Step("#actor selecciona el producto a comprar")
	public void compraProductoSinCupon() {
		paginaSinCupon.pedirCompra();
	}
	
	@Step("#actor confirma el producto a comprar")
	public void confirmarProductoSinCupon() {
		paginaSinCupon.confirmarCompra();
	}
	
	@Step("#actor valida la compra realizada exitosa con el mensaje : {0}")
	public void validarCompraSinCupon(String mensaje) {
		int resultado = paginaCuponResultado.validarExitosoCompra(mensaje); 
		boolean esExitoso = false;
		if(resultado == 1) {
			esExitoso = true;
		}
		
		assertFalse(IMensajesUsuarioWappi.CONFIRMACION_PEDIDO, esExitoso); 
	}
}
