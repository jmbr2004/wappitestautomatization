package stepsDefinitions;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import wappi.steps.UsuarioWappi;
import net.thucydides.core.annotations.Steps;
public class UsuarioDefinicionesDePasos {

	@Steps(shared = true)
	UsuarioWappi usuario;

	@Dado("^Que \"([^\"]*)\" entra a la pagina wappi$")
	public void que_entra_a_la_pagina_wappi(String arg1) {
		usuario.isCalled(arg1);
		usuario.ingresaAWappi();
	}

	@Cuando("^\"([^\"]*)\" ingresa el usuario \"([^\"]*)\" y la contraseña \"([^\"]*)\"$")
	public void ingresa_el_usuario_y_la_contraseña(String arg1, String arg2, String arg3) {
		usuario.isCalled(arg1);
		usuario.inicioSesion(arg2, arg3);
	}

	@Entonces("^\"([^\"]*)\" ingresa correctamente al menu principal de la aplicacion wappi se valida el texto \"([^\"]*)\"\\.$")
	public void ingresa_correctamente_al_menu_principal_de_la_aplicacion_wappi_se_valida_el_texto(String arg1, String arg2) {
		usuario.isCalled(arg1);
		usuario.el_usuario_ingresa_correctamente_al_menu_principal_de_la_aplicacion_wappi_se_valida_el_texto(arg2);
	}

	@Cuando("^\"([^\"]*)\" ingresa la informacion personal da clic en Información personal$")
	public void ingresa_la_informacion_personal_da_clic_en_Información_personal(String arg1) {
		usuario.isCalled(arg1);
		usuario.accederInfPer();
	}

	@Cuando("^\"([^\"]*)\" ingresa los datos: nombre \"([^\"]*)\" apellido \"([^\"]*)\" fecha de nacimiento \"([^\"]*)\" nacionalidad \"([^\"]*)\" genero \"([^\"]*)\" y  con foto \"([^\"]*)\"$")
	public void ingresa_los_datos_nombre_apellido_fecha_de_nacimiento_nacionalidad_genero_y_con_foto(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {
		usuario.isCalled(arg1);
		usuario.da_clic_en_actualiacion_de_datos(arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@Cuando("^\"([^\"]*)\" da clic en guardar$")
	public void da_clic_en_guardar(String arg1) {
		usuario.isCalled(arg1);
		usuario.guardarActua();   

	}

	@Entonces("^Se muestra a \"([^\"]*)\" un mensaje al usuario indicando que se realizo la actualizacion \"([^\"]*)\"\\.$")
	public void se_muestra_a_un_mensaje_al_usuario_indicando_que_se_realizo_la_actualizacion(String arg1, String arg2) {
		usuario.isCalled(arg1);
		usuario.validarActualizaciDatos(arg2);
	}

	@Cuando("^\"([^\"]*)\" da clic en en pedir producto$")
	public void da_clic_en_en_pedir_producto(String arg1) {
		usuario.isCalled(arg1);
		usuario.compraProductoSinCupon();   
	}

	@Cuando("^\"([^\"]*)\" da clic en confirmar pedido$")
	public void da_clic_en_confirmar_pedido(String arg1) {
		usuario.isCalled(arg1);
		usuario.confirmarProductoSinCupon();
	}

	@Entonces("^Se muestra a \"([^\"]*)\" un mensaje \"([^\"]*)\"$")
	public void se_muestra_a_un_mensaje(String arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
	   	usuario.isCalled(arg1);
		usuario.validarCompraSinCupon(arg2);
	}

	@Cuando("^\"([^\"]*)\" da clic en obtener cupon de bienvenida y copia el codigo del cupon$")
	public void da_clic_en_obtener_cupon_de_bienvenida_y_copia_el_codigo_del_cupon(String arg1) {

	}

	@Cuando("^\"([^\"]*)\" da clic en Inicio$")
	public void da_clic_en_Inicio(String arg1) {

	}
}
