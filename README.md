# servicioWeb

PROBLEMA 2: SERVICIO WEB

FUE REALIZADO CON:

-ULTIMA VERISON DE ECLIPSE
-JDK v1.8
-APACHE TOMCAT V9.0
-JERSEY v2.28

DETALLES DE LO REALIZADO:

EL SERVICIO WEB CONSTA DE 3 CLASES JAVA:

src.com.clases.tiempo       =  Define la estrucutura de los datos 
			       recibidos y enviados ( contenedor )

src.com.servicio.CorsFilter =  Este archivo es requerido a modo de filtro
                               para el tema de los CORS en las conexciones.
 			       La vinculacion es inmediata gracias al @Provider.

src.com.servicio.Calcular   =  En esta clase se realiza el servicio web, lo 
                               a mensionar son la definicion de los @Path
                               las cuales generan la ruta url para su posterior
			       llamado. Se establece el metodo post y la generación
                               json. En los argumentos de getCustomer se reciben los
 			       parametros anexados en la url del cliente.

WebContent.Web-inf.web.xml  =  Archivo de configuración para el correcto funcionamiento
                               del servicio. Cabe mencionar del agregado a la url del
                               servicio que se encuentra dentro del archivo en el tag
                               <url-pattern>

La url, se basa incialmente por el repositorio del servicio, en mi caso era:



http://localhost:8085  = Servicio local , con los puertos del tomcat 8085.
http://localhost:8085/ServicioWeb =  Nombre del proyecto.
http://localhost:8085/ServicioWeb/rest = definido en el archivo xml <url-pattern>
http://localhost:8085/ServicioWeb/rest/java/vo = por ultimo los nombre de los servicio 
                                                 en el archivo Calcular, @Path



CLIENTE DE PRUEBA: Se encuentra en el proyecto webapp del "problema 3". Se le incorporo 
                   uno pestaña diciendo "problema 2" , para poder realizar las pruebas
                   a este servicio. Cabe mencionar, que el resultado se muestra por consola.
                   importante:  deben cambiar la ruta de coneccion en el proyecto de angular 
                   en la ruta SERVICIO/API.SERVICE.TS a la que utilicen.

