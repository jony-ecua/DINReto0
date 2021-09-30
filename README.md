LIBRERIAS:
---------
	
	-mysql-connector-java-5.1.23-bin.jar (conexion a base de datos)
	-JDK 1.8
	
	TESTEO:
	
	-junit-4.12.jar
	-hamcrest-core-1.3.jar

INDICACIONES PARA MANEJO DEL PROGRAMA
-------------------------------------

El programa contiene dos archivos de propiedades en el paquete "file"

	-config.properties:

		*Parametros que conectan a la base de datos
		*Parametros que controlan que vista (View_Type) o modelo (Model_Type) devolver

		VALORES POSIBLES (RESPETAR MAYUSCULAS):

		View_Type:

			-"T" vista en consola
			-"S" vista en ventana Swing
			-"J" vista en JavaFX

		Model_Type:

			-"F"  mensaje desde archivo propiedades "greeting"
			-"DB" mensaje desde base de datos "greetingdb" (tabla "saludo", columna "greeting")

	-greeting.properties

		*1 Parametro que contiene un saludo
