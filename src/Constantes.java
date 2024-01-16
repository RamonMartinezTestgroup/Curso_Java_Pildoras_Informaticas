
public class Constantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Constantes en Java
		 
		 * Es un espacio en la memoria en el que se guarda un valor que no cambiará en la ejecución del programa.
		 * Se usan porque muchas veces en la ejecución de un programa se deben almacenar valores inmutables.
		 * Se crean anteponiendo la palabra clave final antes de la declaración de la variable. 
		 Ej: final String nombrePkmn = "aron"
		 * Recordar: el valor es inmutable*/
		
		final int a = 5;
		
		System.out.println(a);
		
		/*Tenemos dos tipos de errores:
		 * De compilación: problemas en el código que se deben corregir.
		 * En ejecución: el código parece estar bien, pero arroja un error. Estos errores son capturables.*/
		
		//Convertidor de cms a pulgadas
		
		final double aPulgadas = 0.393701; //Una pulgada son 2.54 cms.
		
		double cms = 6;
		double resultado = cms/aPulgadas;
		System.out.println("En "+cms+" hay "+resultado);
		
		/*---------------------------------------------------*/
		

	}

}
