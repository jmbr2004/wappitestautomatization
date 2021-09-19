# language: es

@Cucumber
Característica: Inicio de sesion en wappi

  esta feature se trata de hacer el inicio de sesion exitoso en la aplicacion wappi.

  Escenario: Inicio de sesion  exitoso
    Dado Que "Mario" entra a la pagina wappi
    Cuando "Mario" ingresa el usuario "Joyce2021" y la contraseña "Ignacio2020" 
    Entonces "Mario" ingresa correctamente al menu principal de la aplicacion wappi se valida el texto "Cerrar Sesión".

  Escenario: Actualizacion usuario exitosa
    Dado Que "Mario" entra a la pagina wappi
    Cuando "Mario" ingresa el usuario "Joyce2021" y la contraseña "Ignacio2020"  
    Cuando "Mario" ingresa la informacion personal da clic en Información personal
    Y "Mario" ingresa los datos: nombre "Maria" apellido "Romero" fecha de nacimiento "11/11/1950" nacionalidad "Colombia" genero "Femenino" y  con foto "gato_4.jpg"
    Y "Mario" da clic en guardar
    Entonces Se muestra a "Mario" un mensaje al usuario indicando que se realizo la actualizacion "Tu información se guardó correctamente".
    
  Escenario: Pedir orden sin cupon bienvenida
    Dado Que "Mario" entra a la pagina wappi
    Cuando "Mario" ingresa el usuario "Joyce2021" y la contraseña "Ignacio2020"  
    Y "Mario" da clic en en pedir producto
    Y "Mario" da clic en confirmar pedido
    Entonces Se muestra a "Mario" un mensaje "Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades"
    
  Escenario: Pedir orden con cupon bienvenida
    Dado Que "Mario" entra a la pagina wappi
    Cuando "Mario" ingresa el usuario "Joyce2021" y la contraseña "Ignacio2020"  
    Y "Mario" da clic en obtener cupon de bienvenida y copia el codigo del cupon
    Y "Mario" da clic en Inicio
    Y "Mario" da clic en en pedir producto
    Y "Mario" da clic en confirmar pedido
    Entonces Se muestra a "Mario" un mensaje "Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades"