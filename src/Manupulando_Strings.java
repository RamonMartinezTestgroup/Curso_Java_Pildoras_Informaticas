import javax.annotation.processing.SupportedSourceVersion;

public class Manupulando_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Clase String
		 
		 * String no es un tipo primitivo.
		 * Se almacenan como cualquier otra variable, escribiendo el tipo String, nombre de variable y el valor, que
		 se conoce como instanciar la variable.
		 * La variable se conoce como Objeto, que es lo mismo que instanciar o ejemplarizar.
		 * Algunos de los métodos más usados de la clase String:
		 	* lenght(): longitud de una cadena de caracteres.
		 	* chatAt(n): nos devuelve el valor de la posición n, partiendo en 0. Ej: ramon.charAt(2) = m.
		 	* substring(x,y): devuelve una subcadena dentro de la cadena. "X" es el valor del índice en donde se inicia
		 	el substring (partiendo en 0), e "Y" es la cantidad de carácteres que contará desde el X.
		 	* equals (cadena): compara si dos cadenas son iguales, considera mayúsculas y minúsculas. Devuelve true
		 	si son iguales o false si no lo son.
		 	* equalsIgnoreCase: igual que la anterior, pero no considera mayúsculas y minúsculas. 	 
		 */
		
		String nombre= "Maximiliano";
		System.out.println("Nombre random: "+nombre);
		
		//lenght
		System.out.println("El nombre random tiene "+nombre.length()+" letras.");
		
		//charAt
		System.out.println("La primera letra del nombre random es "+nombre.charAt(0)+".");
		
		//Obteniendo la última letra
		int ultimaLetra; //declaramos una variable numérica
		ultimaLetra = nombre.length(); //obtenemos el largo del nombre
		System.out.println("La última letra del nombre random es "+nombre.charAt(ultimaLetra-1)+"."); /*utilizamos la
		variable y le restamos. Esto porque largo e índice son conceptos diferentes: el largo parte desde 1, y el índice
		parte en 0.*/
		
		/*---------------------------------------------------*/
		
		/*substring: hay dos formas de usarlo:
		 * Entregando solo un parámetro, que determina el punto de inicio y nos entrega la frase desde ese índice hasta
		 el final del string.
		 * Entregando un índice de entrada y salida. El índice de salida es el primer caracter que no se muestra.
		 */
		
		String frase ="Hoy es un estupendo día para aprender a programar en Java";
		String resumen_frase= frase.substring(29,57);
		System.out.println(resumen_frase);
		
		// Obteniendo solo un caracter
		String resumen_frase2= frase.substring(29,30);
		System.out.println(resumen_frase2);
		
		// Modificando el string
		String nueva_frase= frase.substring(0 ,29)+"irnos a la playa y olvidarnos de todo.";
		System.out.println(nueva_frase);
		
		String nueva_frase2= frase.substring(0 ,29)+"irnos a la playa y olvidarnos de todo... y "+frase.substring(29,57);
		System.out.println(nueva_frase2);
		
		/*---------------------------------------------------*/

		// equals y equalsIgnoreCase
		
		String alumno1, alumno2;
		
		alumno1 = "David";
		alumno2 = "david";
		
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
	}

}
